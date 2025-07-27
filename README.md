🚀 REST API Demo with Docker
Welcome to the REST API Demo Project! This project demonstrates how to build a simple Spring Boot RESTful API and package it using Docker 🐳.

📦 Features
✅ Built with Spring Boot

🔧 Uses Maven for build management

🐳 Packaged as a Docker image

🔥 Simple REST endpoints for testing

📁 Project Structure
src/main/java – Java source files

src/main/resources – Application properties

target/rest-demo.jar – Compiled JAR

Dockerfile – Docker image instructions

🛠️ Technologies Used
☕ Java 17+

🌱 Spring Boot

🐳 Docker

📄 Maven

🧪 How to Run Locally (Docker)
Build the project
mvn clean package

Create Docker image
docker build -t ayush/rest-demo:v1 .

Run Docker container
docker run -p 8080:8080 ayush/rest-demo:v1

Access API
Open browser or Postman:
http://localhost:8080/your-endpoint

📤 Deployment Steps (Docker Manual)
docker run -it openjdk:26-slim-bullseye /bin/bash

docker cp target/rest-demo.jar container_id:/tmp/rest-demo.jar

docker commit --change "CMD [\"java\", \"-jar\", \"/tmp/rest-demo.jar\"]" container_id ayush/rest-demo:v2

docker run -p 8080:8080 ayush/rest-demo:v2

🧠 Author
👨‍💻 Ayushman Giri
📬 Ayushmangiri@gmail.com
🌐 GitHub - Ayushmangiri

❤️ Support
If you like this project, please give it a ⭐ on GitHub.
Feel free to fork and contribute!
