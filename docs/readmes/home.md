
![eci.jpeg](..%2Fimg%2Feci.jpeg)
# CSDT Final Delivery - Refactoring Outout API

This is the final delivery of the project for the 2024 semester. The project is an API that allows users to review restaurants and get suggestions based on their preferences.

## Purpose of the Project ✨

Given a project with a **high level of technical debt**, the main purpose of this project is to refactor the codebase to improve code quality, maintainability, and test coverage. The project aims to address code smells, improve the overall structure of the codebase, and implement unit tests for the service layer. The project also focuses on integrating Sonarcloud and GitHub Actions to monitor code quality and automate the build process.

## Outout API 🍔

The Outout API is a RESTful API that allows users to review restaurants and get suggestions based on their preferences. The API provides endpoints to create and read reviews, as well as to get restaurant suggestions based on user preferences. The API is built using Java and Spring Boot, and it uses a PostgreSQL database to store restaurant and review data. The API has a basic authentication mechanism to ensure that only authorized users can access the endpoints based in Oauth2 and JsonTokens.

## Whats Inside 📦

In this Page you will find the sections that were developed during the course of the project, each section contains the progress and the results of the activities that were performed.
If you want to see source code, you can go to the [GitHub Repo](https://github.com/CSDT-ECI/Andres-Marcelo-Outout-Api).

## Initial State 🚦
![estadoInicial.png](..%2Fimg%2FestadoInicial.png)

## Tools and Technologies 🛠️
![TOOLS.png](..%2Fimg%2FTOOLS.png)

## Main Improvements 🚀

- **✨ Java v8 to v21 ✨**: The project was updated to use Java 21, and the dependencies and code that were deprecated were updated.![updatejava.png](..%2Fimg%2Fupdatejava.png)
- **🎉 Swaggger Documentation 🎉**: The project now includes Swagger documentation to provide a clear overview of the API endpoints and their functionalities.![swaggeropenapi.png](..%2Fimg%2Fswaggeropenapi.png)
- **📝 Code Smells Detection📝**: Identified and addressed code smells in the project, including poor separation of concerns, naming conventions, and magic numbers.![codesmellsimg.png](..%2Fimg%2Fcodesmellsimg.png)
- **🔧 Refactoring 🧰**: Refactored the code to decouple the controller, the service, and the repository layer to be able to make unit tests.![refactoringimg.png](..%2Fimg%2Frefactoringimg.png)
- **🧪 Testing Debt 🧪**: Addressed testing debt by implementing unit tests for the service layer and updating integration tests for the controller layer.![testingimg.png](..%2Fimg%2Ftestingimg.png)
- **🚀 Quality Models 🚀**: Integrated Sonarcloud and GitHub Actions to monitor code quality, identify code smells, and automate the build process.![sonarcloudimg.png](..%2Fimg%2Fsonarcloudimg.png)
- **🧽 Clean Code and XP 🧽**: Identified clean code practices and XP values in the project, focusing on simplicity, readability, and maintainability.![cleancode.png](..%2Fimg%2Fcleancode.png)
- **🔧 DevEx and SPACE 🔧**: Analyzed the project based on the Developer Experience and SPACE Productivity Frameworks to improve the overall productivity of the project.![deveximg.png](..%2Fimg%2Fdeveximg.png)
- **🤖 AI Tools - GH Copilot 🤖**: Used Github Copilot to help with the Github Actions workflow and generate code and documentation parts.![copilot.png](..%2Fimg%2Fcopilot.png)
- **🤖 Github Actions new integrations 🤖**: Implemented Github Actions to notify team members when a new pull request is created in MS Teams.![ghactions.png](..%2Fimg%2Fghactions.png)


## Documented Activities 📝

- **Swagger Documentation** -> Documentation Debt 
  ![swagger.png](..%2Fimg%2Fswagger.png)
- **GitHub Actions CI/CD** -> DevOps 
  ![ghactionsimage.png](..%2Fimg%2Fghactionsimage.png)
![ghactionsmsteams.png](..%2Fimg%2Fghactionsmsteams.png)
- **SonarCloud Integration** -> Technical Debt
![sonarcloudimage.png](..%2Fimg%2Fsonarcloudimage.png)
- **Architecture and Design Integrations** -> Architectural Smells
![arquitecturaMejorado.png](..%2Fimg%2FarquitecturaMejorado.png)
