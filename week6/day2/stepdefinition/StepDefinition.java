package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public ChromeDriver driver;
	@Given("Launch the browser and Load the URL")
	public void launch_the_browser_and_load_the_url() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		 driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@When("Enter the username as DemoSalesManager")
	public void enter_the_username_as_demo_sales_manager() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	@When("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("click on Login")
	public void click_on_login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	    String title = driver.getTitle();
	    if (title.contains("Leaftaps")) {
			System.out.println("title matched");
		} else {
			System.out.println("title not matched");
		}
	}

}
