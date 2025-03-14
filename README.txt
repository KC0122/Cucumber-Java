***********************************************************
How to execute the tests ?
*********************************************************
-Clone the repo
-Open Intellije
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


-git config --global user.email "sacakameel@yahoo.co.uk"
-git config --global user.name "KC0122"





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






