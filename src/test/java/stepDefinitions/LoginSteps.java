package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class LoginSteps {

	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	MyAccountPage map;

	@Given("the user navigates to login page")
	public void the_user_navigates_to_login_page() {
		BaseClass.getLogger().info("Goto My Account -->Click on Login");
		hp=new HomePage(BaseClass.getDriver());
		hp.clickOnMyAccount();
		BaseClass.getLogger().info("Clicked on My Account Link");
		hp.clickOnLogin();
		BaseClass.getLogger().info("Clicked on Login Link");
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
		BaseClass.getLogger().info("Entering email and password");
		lp=new LoginPage(BaseClass.getDriver());
		lp.setEmail(email);
		lp.setPassword(pwd);
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
		lp.clickLogin();
		BaseClass.getLogger().info("Clicked on Login button");

	}

	@Then("the user should be redirected to the MyAccount Page")
	public void the_user_should_be_redirected_to_the_my_account_page() throws InterruptedException {
		map=new MyAccountPage(BaseClass.getDriver());
		Thread.sleep(3000);
		boolean targetPage = map.isMyAccountPageExists();
		Assert.assertEquals(targetPage, true);
	}
}
