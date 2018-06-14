package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlecreateaccountpage {
	@FindBy(xpath="//input[@class='srchTxt ng-pristine ng-valid ng-touched clicked']")
	private WebElement l;
	
	@FindBy(xpath="//div[@class='experience ddwn'  and @option='::experience.yearConfig']/div/ul/li/label/input")
	private List<WebElement> lgbtn;
	
	public Googlecreateaccountpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void chooseoptions()
	{
		l.click();
		System.out.println(lgbtn.size());
		for(int i=0;i<lgbtn.size();i++)
		{
			System.out.println(lgbtn.get(i).getText());
		}
	}
	
	
}
