function searchMovies() {
  let title = document.getElementById("searchInput").value;

  if (title.trim() === "") {
    alert("Please enter a movie name!");
    return;
  }

  localStorage.setItem("lastSearch", title);   // ⭐ STORE SEARCH QUERY

  window.location.href = `results.html?query=${title}`;
}



function displayMovies(movies) {
    const div = document.getElementById("results");
    div.innerHTML = "";

    if (!movies || movies.length === 0) {
        div.innerHTML = '<div class="no-results">No movies found</div>';
        return;
    }

    movies.forEach(movie => {
        div.innerHTML += `
            <div class="movie-card" onclick="openDetails('${movie.imdbID}')">
                <img src="${movie.Poster !== 'N/A' ? movie.Poster : 'https://via.placeholder.com/180x260'}">
                <div class="movie-info">
                    <div class="movie-title">${movie.Title}</div>
                    <div class="movie-year">${movie.Year}</div>
                </div>
            </div>
        `;
    });
}

function openDetails(id) {
    window.location.href = `details.html?id=${id}`;
}
