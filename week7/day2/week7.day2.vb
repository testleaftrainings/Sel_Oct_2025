3:00 to 3:30 --->ExceptionHandling
3:30 to 4:00 --->Constructor
4:00 to 4:30 --->Encapsulation
4:30 to 4:40 --->Break
4:40 to 5:30 --->POM introduction
5:30 to 5:50 --->Breakout
5:50 to 6:30 --->Seq & Parallel Execution

Exception:
 Abnormal behaviour which stops the pgm Execution.
  1)checked(compile time) Exception:
    due to external factors(i/p error,Network error).
  2)Uncheked(runtime)Exception:execution of pgm.
How to handle the exceptions:
 -using try/catch block

CreateLead of leaftap application:
 Login page---->class
  username--->mthd
  password
  Login
WelcomePage
 click crmsfa
Homepage
 Click leads
my leads
 click CreateLead
CreateLeadPage
 company name
 firstname
 lastname
 click CreateLead
ViewLeadspage

Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends ProjectSpecificMethods Create methods for each action inside each page Inside each method add return statement according to the page navigation if an action stays in the sama page -> return this if an action takes you to another page -> return new Page();
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute