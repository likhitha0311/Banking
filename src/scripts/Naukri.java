package scripts;

import org.testng.annotations.Test;

import generic.Base_Test2;
import pom.Naukrihomepage;

public class Naukri extends Base_Test2{
	
	@Test
	public void testNaukri()
	{
		Naukrihomepage n=new Naukrihomepage(driver);
		n.uploadcv();
		
	}

}
