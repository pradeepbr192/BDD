package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefinition {
	
	WebDriver driver;

	@Given("^user is on login page$")
	
	public void useralreadyonloginpage(){
		System.setProperty("webdriver.chrome.driver", "D:\\uiautomation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://freecrm.com/");	
	}
	
	//
	
	//@When("^i enter \\*(.*)\\* and \\*(.*)\\*$")
	@When("^i enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_username_and_password(String username, String password)  {
	    
		String str= driver.getTitle();
				
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service",str);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	    
	}

	@Then("^i land on home page$")
	public void i_land_on_home_page() throws Throwable {
	    
		String str1=driver.getTitle();
		Assert.assertEquals("CRMPRO",str1);
		
		driver.findElement(By.xpath("//td[contains(text(),'automation')]"));
		
		driver.quit();
	    
	}
}
