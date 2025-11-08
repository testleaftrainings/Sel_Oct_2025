package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	/**
	 * Nosuch element exception:
	 * 1)locator
	 * 2)wait statements are not given
	 * 3)when element is inside a frame
	 * 
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//handle the frame
		driver.switchTo().frame(0);//index starts with 0
		
		//click
		driver.findElement(By.id("Click")).click();

	}

}
