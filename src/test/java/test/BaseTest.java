package test;

import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	
	public static WebDriver driver;
 
  @BeforeSuite
  public void inItBrowser() {
	  WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterSuite
  public void afterSuite() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  driver.quit();
  }

}
