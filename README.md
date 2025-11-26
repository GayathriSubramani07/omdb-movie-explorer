🌌  OMDB Movie Explorer

A beautiful Galaxy-Neon themed Movie Explorer built using:

✨ Spring Boot (Backend API)
✨ HTML + CSS + JavaScript (Frontend)
✨ Caffeine In-Memory Cache
✨ OMDB Public API Integration

Search, explore, view details, and save your favorite movies — all with a futuristic neon UI.

🚀 Features
🔍 Search Movies

Search any movie, series, or episode.

Results shown in a futuristic neon grid.

🎬 Movie Details Page

Title, Year, Genre

Director, Actors, Language

Box Office, Ratings

Plot summary

Neon-styled layout

⭐ Favorites System

Add/remove movies to local favorites

Favorites stored in localStorage

Beautiful favorites list page

⚡ Performance Features

Caffeine cache for API response caching

Cache expiry: 5 minutes

Max entries: 100

OMDB API calls reduced significantly

🛰 Navigation Flow

✔ Search → Results
✔ Results → Details
✔ Details → Back (returns to SAME search results)
✔ Global Favorites page
✔ State persistence using localStorage

🔧 Backend Setup

1️⃣ Configure API Key

Inside application.properties:
omdb.api.key=YOUR_API_KEY
omdb.api.url=http://www.omdbapi.com/

2️⃣ Install Dependencies

Run inside backend folder:
mvn clean install

3️⃣ Start Backend
mvn spring-boot:run

Backend runs at:
http://localhost:8080

🌐 Frontend Setup

Simply open:
frontend/index.html
Or use Live Server / Apache / Nginx for serving.

🖥️ Backend Endpoint
🔍 Search Movies
GET /api/movies/search?title=batman
🎬 Get Movie Details
GET /api/movies/details?id=tt1234567

⚡ Caching (Caffeine In-Memory Cache)

Configured in:
CacheConfig.java
Settings Used:

Setting	Value
Cache Type	Caffeine
Expiry	5 minutes
Max Size	100 items
Benefits:

✔ Faster repeated searches
✔ Fewer API calls
✔ Better performance

🎨 UI Theme: Galaxy Neon

Radial galaxy backgrounds

Neon gradients

Animated shooting comet

Glowing buttons

Cyberpunk-inspired cards

Every page is built with consistent visual design.

📱 Pages Overview
🏠 Home (index.html)

Search bar + Neon welcome screen

Redirects to results.html?query=SEARCH_TERM

📄 Results (results.html)

Displays search results in neon grid

Click any movie → details page

🎞 Details (details.html)

Full movie info

Add to Favorites

Back button returns to previous results

⭐ Favorites (favorites.html)

List of all favorite movies

Remove favorites

Neon styled cards

📦 Technologies Used
Backend

Spring Boot 3

RestTemplate

Caffeine Cache

Java 17+

Frontend

HTML5

CSS3 (Galaxy Neon Theme)

Vanilla JavaScript

LocalStorage (Favorites)
