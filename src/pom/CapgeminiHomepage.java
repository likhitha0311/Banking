package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class CapgeminiHomepage extends Base_Page{
	
	//declaration
	
		@FindBy(xpath="//a[@href='https://www.capgemini.com/services/']")
		private WebElement servicestab;
		
		@FindBy(xpath="//a[@href='https://www.capgemini.com/service/technology-operations/']")
		private WebElement tecservicestab;
		
		@FindBy(xpath="//a[@href='https://www.capgemini.com/experts/financial-services/sankar-krishnan/']")
		private WebElement sankarbutton;
		
		@FindBy(xpath="//i[@class='icon-android-close']")
		private WebElement closebutton;
		
		
	//initialisation
		public CapgeminiHomepage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		//utilisation
		
		

		public void clickServices()
		{
			
			servicestab.click();
			
		}
	public void clicktecServices()
	{
		Actions act=new Actions(driver);
		act.moveToElement(tecservicestab).perform();
		
	}

	public void clickSankarbutton()
	{
		sankarbutton.click();
		
	}

	public void clickclosebutton()
	{
		closebutton.click();
		
	}
	}


