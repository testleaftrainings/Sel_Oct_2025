package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//instantiate the browser driver
		ChromeDriver driver=new ChromeDriver();
		
		//FirefoxDriver driver1=new FirefoxDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		//get the title of the page
		//String title = driver.getTitle();
		System.out.println(driver.getTitle());
		

	}

}
