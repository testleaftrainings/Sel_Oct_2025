package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		
		//FirefoxDriver driver1=new FirefoxDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//take screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//path
		File destination=new File("./snaps/homepage.png");
		//connect source and destination

		FileUtils.copyFile(source, destination);
		
		//particular textfield
		WebElement user = driver.findElement(By.id("username"));
		File source1 = user.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./snaps/usernamefield.png");
		FileUtils.copyFile(source1, destination1);
	}

}
