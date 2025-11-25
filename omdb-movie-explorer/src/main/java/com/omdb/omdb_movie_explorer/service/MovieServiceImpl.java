package com.omdb.omdb_movie_explorer.service;

import com.github.benmanes.caffeine.cache.Cache;
import com.omdb.omdb_movie_explorer.model.MovieDetailResponse;
import com.omdb.omdb_movie_explorer.model.MovieSearchResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieService {

    private final RestTemplate restTemplate;
    private final Cache<String, Object> cache;

    @Value("${omdb.api.key}")
    private String apiKey;

    @Value("${omdb.api.url}")
    private String apiUrl;

    public MovieServiceImpl(RestTemplate restTemplate, Cache<String, Object> cache) {
        this.restTemplate = restTemplate;
        this.cache = cache;
    }

    // ---------------- SEARCH MOVIES ----------------
    @Override
    public MovieSearchResponse searchMovies(String title) {

        if (title == null || title.isBlank()) {
            return new MovieSearchResponse();
        }

        String key = "SEARCH_" + title.toLowerCase();

        // 1️⃣ Check cache
        MovieSearchResponse cached = (MovieSearchResponse) cache.getIfPresent(key);
        if (cached != null) {
            System.out.println("🌟 Fetched from CACHE (search): " + title);
            return cached;
        }

        // 2️⃣ Fetch from OMDB API
        String requestUrl = apiUrl + "?apikey=" + apiKey + "&s=" + title;
        MovieSearchResponse response = restTemplate.getForObject(requestUrl, MovieSearchResponse.class);

        // 3️⃣ Save to cache
        if (response != null) {
            cache.put(key, response);
        }

        return response;
    }

    // ---------------- MOVIE DETAILS ----------------
    @Override
    public MovieDetailResponse getMovieDetails(String id) {

        String key = "DETAIL_" + id;

        // 1️⃣ Check cache
        MovieDetailResponse cached = (MovieDetailResponse) cache.getIfPresent(key);
        if (cached != null) {
            System.out.println("🌟 Fetched from CACHE (details): " + id);
            return cached;
        }

        // 2️⃣ Fetch from OMDB API
        String url = apiUrl + "?apikey=" + apiKey + "&i=" + id;
        MovieDetailResponse response = restTemplate.getForObject(url, MovieDetailResponse.class);

        // 3️⃣ Save to cache
        if (response != null) {
            cache.put(key, response);
        }

        return response;
    }
}
