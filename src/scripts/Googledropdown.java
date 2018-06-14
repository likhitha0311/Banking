package scripts;

import org.testng.annotations.Test;

import generic.Base_Test2;
import pom.Googlecreateaccountpage;

public class Googledropdown extends Base_Test2 {
	@Test
	
		public void testGoogledropdown()
		{
			Googlecreateaccountpage gp=new Googlecreateaccountpage(driver);
			gp.chooseoptions();
			
		}
	}


