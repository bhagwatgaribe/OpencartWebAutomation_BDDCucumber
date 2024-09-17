package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a[title='My Account'] span[class='hidden-xs hidden-sm hidden-md']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement lnkLogin;
	
	public void clickOnMyAccount() {
		js.executeScript("arguments[0].click();", lnkMyAccount);
	}
	
	public void clickOnRegister() {
		lnkRegister.click();
	}
	
	public void clickOnLogin() {
		lnkLogin.click();
	}
}
