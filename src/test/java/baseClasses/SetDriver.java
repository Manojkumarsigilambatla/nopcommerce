package baseClasses;

import org.openqa.selenium.WebDriver;

public class SetDriver {

	public static WebDriver driver;
	public static  Base base;
	
	public static void setUp()
	{
		base = new Base();
		PropertyReader.load();
		base.browserSetUp(PropertyReader.getProperty("browser"));
		driver=base.getDriver();
	}
}
