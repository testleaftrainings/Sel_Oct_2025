3:00 to 3:30 --->Actions
3:30 to 4:30 --->TestNG Basics & Seq execution
4:30 to 4:50 --->Breakout
4:50 to 5:00 --->Break
5:00 to 5:30 --->Parallel  execution
5:30 to 5:45 --->Breakout
5:45 to 6:00--->Java wait

softwares required for TestNG:
1)TestNG plugins-compile and executing the testcases.
2)TestNG Dependencies--library which is required for developing the test scripts.

convert normal java script to testng script:
1)convert main mthd into normal method by removing
 a)static and string args[] and name with valid method name
2)Add @Test on top of the method and import it.
3)do right click and run as testng

Parallel execution:
Select the required testcases and create a testng_parallel.xml
Open the xml file and add the attribute parallel ="classes"in the to run classes in parallel
Use the attribute thread-count to control the number of instances to be opened in parallel
To run mutiple tests in parallel add parallel="tests" in
Finally run the xml file

Java Wait:(Thread.sleep):
1)wherever the controlled delays are required
2)it will sleep for the entire duration which is specified.
3)not a global wait.
4)it is not recommended,it slows down the execution process