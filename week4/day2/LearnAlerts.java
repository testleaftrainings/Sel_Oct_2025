package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
	/**
	 * Exceptions
	 * 1)no alert present exception
	 * 2)unhandled alert exception
	 * @param args
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.accept();
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		//confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		//prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("saranya");
		System.out.println(alert.getText());
		alert.accept();
		
		//sweet ALerts(inspectable)
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}

}
