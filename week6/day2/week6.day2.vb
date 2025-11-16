03:00 to 04:00 -> Excel Integrations with TestCase 
04:00 to 04:35 -> Breakout(20mins) + Break(10 mins)
04:35 to 05:00 -> Common integration
05:00 to 05:30 -> Cucumber Introduction (Feature file) 
05:30 to 06:00 -> Implemenation (Step def and Runner class)
06:00 to 06:20 -> Breakout

Annotation hierarchy:
@beforesuite
 @beforetest
  @beforeclass
   @DataProvider
    @beforeMethod
     @Test

     Steps to do Excel Integration:
Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount
 String[][] data = new String[rowCount][columnCount];


Push=>  stringCellValue to the Array 
data[i-1][j]=stringCellValue;

Close the workbook and return the data 
wBook.close();
 return data;

Change main method to a normal static method
* public static String[][] readExcel(){ }

Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data * * *    @DataProvider(name="fetchData")
 public String[][] sendData() throws IOException { 
	return ReadExcel.readExcel(); 

	return ClassName.method();
	}



Common Integration:

(./data/createLead.xlsx); 
create input args inside method
public static String[][] read(String fileName){
	 (./data/"+fileName+".xlsx) 
	 }

into the BaseClass or PSM and declare a fileName globally
 * public String fileName; ------------ > Global declaration
 
 Cut and paste the DataProvider code from CreateLead Class
 * @DataProvider(name="fetchData") 
  public String[][] sendData() throws IOException { 
	return ReadExcel.readExcel(fileName); }
	
*Create setValues() inside each testcase and annotate with @BeforeTest and
 mention the filename here 
 @BeforeTest
  public void setValues() { 
	fileName="CreateLead"; 
	} 
	

PreRequisites:
1)Cucumber plugins
2)dependencies

Steps to Create the layers of Cucumber Create 3 packages under src/test/java *features *steps *runner

● Steps to Create File :- Creating features package, Mouseover on it & Right Click --> New --> Other... --> Select File under General Folder --> File Click Next ● Set File name as Login.feature & Click Finish ● U can see a new file Created under features package like slice of Cucumber IMG Then it's Fine👍🏻🙂

Gherkin keyword: Feature: Login functionality of Leaftaps Application (Describes the functionality of an appliction)

Scenario: Login with Valid credentials (Represents a testcase) Given Launch the browser -> to represent the precondition of a scenario And Load the url And Enter the username as Demosalesmanager And Enter the password as crmsfa When Click on the Login button -> to represent the test condition
Then Homepage should be displayed -> To represent the positive expected result