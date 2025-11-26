**🌌 OMDB Movie Explorer – Galaxy Neon Edition
**
A beautiful Galaxy-Neon themed Movie Explorer built using:

✨ Spring Boot (Backend API)
✨ HTML + CSS + JavaScript (Frontend)
✨ Caffeine In-Memory Cache
✨ OMDB Public API Integration

Search, explore, view details, and save your favorite movies — all with a futuristic neon UI.

**🚀 Features**
**🔍 Search Movies**

Search any movie, series, or episode.

Results displayed in a futuristic neon grid.

**🎬 Movie Details Page**

Title, Year, Genre

Director, Actors, Language

Box Office, IMDb Rating

Plot summary

Neon-styled modern layout

**⭐ Favorites System**

Add/remove movies to favorites

Favorites stored in localStorage

Stylish favorites list page

**⚡ Performance Features**

Caffeine cache used for API caching

Cache expiry: 5 minutes

Max entries: 100

API calls reduced significantly

**🛰 Navigation Flow**

✔ Search → Results

✔ Results → Details

✔ Details → Back (same search results retained)

✔ Global Favorites Page

✔ Auto state persistence via localStorage

**🔧 Backend Setup**

**1️⃣ Configure API Key**

Inside application.properties:

omdb.api.key=YOUR_API_KEY
omdb.api.url=http://www.omdbapi.com/

**2️⃣ Install Dependencies**

Run inside the backend folder:

mvn clean install

**3️⃣ Start Backend**
mvn spring-boot:run


Backend runs at:

👉 http://localhost:8080

**🌐 Frontend Setup**

Simply open:

frontend/index.html


Or serve using:

Live Server (VS Code) Apache / Nginx Any static hosting

**🖥️ Backend Endpoints**

**🔍 Search Movies**
GET /api/movies/search?title=batman

**🎬 Get Movie Details**
GET /api/movies/details?id=tt1234567

**⚡ Caching (Caffeine In-Memory Cache)**

Configured in:

CacheConfig.java

Setting	Value
Cache Type	Caffeine
Expiry	5 minutes
Max Size	100
Benefits

✔ Faster repeated searches

✔ Fewer OMDB API calls

✔ Smooth performance


**🎨 UI Theme: Galaxy Neon**

Radial galaxy backgrounds

Neon gradients and glow effects

Animated shooting comet

Glowing neon buttons

Cyberpunk-inspired movie cards

A visually consistent futuristic interface across all pages.

**📱 Pages Overview**
**🏠 Home – index.html**

Neon welcome screen

Search bar

Redirects to:
results.html?query=YOUR_SEARCH_TERM

**📄 Results – results.html**

Displays search results in a neon grid

Clicking a movie opens the details page

**🎞 Details – details.html**

Displays full movie details

Add to Favorites

Back button returns to same search results

**⭐ Favorites – favorites.html**

Shows saved favorite movies

Remove movies from favorites

Neon styled cards

**📦 Technologies Used**
**Backend**

Spring Boot 3

Java 17+

RestTemplate

Caffeine Cache

**Frontend**

HTML5

CSS3 (Galaxy Neon Theme)

JavaScript (Vanilla)

LocalStorage
