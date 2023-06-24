package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(className="oxd-userdropdown-tab")
	private WebElement userDropdown;
	

	@FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void Logout() {
		userDropdown.click();
		logoutLink.click();
		
	}

	
}
