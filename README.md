# NeighborFit - Neighborhood Lifestyle Matching App
...
This project is for assignment/demo purposes only.
# NeighborFit - Neighborhood Lifestyle Matching App

This project was completed as part of the **Software Development Engineer (SDE) assignment** for **TruEstate**.

---

## 📋 Project Overview
NeighborFit is a full-stack web application that helps users find the top neighborhoods that best match their lifestyle preferences, such as:
- Safety
- Schools
- Nightlife
- Greenery
- Affordability
- Public Transport

The backend is developed using **Spring Boot** (Java) and implements a scoring algorithm that ranks neighborhoods based on user inputs.

---

## 🚀 Features
- Accepts user preferences via API.
- Calculates scores for neighborhoods based on preferences.
- Returns the top 5 matching neighborhoods.
- Implements a clear and simple matching algorithm.

---

## 🏗️ Tech Stack
- **Backend:** Java, Spring Boot
- **Build Tool:** Maven
- **API:** RESTful (JSON-based)
- **Version Control:** Git & GitHub
- **CI:** GitHub Actions (Automated build and verification)

---

## 📡 API Endpoint
**POST** `/api/match`

### Request Body Example:
```json
{
  "safety": 8,
  "schools": 7,
  "nightlife": 5,
  "greenery": 6,
  "affordability": 7,
  "transport": 9
}
### About the Workflow File

The GitHub Actions workflow (`ci.yml`) is located in `.github/workflows/` and runs on every push to the `main` branch. It sets up JDK 17 and builds the Maven project located in the `backend/backend` directory.

This ensures that every code change is automatically built and verified, helping maintain code quality.

