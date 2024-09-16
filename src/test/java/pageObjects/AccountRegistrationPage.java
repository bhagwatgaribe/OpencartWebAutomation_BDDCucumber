package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	JavascriptExecutor jse = (JavascriptExecutor) driver;

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtPhoneNumber;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkPrivacyPolicy;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPhoneNumber(String phone) {
		txtPhoneNumber.sendKeys(phone);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setPasswordConfirm(String pwdCon) {
		txtConfirmPassword.sendKeys(pwdCon);
	}

	public void clickPrivacyPolicy() {
		jse.executeScript("arguments[0].click();", chkPrivacyPolicy);
	}

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	public void clickContinue() {
		jse.executeScript("arguments[0].click();", btnContinue);
	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
