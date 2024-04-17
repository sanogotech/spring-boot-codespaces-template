# spring-boot-codespaces-template

**spring-boot codespaces template**


To set up a complete Java Spring Boot project template that can be seamlessly used with GitHub Codespaces, you'll need to prepare the basic Spring Boot project structure, add necessary configuration for GitHub Codespaces, and provide some sample code to get started. I’ll walk you through each step, including creating the .devcontainer directory, which is essential for GitHub Codespaces to configure the environment correctly.

##  Spring Boot Project Structure
Below is a basic setup for a Spring Boot application using Maven as the build system:


**Project Directory Structure:**


```css

spring-boot-codespaces-template/
│
├── .devcontainer/
│   ├── devcontainer.json
│   ├── Dockerfile
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               ├── DemoApplication.java
│   │   │               └── controller/
│   │   │                   └── GreetingController.java
│   │   ├── resources/
│   │   │   └── application.properties
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── demo/
│                       └── DemoApplicationTests.java
│
├── .gitignore
├── pom.xml
└── README.md

```

# Demo Application

This is a Spring Boot application designed to demonstrate basic web functionalities using Thymeleaf and Bootstrap for frontend design.

## Features

- Basic Spring Boot setup with Thymeleaf integration.
- Responsive web pages using Bootstrap.
- Simple greeting page linked from the index page.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- Java JDK 11 or newer.
- Maven 3.6+ or Gradle 6.0+ for building and running the application.
- Docker for containerization (optional).

## Getting Started

To get a local copy up and running follow these simple steps:

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/demo-application.git
   cd demo-application
  ```
  
2. Build the project:

 ```bash
mvn clean install
 ```
 
3. Running the Application

To run the application, execute:

 ```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
 ```
 
Or using Maven:

 ```bash
mvn spring-boot:run
 ```

4. Access the application at http://localhost:8080.


5. Using Docker (Optional)

To build a Docker image and run it:

 ```bash
docker build -t demo-application .
docker run -p 8080:8080 demo-application
 ```
 
## Contact: 

Name :  Souleymane  SANOGO
Linkedin : https://www.linkedin.com/in/souleymanesanogo/


## Acknowledgements

- Spring Boot
- Thymeleaf
- Bootstrap
