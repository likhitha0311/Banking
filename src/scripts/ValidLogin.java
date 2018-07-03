package scripts;

import org.testng.annotations.Test;

import generic.BasetestforRediff;
import generic.Excel;
import pom.LoginPageforRediff;

public class ValidLogin extends BasetestforRediff
{
  @Test
  public void testValidLogin()
  {
	  
	  LoginPageforRediff lp=new   LoginPageforRediff();
	String un=Excel.getcellvalue(PATH, "Sheet1");
	lp.setusername(un);
	String pwd=Excel.getcellvalue(PATH, "Sheet1");
	lp.setusername(pwd);
	lp.clickgo();
  }
}
