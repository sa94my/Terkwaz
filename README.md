# Terkwaz

# Terkwaz Assessment project

# Prerequisites
You need to have the following installed in order to run this project 
- Java JDK 
- Maven
- Allure commandline 

# Usage
To run this project 
 - download the source code and import it into your IDE
 - to run the complete suite of tests , run the TestNG.xml file 
 - or you can run individual tests by running their recpective test class

To modify test data edit the files under [src>test>resources]

# Contents
This project contains four main tests classes , 3 GUI tests and one API test 
- Web GUI Test Automation:
    - First Test    [src>test>java>google_tests>TestGoogleSearch]
       - Navigate to "https://www.google.com/ncr" 
       - Search for "selenium webdriver" 
       - Check that the third result text contains "What is Selenium WebDriver?" 
    - Second Test   [src>test>java>herokuApp_tests>TestFileUpload]
       - Navigate to "https://the-internet.herokuapp.com/" 
       - Click on "File Upload" 
       - Upload any small image file 
       - Check that the file has been uploaded successfully 
    - Third Test    [src>test>java>herokuApp_tests>TestDynamicLoading]
       - Navigate to "https://the-internet.herokuapp.com/" 
       - Click on "Dynamic Loading" 
       - Click on "Example 2" 
       - Click "Start" 
       - Wait for loading to finish 
       - Check that the text displayed is "Hello World!" 
- API Test Automation:  [src>test>java>catFacts_API>getOneRandomFact]
    - Navigate to "https://alexwohlbruck.github.io/cat-facts/" 
    - Use the relevant API endpoint to get one random cat fact 
    - Check that the response "text" is not empty