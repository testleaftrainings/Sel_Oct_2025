package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement mouseHover = driver.findElement(By.xpath("//span[@class='catText']"));
		//instantiate Action class
		Actions act=new Actions(driver);
		act.moveToElement(mouseHover).perform();//mandatory
		driver.findElement(By.xpath("//span[text()='Casual Shoes']")).click();

	}

}
