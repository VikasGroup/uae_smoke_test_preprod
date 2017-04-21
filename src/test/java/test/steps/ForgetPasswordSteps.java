package test.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vikas.UAE_SmokeTesting_PgObjects.pages.ForPwdCountPgObject;
import vikas.UAE_SmokeTesting_PgObjects.pages.ForgetPassword;
import vikas.UAE_SmokeTesting_PgObjects.pages.LoginPage;



public class ForgetPasswordSteps {

	@Steps
	@Managed
	WebDriver driver;
	LoginPage loginPage;
	ForgetPassword forgetPassword;
	ForPwdCountPgObject forPwdCountPgObject;

	@When("^user click on forgot pwd$")
	public void user_click_on_forgot_pwd() throws Throwable {
		loginPage.clickForPwd();

	}

	@When("^user enter customer IR ID \"([^\"]*)\"$")
	public void user_enter_customer_IR_ID(String arg1) throws Throwable {
		forgetPassword.enterEmail(arg1);

	}

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		forgetPassword.clickSubmit();
	}

	@Then("^Click on countinue button$")
	public void click_on_countinue_button() throws Throwable {
		Thread.sleep(5000);
		forPwdCountPgObject.clickCountinue();
	}

	@Then("^Click on Ok button on popup$")
	public void click_on_Ok_button_on_popup() throws Throwable {

	}
}
