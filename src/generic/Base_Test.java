package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_constant {
	public WebDriver driver;
	@BeforeMethod
	
public void openApplication()
	
	{
		System.setProperty(Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		driver.get("https://www.capgemini.com/");
	}
	
	@AfterMethod
	
	public void closeApplication()
	{
		driver.close();
	}
		

}
