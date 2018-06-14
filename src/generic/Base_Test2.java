package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Test2 implements Auto_constant {
	
	public WebDriver driver;
	//@Parameters("mybrowser")
	@BeforeMethod
	public void openApplication()
	
	{
		/*if(mybrowser.equalsIgnoreCase("firefox"))
		{
		System.setProperty(Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		}
		else if(mybrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(Gecko_key1, Gecko_value1);
			driver=new ChromeDriver();
		}*/
		
		System.setProperty(Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		
		//driver.get("https://www.seleniumhq.org/");
		//driver.get("https://www.naukri.com/");
		//driver.get("https://my.naukri.com/account/register/basicdetails");
		//driver.findElement(By.xpath("//button[.='I am a Professional']")).click();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	
	@AfterMethod
	
	public void closeApplication()
	{
		//driver.close();
	}
		

}
