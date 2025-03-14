***********************************************************
How to execute the tests ?
*********************************************************
Clone the repo
Open Intellije
Click Main mneu
Click on Run option
Click on Edit Configuration
Set Glue  to   stepDefinitions
Click Apply & OK
Click on Build
Click on Re-Build Project

Once done, open the Feature file
Click on Run button next to Feature: key word or Scenario key word

All 4 steps of the Scenario should should pass!





********************************************************
How to create a repo and push your project into GitHub
********************************************************

Create a working project in your computer-All ready to push to repo

Then download Git for Windows
Install

Open yourt git account
Create a new repository by giving a name(note:it's empty, but it's fine)
Back on your pc , in command prompt CD into your project folder

Go back to Git hub page and only copy the first 3 lines of instructions(Note:As per below)
echo "# Cucumber-Java" >> README.md
git init
git add README.md
(you might have to press enter once to execute all of the above commands)

Now make sure you give below 2 commands
git config --global user.email "sacakameel@yahoo.co.uk"
git config --global user.name "KC0122"


Then go back to the repo again
Copy the rest of the 4 lines of code(Note:They are as per below)
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/KC0122/Cucumber-Java.git
git push -u origin main

-This might prompt you to login in to your personal account and authorise the request
-Once done you will see "Read me" file  has been added to the repo


--Now if you want to add further files you can give the below command with correct path names.
git add src\test\java\Features\Registration.feature


git config --global user.email "sacakameel@yahoo.co.uk"
git config --global user.name "KC0122"