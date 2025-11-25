# 🎬 OMDB Movie Explorer

OMDB Movie Explorer is a lightweight full-stack application that allows users to search for movies, view detailed information, and save favorites — powered by the **OMDB API**.

This project includes:

- A **Spring Boot backend** (REST API)
- A **Frontend UI** built with **HTML + CSS + JavaScript**
- **In-memory caching using Caffeine**
- **Responsive UI**
- **Favorites system using LocalStorage**

---

## 🚀 Features

### 🔹 **Search Dashboard**
- Search movies/series using a simple search bar  
- Fast results with caching  
- Displays poster, title, and release year  

### 🔹 **Movie Detail Page**
- High-quality poster  
- Plot, Director, Genre, Actors, IMDb Rating  
- Add to Favorites ❤️  

### 🔹 **Favorites Page**
- Stores user favorites using LocalStorage  
- Beautiful card layout  
- Remove favorite functionality  

### 🔹 **Caching System (Backend)**
- Caffeine cache → 5 minutes TTL  
- Maximum 100 entries  
- Improves performance  
- Reduces OMDB API calls  

### 🔹 **Clean REST API Endpoints**
| Endpoint | Description |
|----------|-------------|
| GET `/api/movies/search?title=Batman` | Search movie by title |
| GET `/api/movies/details?id=tt1234567` | Get full movie details |

---

## 🏗️ Project Structure

omdb-movie-explorer/
│── src/
│ ├── main/
│ │ ├── java/com/omdb/...
│ │ └── resources/application.properties
│── static/
│ ├── index.html
│ ├── details.html
│ ├── favorites.html
│ ├── style.css
│ └── app.js
│── pom.xml
│── README.md

## 🚀 How to Run the Project

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/GayathriSubramani07/omdb-movie-explorer.git
cd omdb-movie-explorer

2️⃣ Open in Eclipse / IntelliJ

Import as Maven Project.

3️⃣ Configure OMDB API Key

Open src/main/resources/application.properties and update:

omdb.api.key=YOUR_API_KEY
omdb.api.url=http://www.omdbapi.com/


➡️ Replace YOUR_API_KEY with your key from https://www.omdbapi.com/apikey.aspx

4️⃣ Run the Spring Boot Application

Run:

OmbdMovieExplorerApplication.java


or in terminal:

mvn spring-boot:run

5️⃣ Open UI in Browser

Open:

http://localhost:8080/index.html


✔ Search movies
✔ View details
✔ Add to favorites

## ✨ Features

- 🔍 Search movies & series by title  
- 🎬 Movie details page (Plot, Director, Actors, Rating, Poster)  
- ⭐ Add movies to Favorites (stored in localStorage)  
- ⚡ Caffeine Cache to reduce OMDB calls  
  - Cache TTL: 5 minutes  
  - Max size: 100  
- 📱 Responsive UI  
- 🎨 Modern gradient design (Purple → Pink → Blue)  
- 🧩 Clean REST APIs  
- 🚀 Runs fully locally
## 📌 Final Notes

This project follows:
- REST standards  
- Clean folder structure  
- Good UI/UX  
- Local caching for performance  
