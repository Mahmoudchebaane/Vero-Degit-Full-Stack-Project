# VeroDegit Full-Stack Porject 

## Description : 
This project is a full-stack web application that combines a backend developed with Spring Boot and a frontend built using React. It is designed to download data from the Art Institute of Chicago via their external API: [https://api.artic.edu/docs/](url).

## Prerequisites

Before you begin, make sure you have the following installed on your machine:

- **Java 17 or higher**: Required for the backend developed with Spring Boot.
- **Maven**: Used for dependency management and building the backend.
- **Node.js (version 16 or higher)**: Required for the frontend developed with React.
- **npm or yarn**: Package manager for the frontend.
- **Git**: If you are cloning the project from a Git repository.

## Installation and Running

### 1. Backend Spring Boot

#### Installation Steps

1. Clone the project from GitHub or extract the `.zip` file:

   ```bash
   git clone https://github.com/your-username/your-repo.git

Or extract the contents of the .zip file.

2. Navigate to the backend folder:
   ```bash
   cd server-side

3. Configure the External API:
Make sure to configure the connection details for the Art Institute of Chicago API in the application.properties or application.yml file:
   ```bash
   external.api.url=https://api.artic.edu/api/v1/artworks
     
4. Build and run the backend:
   ```bash
   mvn clean install
   mvn spring-boot:run

The backend server will be available at [http://localhost:8080](url)

### 2. Frontend React

#### Installation Steps

1. Navigate to the frontend folder:

     ```bash
     cd front-side

2. Install the necessary dependencies:

     ```bash
     npm install
3. Configure the Backend URL:
Ensure the frontend is pointing to the correct backend API URL (e.g., http://localhost:8080). Update the configuration file if needed (e.g., src/config.js).

4. Start the React application:
   ```bash
   npm start
The frontend will be accessible at [http://localhost:3000](url)

### 3. Tests

- **Backend**: To run the backend tests using Maven, execute the following command:
   ```bash
   mvn test
- **Frontend**: To run the frontend tests, use the following command:
   ```bash
   npm test

### 4. Project Structure

Here is the main structure of the project:

```plaintext
veroDegit/
├── .github/      # GitHub-specific files 
│   └── workflows/
│       └── ci.yml   # GitHub Actions CI/CD workflow
├── server-side/   # Backend source code (Spring Boot)
│   ├── src/
│   ├── pom.xml
│   └── application.properties
├── front-side/    # Frontend source code (React)
│   ├── src/
│   ├── package.json
│   └── public/
├── README.md      # Documentation

