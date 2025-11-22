Feature: createLead functionality for Leaftaps application

#Background:
#Given launch the browser and load the URL

Scenario Outline: create lead with multiple data
When Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And click on Login
And click on crmsfa link
And click on leads button
And click on Create leadLink
When enter the companyname as <companyName>
When Enter the first name as <firstName>
And enter the last name as <lastName>
When Click on create lead button
Then View leads page is displayed

Examples:
|companyName|firstName|lastName|
|TCS|Arun|S|
|infosys|uma|R|
|cts|nivedhitha|S|

