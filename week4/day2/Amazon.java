package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//enter phones in search fielid
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		//mobile price
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//create an empty list
		List<Integer> list=new ArrayList<Integer>();
		for (WebElement each : elements) {
			String text = each.getText();
			String replaceAll = text.replaceAll(",", "");
			//convert String to integer
			if (!replaceAll.isEmpty()) {
				int mob = Integer.parseInt(replaceAll);
				list.add(mob);
			}
			
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
