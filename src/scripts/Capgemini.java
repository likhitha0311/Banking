package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import pom.CapgeminiHomepage;

public class Capgemini extends Base_Test {
@Test
	public void TestCapgemini()
	{
		CapgeminiHomepage cp=new CapgeminiHomepage(driver);
		
		cp.clickServices();
		cp.clicktecServices();
		cp.clickSankarbutton();
		cp.clickclosebutton();
		
	}

}
