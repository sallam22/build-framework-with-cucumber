package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginsteps {
	WebDriver driver;
	
	@Given("User open site and go to login page")
	public void user_open_site_and_go_to_login_page() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	   
	}
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enter_email_and_password_and_click_on_login_button(String x,String y) {
	    driver.findElement(By.id("email")).sendKeys(x);
	    
	    driver.findElement(By.id("pass")).sendKeys(y);
	    driver.findElement(By.name("login")).click();


	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	   
	}

}
