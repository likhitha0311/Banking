package scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test2;
import generic.Excel2;
import pom.LoginPage2;

public class Rediff2 extends Base_Test2 {
	LoginPage2 l=new LoginPage2(driver);
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] value=Excel2.getcellvalue("Login");
		return value;
	}
	
	
	@Test(dataProvider="getdata")
	public void testRediffLogin(String username, String password)
	{
		l.passdata(username, password);
	}
	
}
