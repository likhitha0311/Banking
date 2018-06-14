package scripts;

import org.testng.annotations.Test;

import generic.Base_Test2;
import generic.Excel;
import pom.LoginPage;

public class Rediff extends Base_Test2{
@Test
public void testRediff()
{
	LoginPage l=new LoginPage(driver);
	String un=Excel.getcellvalue(PATH,"Sheet1", 0, 0);
	String pwd=Excel.getcellvalue(PATH,"Sheet1", 0, 1);
	l.setusername(un);
	l.setPassword(pwd);
	l.clickgo();
}
}
