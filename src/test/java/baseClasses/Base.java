package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;

	public void  browserSetUp(String name)
	{
		System.out.println(name);
		    if(name.equals("Chrome Browser")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow.origins=*");
			this.driver = new ChromeDriver(options);
		    }
		// hello This is manoj changing details
		
	}
	public WebDriver getDriver()
	{
		System.out.println(driver.toString());
		return this.driver;
	}
	
	public  WebDriver setUp()
	{
		PropertyReader.load();
		browserSetUp(PropertyReader.getProperty("browser"));
		return getDriver();
	}
}
