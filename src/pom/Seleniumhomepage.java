package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Seleniumhomepage extends Base_Page{
	
	//declaration
	
	@FindBy(xpath="//input[@size='30']")
	private WebElement searchtab;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement gobtn;
	
	
	
	
	//initialisation
	
	public Seleniumhomepage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilisation
	
public void clicksearch()
{
	searchtab.sendKeys("java");
}

public void clickgo()
{
	gobtn.click();
}

public void handlealert()
{
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
}
}
