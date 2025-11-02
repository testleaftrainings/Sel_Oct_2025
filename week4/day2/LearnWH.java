package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWH {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to get the address of the current window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow );//12DF0E8638A110E389EDA912A7C7DE59,167989401DB1D0CB8209FDDFE7F241E5
		//title of the window
		System.out.println(driver.getTitle());
		//click open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get all the windows
		Set<String> childWindow = driver.getWindowHandles();
		//conver set into List
		List<String> listWindow=new ArrayList<String>(childWindow);
		
		  //navigate to child window 
		driver.switchTo().window(listWindow.get(1));
		  //address of child window 
		String chWindow = driver.getWindowHandle();
		  System.out.println(chWindow); //title of child
		  System.out.println(driver.getTitle());
		  
		  
		  driver.close();//closes the current tab
		  driver.switchTo().window(listWindow.get(1));
		  //driver.quit();//close all the windows which is in open
		 
		/*
		 * for (int i = 0; i<listWindow.size(); i++) { String windows =
		 * listWindow.get(i); driver.switchTo().window(windows);
		 * System.out.println(driver.getTitle()); }
		 */
		

	}

}
