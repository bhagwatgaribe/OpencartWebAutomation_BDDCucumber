package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[normalize-space()='My Account']") // MyAccount Page heading
	WebElement msgHeading;

	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;

	public String isMyAccountPageExists() // MyAccount Page heading display status
	{
		try {
			return (msgHeading.getText());
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}

	public void clickLogout() {
		lnkLogout.click();
	}

}
