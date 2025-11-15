package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{
	@Test(dataProvider="fetchData")
	public void runCL(String cName,String fName,String lName) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="fetchData")
	public String[][] SendData() {
		/**
		 * 1)create 2D array
		 * 2)first[]---represents row,second[]--->represents column
		 * 3)assign the data
		 */
		
		String[][] data=new String[3][3];
		data[0][0]="Testleaf";
		data[0][1]="saran";
		data[0][2]="S";
		
		data[1][0]="TCS";
		data[1][1]="Dhanalakshmi";
		data[1][2]="S";
		
		data[2][0]="CTS";
		data[2][1]="ArunSekar";
		data[2][2]="R";
		return data;
	}
}






