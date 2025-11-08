package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
	/**
	 * No such frame Exception
	 *-Default content--->comes out of all the frames and get back to the main page
	 *-parent frame--->navigates to the immediate parent frame
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//switch from parent to child frame
		WebElement nestFrame = driver.findElement(By.xpath("//h5 [contains(text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		driver.switchTo().frame(nestFrame);
		//handle the child frame
		//driver.switchTo().frame("frame2");
		driver.switchTo().frame(0);
		//click
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}

}
