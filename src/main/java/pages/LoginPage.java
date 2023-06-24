package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement button;
	
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	public void enterCred(String user,String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		
	}
	public void clickButton() {
		button.click();
	}
	
	public String getText() {
		return button.getText();
		
		
	}

}
