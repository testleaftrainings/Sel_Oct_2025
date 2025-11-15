03:00 - 03:45 -> Annotations
03:45 - 04:30 ->  Static Parameterization
04:30 - 05:00 ->  Breakout+Break
05:00 - 05:30 -> Dyanmic Parameterization
05:30 - 05:50 -> Breakout
05:50 - 06:15 -> Screenshot

Annotations hierarchy:
 @BeforeSuite--->at the begining of project
  @BeforeTest--->set up testlevel info
   @BeforeClass--->testcasedetails
    @BeforeMethod---->preconditions
     @Test---->Testcase
    @AFter Method--->post conditions
  @fterClass
 @AfterTest
@AfterSuite

Parameterization:
passing multiple set of data to the testcases.
types:
1)Static---->data which is common across all the testcaes
2)dynamic--->when the datas inside the testcase is parameterized

Steps to implement Static Parameterization: 
Identify the data that are common across all the test cases 
1.Add parameter tag for each data in the XML file ex: url,username,password ,browser 
2.Map the parameters in the class using @Parameters ex: @Parameters({"url","username", "password"})
 Note: The name should exactly match the names in the xml 
 3.Use that parameters inside the method using arguments
Note: Sequence matters but the name of the arguments does not matter 
 4.Finally, replace the arguments with the hardcoded values 
 Note: You should always run from the xml file when you use parameters

Dynamic Parameterization: 
1.Identify the data that are need to be dynamic for the particular testcase ex: CreateLead : companyName, firstName, lastName, phoneNumber EditLead : phoneNumber,companyName 
2.Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider
3.Create an Input array with rowCount and columnCount - add datas into the array with index starting from 0 
4.Return data back to the calling method
5.Receive the data in the testcase uding dataProvider attribute 
6. Pass input arguments to the test method and replace all the hardcoded data

How to read the values from Excel:
1)Apache poi library-->supports .xls & .Xlsx
1)open the WB--->identify the WS--->Identify the row--->identify the cells 
XSSFWorkBook
XSSFsheet
    