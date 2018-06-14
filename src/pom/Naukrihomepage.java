package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Naukrihomepage {
	
	//declaration
	
		@FindBy(xpath="//input[@value='Post your CV']")
		private WebElement uploadbtn;

		
		//initialisation
		
		public  Naukrihomepage(WebDriver driver)
		{
		
			PageFactory.initElements(driver, this);
		}
		
		//utilisation
		
		public void uploadcv()
		{
			uploadbtn.sendKeys("C:\\Users\\acli\\Desktop\\Sample Project.pptx");
		}
}
