package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='user-name']") WebElement saucedemo_uname;
	@FindBy(xpath="//input[@id='password']") WebElement saucedemo_pass;
	@FindBy(xpath="//input[@id='login-button']") WebElement saucedemo_btn;
	@FindBy(xpath="//span[@class='title']") WebElement title;
	
//	public void setCredentials(String uname,String pass) {
//		saucedemo_uname.sendKeys(uname);
//		saucedemo_pass.sendKeys(pass);
//	}
	public WebElement setUsername() {
		return saucedemo_uname;
	}
	public WebElement setPassword() {
		return saucedemo_pass;
	}
	public void setClick() {
		saucedemo_btn.click();
	}
	public boolean setTitle() {
		return title.isDisplayed();
	}
}
