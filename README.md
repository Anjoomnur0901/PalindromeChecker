# PalindromeChecker

## Overview
This is a simple Maven-based Java application that checks whether a given string is a palindrome.  
It ignores punctuation, spaces, and case sensitivity — for example,  
`"A man, a plan, a canal: Panama"` is considered a valid palindrome.

## Project Structure

```
PalindromeChecker
├── src
│   ├── main
│   │   └── java
│   │       └──  PalindromeChecker.java
│   └── test
│       └── java
│           └── PalindromeCheckerTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. Ensure you have [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and [Maven](https://maven.apache.org/download.cgi) installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory:
   ```
   cd PalindromeChecker
   ```
4. Build the project using Maven:
   ```
   mvn clean install
   ```

## Running Tests
To run the tests, execute:
```
mvn test
```

## License
This project is licensed under the MIT License.