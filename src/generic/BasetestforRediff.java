package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BasetestforRediff implements Auto_constant{

	WebDriver driver;
	@BeforeMethod
	@Parameters({"mybrowser","url"})
	public void openApplication( String mybrowser, String url)
	
	{
		if(mybrowser.equalsIgnoreCase("firefox"))
		{
		System.setProperty(Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		}
		else if(mybrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(Gecko_key1, Gecko_value1);
			driver=new ChromeDriver();
		}
		System.setProperty(Gecko_key1, Gecko_value1);
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
}
}
