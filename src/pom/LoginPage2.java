package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Test2;

public class LoginPage2 {
	
	@FindBy(xpath="//input[@id='login1']")
	private WebElement untbox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pwdbox;
	
	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void passdata(String un, String pwd)
	{
		untbox.sendKeys(un);
		pwdbox.sendKeys(pwd);
	}
	
	
}
