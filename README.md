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

