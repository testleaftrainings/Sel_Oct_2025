package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {
public static void main(String[] args) throws IOException {
	//step1:set up the report path
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
	reporter.setAppendExisting(true);
	//instantiate extentReports
	ExtentReports extent=new ExtentReports();
	//with the filepath,i need to attach the data with the file
	extent.attachReporter(reporter);
	
	ExtentTest test=extent.createTest("createLead", "CreateLead with multiple data");
	//assign testcategory
	test.assignAuthor("saranya");
	test.assignCategory("smoke");
	//attach steplevel status
	test.pass("username entered sucessfuly",MediaEntityBuilder.createScreenCaptureFromPath("../snaps/homepage.png").build());
	test.fail("pwd not entered successfully");
	//mandatory step
	extent.flush();
	System.out.println("done");
	
	
}
}
