Feature: Iam doing automation of Add Skills,Add Nationality and Add Jobs in Orange HRM application



Background: Common Steps
Given User opens chrome browser
When User opens application URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

@Sanity @Regression
Scenario: Add Skills
Given User enters Username as "Admin" and Password as "admin123"
When User navigates to Skills page
Then User creats Skills record as 
|Skill40001 |Skill40001 desc|
|Skill50001 |Skill50001 desc|
When User logout
And Close browser

@Regression 
Scenario: Add Jobs
Given User enters Username as "Admin" and Password as "admin123"
When User navigates to Jobs page
Then User creats Jobs record as 
|JobTitle  |JobDescription  |JobNote       |
|NonIT 101 |NonIT 101 desc  |NonIT 101 Note|
|NonIT 201 |NonIT 201 desc  |NonIT 201 Note|
When User logout
And Close browser

@Smoke @Progression
Scenario Outline: Add Nationality
Given User enters Username as "Admin" and Password as "admin123"
When User navigates to Nationality page
Then User creats Nationality record enters Nationality Text as <Nationalitytext>  
When User logout
And Close browser

Examples:

|Nationalitytext  |
|"Japan101"       |
|"Japan201"       |






