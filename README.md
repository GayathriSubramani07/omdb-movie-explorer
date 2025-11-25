🎬 OMDB Movie Explorer

A full-stack movie search and details application built using Spring Boot (Java) and a HTML/CSS/JavaScript frontend.
It integrates with the public OMDB API to fetch movie information, while exposing clean REST APIs, implementing local caching, and providing a modern, responsive UI.

⭐ Features
🔍 Search Dashboard

Search movies, series, or episodes by title

Get instant results with posters, titles, and release years

🎬 Movie Detail View

Full movie details:

Plot

Genre

Director

Actors

IMDb Rating

Poster

Stylish and responsive design

⭐ Favorites System

Add movies to Favorites

Saved in localStorage (no backend DB needed)

Remove favorites anytime

⚡ Performance Features (Backend)

Caffeine Cache

TTL: 5 minutes

Max size: 100 entries

Reduces OMDB API calls significantly

Clean RESTful endpoints

API Key handled via application.properties

💻 UI Highlights

Modern gradient theme (Purple → Pink → Blue)

Mobile-friendly

Smooth card hover effects

Clean layout for search, results grid, and details page

🗂 Project Structure
omdb-movie-explorer/
│
├── src/
│   ├── main/
│   │   ├── java/com/omdb/omdb_movie_explorer/
│   │   │   ├── OmdbMovieExplorerApplication.java
│   │   │   ├── config/
│   │   │   │   ├── CacheConfig.java
│   │   │   │   └── RestTemplateConfig.java
│   │   │   ├── controller/
│   │   │   │   └── MovieController.java
│   │   │   ├── model/
│   │   │   │   ├── MovieDetailResponse.java
│   │   │   │   ├── MovieSearchResponse.java
│   │   │   │   └── MovieSummary.java
│   │   │   └── service/
│   │   │       ├── MovieService.java
│   │   │       └── MovieServiceImpl.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html
│   │       │   ├── details.html
│   │       │   ├── favorites.html
│   │       │   ├── app.js
│   │       │   └── style.css
│   │       └── application.properties
│   │
│   └── test/java/...
│
├── pom.xml
└── README.md

🔗 REST API Endpoints (Clean & Simplified)
Method	Endpoint	Description
GET	/api/movies/search?title=Batman	Search movies by title
GET	/api/movies/details?id=tt2975590	Get full movie details by IMDb ID

Backend calls OMDB API internally, applies caching, and returns simplified JSON to the UI.

🚀 How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/GayathriSubramani07/omdb-movie-explorer.git
cd omdb-movie-explorer

2️⃣ Import into IDE

Open in Eclipse or IntelliJ, import as a Maven Project.

3️⃣ Configure OMDB API Key

Open:

src/main/resources/application.properties


Update:

omdb.api.key=YOUR_API_KEY
omdb.api.url=http://www.omdbapi.com/


Get your key here:
👉 https://www.omdbapi.com/apikey.aspx

4️⃣ Run the Backend

Run the Spring Boot app:

mvn spring-boot:run


or run OmdbMovieExplorerApplication.java directly.

Backend starts at:

http://localhost:8080/

5️⃣ Run the UI

Open in browser:

http://localhost:8080/index.html


✔ Search movies
✔ View details
✔ Add to favorites

📦 Tech Stack
Backend

Java 17

Spring Boot

Caffeine Cache

RestTemplate

Maven

Frontend

HTML5

CSS3

JavaScript (Vanilla)

🧪 Testing

Test using the browser or Postman:

Example:

GET http://localhost:8080/api/movies/search?title=superman
GET http://localhost:8080/api/movies/details?id=tt2975590



