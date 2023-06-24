package test;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ScreenShot;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;

public class HomePageTest extends BaseTest  {
	HomePage hp;
	LoginPage lp;
	
	

	
	@BeforeClass
	  public void inItObject() {
		  hp=new HomePage(driver);
		  lp=new LoginPage(driver);
		  
		   }
	
	
	@Test
	  public void LogoutTest() throws InterruptedException {
		
		Thread.sleep(2000);
		hp.Logout();
	  }

}
