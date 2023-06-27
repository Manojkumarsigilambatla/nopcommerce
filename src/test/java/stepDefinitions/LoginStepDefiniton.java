package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClasses.Base;
import baseClasses.PropertyReader;
import baseClasses.SetDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_Repository.LoginPageRepo;

public class LoginStepDefiniton {
	
	public WebDriver driver;
	public LoginPageRepo loginRepo;
	@Before()
	public void setup()
	{
//		SetDriver.setUp();
		Base base = new Base();
		driver=base.setUp();
		System.out.println(driver.toString());
		loginRepo= new LoginPageRepo(driver);
		
	}

	@Given("User needs to be on page.")
	public void user_needs_to_be_on_page() {
		driver.get(PropertyReader.getProperty("Login_url"));
	    loginRepo.clickAction(loginRepo.getLoginButtonElement());
	    
	}
	@When("User needs to be Enter his\\/her login details")
	public void user_needs_to_be_enter_his_her_login_details() {
	    loginRepo.textBox(loginRepo.getEmailElement(), PropertyReader.getProperty("Email_id"));
	    loginRepo.textBox(loginRepo.getPasswordElement(), PropertyReader.getProperty("Password"));
	    loginRepo.clickAction(loginRepo.getSubmitButton());
	}
	@Then("User must be logged in to his\\/her Account.")
	public void user_must_be_logged_in_to_his_her_account() {
		Assert.assertEquals("nopCommerce demo store",driver.getTitle());
	}
	
}
