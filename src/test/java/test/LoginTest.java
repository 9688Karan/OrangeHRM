package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
  
	
	LoginPage lp;

	  
	  @BeforeClass
	  public void initObject() {
		  lp=new LoginPage(driver);
	  }
	  
  @Test
  public void login() {
	  
	  lp.enterCred("Admin","admin123");
	  lp.clickButton();
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Title does not match");
	  
  }
 

	
}
