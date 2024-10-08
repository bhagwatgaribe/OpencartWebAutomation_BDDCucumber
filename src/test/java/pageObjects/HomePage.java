package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement lnkLogin;
	
	public void clickOnMyAccount() {
		lnkMyAccount.click();
	}
	
	public void clickOnRegister() {
		lnkRegister.click();
	}
	
	public void clickOnLogin() {
		lnkLogin.click();
	}
}
