package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		/*
		 * Steps to interact with the the webelement:
		 * 1)locate the element(find the element from the dom)
		 * 2)passing the input(sendkeys)
		 * 3)clicking action(click)
		 */
		
				ChromeDriver driver=new ChromeDriver();
			
				driver.get("http://leaftaps.com/opentaps/control/main");
				//maximize
				driver.manage().window().maximize();
				//enter uname
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//password
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//click login
				driver.findElement(By.className("decorativeSubmit")).click();
				//click crmsfa
				driver.findElement(By.partialLinkText("SFA")).click();

	}

}
