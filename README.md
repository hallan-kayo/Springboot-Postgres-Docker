# Springboot-Postgres-Docker

Project to implement a Spring Boot application and PostgreSQL database using Docker containers.

## Prerequisites

Before you start, make sure you have the following installed on your machine:

- Docker: You can download Docker from [here](https://www.docker.com/products/docker-desktop).
- Maven: If you don't have Maven installed, follow this tutorial to install it: [Maven Installation Guide](https://maven.apache.org/install.html).

## How to raise the container

Follow these steps to build and run the Docker containers for the Spring Boot application and PostgreSQL database:

1. **Clone the repository:**

   Open a terminal and run the following command to clone the repository:

   ```bash
   git clone https://github.com/hallan-kayo/Springboot-Postgres-Docker.git

2. **Navigate to the project directory:**
   ```bash
   cd Springboot-Postgres-Docker

3. **Compile the project using Maven:**
   ```bash
   mvn clean package

4. **Build and run the Docker containers:**
   ```bash
   docker-compose up --build -d

5. **Verify that the containers are running:**
   ```bash
   docker ps

6. **Access your application:**
  - Your Spring Boot application should now be accessible at http://localhost:8080.
  - The PostgreSQL database will be accessible on port 5432.

## Useful links:
  - [Docker Documentation](https://docs.docker.com/)
  - [Maven Documentation](https://maven.apache.org/guides/index.html)
