package generic;

import org.openqa.selenium.WebDriver;

public class Base_Page  {
	
	public static WebDriver driver;

	public Base_Page(WebDriver driver)
	{
		this.driver=driver;
	}
}
