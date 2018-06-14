package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='login1']")
	private WebElement untbox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwdbox;
	@FindBy(xpath="//input[@value='Go']")
	private WebElement gobtn;

	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un)
	{
		 untbox.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		pwdbox.sendKeys(pwd);
	}
	
	public void clickgo()
	{
		gobtn.click();
	}
}


