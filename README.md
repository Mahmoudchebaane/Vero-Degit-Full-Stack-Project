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
- **IDE**:
  - **IntelliJ IDEA**: Recommended for working with the Spring Boot backend.
  - **Visual Studio Code (VS Code)**: Recommended for working with the React frontend.
- **Postman**: API testing tool for validating and exploring backend endpoints.


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
     
4. Build and Run the Backend with IntelliJ IDEA:

   - **Open the backend project in IntelliJ IDEA**.
   - **Build the project**:
      - Navigate to **Build** in the top menu.
      - Select **Build Project** (or press **Ctrl+F9**).
   
   - **Run the backend**:
      - To run the Spring Boot application, click the green play button next to the `Application` class (the class containing the `main` method) or configure the run configuration:
      - Go to **Run > Edit Configurations**.
      - Click the **+** button and choose **Spring Boot**.
      - Set the correct main class (VerodegitApplication) and click **OK**.
      - Then click the **Run** button (green play icon) to start the backend server.
#### Test the Backend APIs using Postman:
1. Open Postman and create a new collection.
2. Add requests for each endpoint you want to test.
3. Use the backend URL and test GET methods by providing the required parameters.
4. Ensure the backend is running before sending requests.

### 2. Frontend React

#### Installation Steps

1. Navigate to the frontend folder:

     ```bash
     cd front-side

2. Install the necessary dependencies:

     ```bash
     npm install
     ```
    The frontend of this project uses **MUI (Material-UI)** for styling and UI components. 
    To ensure the project works correctly, you need to install the required MUI packages. Run the following command in the frontend directory:
   ```bash
    npm install @mui/material @emotion/react @emotion/styled
    npm install @mui/material @mui/styled-engine-sc styled-components
    npm install @mui/icons-material
   ```
    **Why MUI?**

    MUI provides a robust, customizable, and accessible library of foundational and advanced UI components for React. It simplifies creating visually appealing and responsive designs.
    For more details about MUI, visit the official documentation [https://mui.com/](url).

3. Configure the Backend URL:
    - Create a **.env** file in the root of your frontend project (if it doesn't already exist)
    - Declare a variable for the backend API URL in the **.env** file:
     ```bash
     REACT_APP_API_URL=http://localhost:8080
     ```

4. Start the React application:
   ```bash
   npm start
The frontend will be accessible at [http://localhost:3000](url)

### 3. Project Structure

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
   ```

### 4. Author
- **Name**: Chebaane Mahmoud
- **Contact**: [chebaane.mahmoud@gmail.com](url)



