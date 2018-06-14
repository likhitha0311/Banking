package scripts;

import org.testng.annotations.Test;

import generic.Base_Test2;
import pom.Seleniumhomepage;

public class Selenium extends Base_Test2{
	
	@Test
	public void testSelenium()
	{
		Seleniumhomepage s=new Seleniumhomepage(driver);
		s.clicksearch();
		s.clickgo();
		s.handlealert();
		
	}
	

}
