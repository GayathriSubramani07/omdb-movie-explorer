function searchMovies() {
    let title = document.getElementById("searchInput").value;

    if (title.trim() === "") {
        alert("Please enter a movie name!");
        return;
    }

    fetch(`http://localhost:8080/api/movies/search?title=${title}`)
        .then(response => response.json())
        .then(data => {
            console.log(data);
            displayMovies(data.search || data.Search); // handle both cases
        })
        .catch(error => {
            console.error("Error:", error);
        });
}

function displayMovies(movies) {
    let resultsDiv = document.getElementById("results");
    resultsDiv.innerHTML = ""; // clear previous results

    if (!movies || movies.length === 0) {
        resultsDiv.innerHTML = "<h2>No movies found.</h2>";
        return;
    }

    movies.forEach(movie => {
        let card = `
            <div class="movie-card" onclick="openDetails('${movie.imdbID}')">
                <img src="${movie.Poster}" alt="Poster">
                <div class="movie-title">${movie.Title}</div>
                <div class="movie-year">${movie.Year}</div>
            </div>
        `;
        resultsDiv.innerHTML += card;
    });
}

function openDetails(id) {
    // Send user to details page with IMDb ID
    window.location.href = `details.html?id=${id}`;
}
