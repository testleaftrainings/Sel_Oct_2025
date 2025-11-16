package commonintegration;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;
	public String excelFileName;
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcelIntegration.readData(excelFileName);
	}
	
	/*
	 * @BeforeSuite public void startReports() {
	 * System.out.println("reports started"); }
	 * 
	 * @BeforeClass public void testcaseDetails() {
	 * System.out.println("testcase details are assigned"); }
	 * 
	 * @AfterSuite public void stopReports() {
	 * System.out.println("reports stopped"); }
	 * 
	 * @BeforeTest public void setValues() {
	 * System.out.println("values are assigned"); }
	 */
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preCondns(String browser,String url,String uName,String pwd) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("guest");
			
			driver = new ChromeDriver(options);
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postCondns() {
		driver.close();
	}

}
