package test.steps;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;



import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vikas.UAE_SmokeTesting_PgObjects.pages.LoginPage;
import vikas.UAE_SmokeTesting_PgObjects.pages.VODashboard;



public class SSOSteps {
	
	@Steps
	@Managed
	WebDriver driver;
	LoginPage loginPage;
	VODashboard vODashboard;
	
	/*@When("^user enter valid credentials \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_valid_credentials(String arg1, String arg2) throws Throwable {
	    Thread.sleep(4000);
		loginPage.enterUserName(arg1);
	    loginPage.enterpwd(arg2);
	    Thread.sleep(5000);
	    loginPage.clickLogin();
	    Thread.sleep(10000);
	}*/
	

	@Then("^click on virtual office link$")
	public void click_on_virtual_office_link() throws Throwable {
		Thread.sleep(10000);
	    vODashboard.clickVO();
	    Thread.sleep(40000);
	}

	@Then("^user direct to the VO page \"([^\"]*)\"$")
	public void user_direct_to_the_VO_page(String arg1) throws Throwable {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs2.get(0));
		  driver.switchTo().window(tabs2.get(0)).close();
		  Thread.sleep(2000);
		  driver.switchTo().window(tabs2.get(1));
		  Thread.sleep(1000);
		  Assert.assertEquals(arg1, driver.getCurrentUrl());
	}

}
