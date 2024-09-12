# Description
## This is a demo website from GURU99 for practicing automation testing.
# Technologies 
1. Java Programing language
2. OOP principles
3. Selenium WebDriver
4. Maven
5. TestNG
6. POM design pattern
7. Allure Report
# Pre-requistes 
1. Install Intellij IDE
2. Install Java
# How to run
1. Download the code or ZIP file and extract it
2. Open Intellij IDE and from File choose open project
3. Select the location of the project and open it
4. Open the pom.xml file and make sure that you use the last verison of dependancies (you can use "Maven Dependancies" website to check versions)
5. Run the Regression.xml file
6. A new folder called Allure-results will be generated after running the code
7. Right click on the folder and from Allure meniu choose Serve
8. A web page will open contains the Report of test cases
# Note
## You may get an error "user name or password is incorrect" while running the scripte
 This may happen becouse the login credintials are valid for only 20 days.
To solve this error follow these steps:
1. Go to https://www.guru99.com/live-selenium-project.html
2. Register in the project by your email address
3. An email will be sent to you contains the new login credintials
4. Change the userID and password in the TestBase, LoginTest and ChangePasswordTest classes by the new userID and Password
5. Re-run the script again and the error won`t be exist.
