# PlaywrightJava
Scalable Playwright Test Repository using Java. This project provides a scalable Playwright-based test framework for Java using RestAssured for API testing, TestNG for running tests, and Maven for dependency management. The framework allows you to automate browser-based tests and perform HTTP API requests.

## Installation

To get started, follow these steps:

Prerequisites

Make sure you have the following installed:
	•	Java (version 8 or later)
	•	Maven (for managing dependencies and building the project)
	•	Node.js (for Playwright dependencies)
	•	Playwright (for browser automation)

Steps
	1.	Clone the Repository:
        git clone https://github.com/your-repo/scalable-playwright-test-java.git
        cd scalable-playwright-test-java
    2.	Install Java Dependencies:
        Ensure that you have Java installed. Check by running:
        java -version (Install if not present)
    3.	Install Maven Dependencies:
        Install Maven if it’s not already installed by following the Maven installation guide. To install the project dependencies:
         mvn clean install
    4. 	Install Playwright Browsers:
        You need to install the Playwright browsers for automation. From the root directory of the project, run the following:

## Running Tests

Once everything is set up, you can run the tests using Maven and TestNG.

1. Run All Tests:

To execute all tests in the src/test/java directory: mvn test
o run a specific test class: mvn -Dtest=TestClassName test

## Project Structure

Here is an overview of the project structure:
scalable-playwright-test-java/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── automation/
│   │               └── helpers/
│   │                   └── HttpRequestHelper.java
│   │                   └── HttpHelper.java
│   │               └── TestClass.java
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── automation/
│   │               └── tests/
│   │                   └── ApiTest.java
└── pom.xml

	•	HttpHelper.java: Contains methods for making HTTP requests using RestAssured.
	•	TestClass.java: A template for browser tests with Playwright.
	•	ApiTest.java: Sample API test class using RestAssured.
	•	pom.xml: Maven configuration file.

## Contributing

 Contributions are welcome to improve this framework! Please follow these steps to contribute:
	1.	Fork the repository.
	2.	Clone your fork and create a new branch.
	3.	Make your changes and commit them.
	4.	Push to your fork and create a pull request.


