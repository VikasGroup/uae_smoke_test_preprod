package test.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import util.TpGenerator;
import vikas.UAE_SmokeTesting_PgObjects.pages.AnonymouspurchaseReg;
import vikas.UAE_SmokeTesting_PgObjects.pages.LoginPage;
import vikas.UAE_SmokeTesting_PgObjects.pages.Registration;
import vikas.UAE_SmokeTesting_PgObjects.pages.RegistrationConfirmation;

public class IRRetailReg {
	private static final String SECONDS = null;
	@Steps
	@Managed

	WebDriver driver;

	LoginPage loginPage;
	Registration registration;
	RegistrationConfirmation registrationConfirmation;
	AnonymouspurchaseReg anonymouspurchaseReg;

	@When("^user click on become a Bus Asso$")
	public void user_click_on_become_a_Bus_Asso() throws Throwable {
		Thread.sleep(2000);
		loginPage.clickIRReg();
		Thread.sleep(2000);
	}

	@When("^user click on become a Retail Customer$")
	public void user_click_on_become_a_Retail_Customer() throws Throwable {
		Thread.sleep(2000);
		loginPage.clickRetailReg();
		Thread.sleep(2000);
	}

	@When("^user select registration type \"([^\"]*)\"$")
	public void user_select_registration_type(String arg1) throws Throwable {
		registration.selectRegType(arg1);
		Thread.sleep(2000);

	}

	@When("^user enter referrer ir id \"([^\"]*)\"$")
	public void user_enter_referrer_ir_id(String arg1) throws Throwable {

		registration.enterRefID(arg1);
	}

	@When("^user enter name \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_name(String arg1, String arg2, String arg3) throws Throwable {
		registration.selectTitle(arg1);
		registration.enterFname(arg2);
		registration.enterLname(arg3);

	}

	@When("^user select date of birth \"([^\"]*)\"$")
	public void user_select_date_of_birth(String arg1) throws Throwable {
		registration.enterBday(arg1);

	}

	@When("^user select language \"([^\"]*)\"$")
	public void user_select_language(String arg1) throws Throwable {

	}

	@When("^user enter mobile phone no \"([^\"]*)\"$")
	public void user_enter_mobile_phone_no(String arg1) throws Throwable {
		registration.enterMobil("97186007" + String.valueOf(TpGenerator.getTP(9000, 1000)));

	}

	@When("^user enter email Address \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_email_Address(String arg1, String arg2) throws Throwable {
		registration.enterEmail(arg1);
		registration.enterReEmail(arg2);
	}

	@When("^user enter PWD \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_PWD(String arg1, String arg2) throws Throwable {
		registration.enterPWD(arg1);
		registration.reEnterPWD(arg2);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,900)", "");

	}

	@When("^user enter Address \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_Address(String arg1, String arg2, String arg3) throws Throwable {
		registration.enterAdd(arg1);
		registration.enterCity(arg2);
		registration.enterZip(arg3);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		registration.clickCount();
		Thread.sleep(10000);
	}

	@When("^user enter retail Address \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_retail_Address(String arg1, String arg2, String arg3) throws Throwable {
		registration.enterAdd(arg1);
		registration.enterCity(arg2);
		registration.enterZip(arg3);
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		registration.clickcountRetail();
		Thread.sleep(5000);
	}

	@Then("^Accept terms and conditions$")
	public void accept_terms_and_conditions() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		registration.checkAccept();

		jse.executeScript("window.scrollBy(0,200)", "");
		registration.clickAccept();
		Thread.sleep(30000);

	}

	@Then("^Enter ecard details and validate \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_ecard_details_and_validate(String arg1, String arg2) throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)", "");
		registration.enterEcard(arg1);
		Thread.sleep(500);
		registration.enterEcardPin(arg2);
		Thread.sleep(500);
		registration.clickValidate();
		Thread.sleep(1000);

	}

	@Then("^Click on confirm button$")
	public void click_on_confirm_button() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(5000);
		registration.clickEcardCon();
		Thread.sleep(2000);
	}

	@Then("^Validate the Auto Login \"([^\"]*)\"$")
	public void validate_the_Auto_Login(String arg1) throws Throwable {
		Thread.sleep(15000);
		Assert.assertEquals(registrationConfirmation.readName(), arg1);
	}

	@When("^user enter conpany details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_conpany_details(String arg1, String arg2, String arg3) throws Throwable {
		registration.enterCompanyName(arg1);
		registration.enterContactPerson(arg2);
		registration.enterOtherPosition(arg3);
	}

	@When("^Click on annonymous confirm button$")
	public void click_on_annonymous_confirm_button() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(2000);
		anonymouspurchaseReg.checktcRetail();
		anonymouspurchaseReg.clicktcConfirm();
		Thread.sleep(30000);
		jse.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(9000);
	}

}
