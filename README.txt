********************************
What's this all about?
************************************

-This is a simple demo project for QAs who are keen to learn test automation skills.
-This is a simple Test Automation project, developed using Java+Cucumber+Maven

What does it test?
-It will launch a browser,
-will navigate to a website
-and will check if a certain text exists or not(i.e in this case "ORANGE CRM")
-If exists, it will "Pass" the test else it will "Fail" the test

-Cucumber Feature File
  For this project, I have ONLY added one feature file


Scenario:
    Given I Launch the browser
    When  I provide the URL for Home page of orangecrm.com
    Then  Home page is loaded and checks if the text 'Orange CRM' exists or not
    And   Close browser

    And it was implemented in the "newUserRegistrationsteps" class inside stepDefinitions folder

-To run the test, simply open the TestRunner folder
-And Right click on cucumberRunner
-And click on Run cucumberRunner button

-Wait for the magic to happen!!You should see the test results on the panel below(If you are using IntelliJ and if not, you should!)


-In addition, below I have added ...lessons learned section, explaining the issues which one might encounter
and possible solutions to prevent/solve/fix those issues!



***********************************************************
How to execute the tests ?
*********************************************************
-Clone the repo
-Open IntelliJ
-Click Main menu
-Click on Run option
-Click on Edit Configuration
-Set Glue  to   stepDefinitions
-Click Apply & OK
-Click on Build
-Click on Re-Build Project

Once done, open the Feature file
Click on Run button next to Feature: key word or Scenario key word

All 4 steps of the Scenario should  pass!





********************************************************
How to create a repo and push your project into GitHub
********************************************************

Create a working project in your computer-All ready to push to repo

Then download Git for Windows
Install

Open your git account
Create a new repository by giving a name(note:it's empty, but it's fine)
Back on your pc , in command prompt CD into your project folder

Go back to Github page and only copy the first 3 lines of instructions(Note:As per below)
-echo "# Cucumber-Java" >> README.md
-git init
-git add README.md
(you might have to press enter once to execute all of the above commands)

Now make sure you give below 2 commands
-git config --global user.email "sacakameel@yahoo.co.uk"
-git config --global user.name "KC0122"


Then go back to the repo again
-Copy the rest of the 4 lines of code(Note:They are as per below)
-git commit -m "first commit"
-git branch -M main
-git remote add origin https://github.com/KC0122/Cucumber-Java.git
-git push -u origin main

-This might prompt you to login in to your personal account and authorise the request
-Once done you will see "Read me" file  has been added to the repo


--Now if you want to add further files you can give the below command with correct path names.
git add src\test\java\Features\Registration.feature


-git config --global user.email "YOURemail@y...com"
-git config --global user.name "XXXX"





*************************************************************
Some of the errors and Lessons learned from them
*************************************************************

-When Creating the Feature file don't leave a space between the word Feature and : It  will throw an error
-Make sure that -Set Glue  value is set to  stepDefinitions
-Also Feature or Folder path is set as per below(Full path.Even though this is normally autopopulated)
D:/Myprojects/Selenium-Cucumber-Java/Cucumber_Project1/src/test/java/Features/Registration.feature
-When creating a Test Runner file make sure you add below two parameters for @CucumberOptions.You don't need to give absolute path
If you did, it might throw an error!
@CucumberOptions(features="src/test/java/Features/Registration.feature",glue="stepDefinitions")

-When running you might see below warnings.These are nothing to do with your tests so you can either ignore this..This is Javalogin framework, complaining about missing dependencies
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
-Or else you can fix it by copying the dependency from the Maven projects https://mvnrepository.com/
 search for org.slf4j






