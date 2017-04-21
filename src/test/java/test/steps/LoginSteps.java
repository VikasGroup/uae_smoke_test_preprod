package test.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vikas.UAE_SmokeTesting_PgObjects.pages.HomePage;
import vikas.UAE_SmokeTesting_PgObjects.pages.LoginPage;


public class LoginSteps {

	private static final String SECONDS = null;
	@Steps
	@Managed
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	
	@Given("^user direct to the site$")
	public void user_direct_to_the_site() throws Throwable {
		driver.manage().window().maximize();
		//driver.get("https://www.qn-uae.ae/en");
		
		driver.get("https://store.qion-ltd.net");
		
	   
	}

	@When("^user click on Login or Register button$")
	public void user_click_on_Login_or_Register_button() throws Throwable {
		//HomePage homePage= new HomePage(); 
	   homePage.clickLogReg();
	   //Thread.sleep(4000);
	}

	@When("^user enter a valid ID or email \"([^\"]*)\"$")
	public void user_enter_a_valid_ID_or_email(String arg1) throws Throwable {
	  // LoginPage loginPage= new LoginPage();
	 //  Thread.sleep(5000);
	   loginPage.enterUserName(arg1);
	}

	@When("^user enter a password \"([^\"]*)\"$")
	public void user_enter_a_password(String arg1) throws Throwable {
		//Thread.sleep(4000);
	   loginPage.enterpwd(arg1);
	   
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   loginPage.clickLogin();
	   
	}

	@Then("^validate the landing page \"([^\"]*)\"$")
	public void validate_the_landing_page(String arg1) throws Throwable {
			Thread.sleep(18000);
		   Assert.assertEquals(arg1, driver.getCurrentUrl());
	   
	}
}
