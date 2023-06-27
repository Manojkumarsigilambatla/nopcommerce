package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginPageRepo {
	
	WebDriver driver;
	public LoginPageRepo(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver,this);
	}
    
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement loginButton;
	
    @FindBy(xpath="//input[@id='Email']")
    WebElement email;
    
    @FindBy(xpath="//input[@id='Password']")
    WebElement password;
	
  
    
    @FindBy(xpath="//button[text()='Log in']")
    WebElement submit;
    
    public WebElement getLoginButtonElement()
    {
    	return loginButton;
    }
    
    public WebElement getEmailElement()
    {
    	return email;
    }
    public WebElement getPasswordElement()
    {
    	return password;
    }
    public WebElement getSubmitButton()
    {
    	return submit;
    }   
    
    public void textBox(WebElement element,String value)
    {
    	element.sendKeys(value);
    }
    public void clickAction(WebElement element)
    {
    	element.click();
    }
	
}
