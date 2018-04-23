package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefinition {
	
	WebDriver driver;

	@Given("^user is on login page$")
	
	public void useralreadyonloginpage(){
		System.setProperty("webdriver.chrome.driver", "D:\\JAR files\\chromedriver.exe");
		driver.get("www.freecrm.com/");	
	}
	
	@When("^i enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String str= driver.getTitle();
				
		Assert.assertEquals("FREE CRM in the cloud software boosts sales",str,"Title is not valid" );
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pradeep");;
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("welcome");;
		
	    throw new PendingException();
	}

	@Then("^i land on home page$")
	public void i_land_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String str1=driver.getTitle();
		Assert.assertEquals("CRMPRO",str1);
		driver.findElement(By.xpath("//td[contains(text(),'User: test automation')]"));
	    throw new PendingException();
	}
}
