package test.steps;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vikas.UAE_SmokeTesting_PgObjects.pages.RedeemCheckoutPgObject;
import vikas.UAE_SmokeTesting_PgObjects.pages.RedeemHealthPgObject;
import vikas.UAE_SmokeTesting_PgObjects.pages.VODashboard;

public class RedemptionSteps {
	@Steps
	@Managed
	WebDriver driver;

	VODashboard vODashboard;
	RedeemHealthPgObject redeemHealthPgObject;
	RedeemCheckoutPgObject redeemCheckoutPgObject;

	@When("^click on redeem button$")
	public void click_on_redeem_button() throws Throwable {
		vODashboard.clickRedeem();

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(15000);
	}

	@When("^add redeem products to cart$")
	public void add_redeem_products_to_cart() throws Throwable {
		redeemHealthPgObject.clickprod();
		redeemHealthPgObject.clickVtube();
		Thread.sleep(1000);
		redeemHealthPgObject.clickVtubeprod();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		redeemHealthPgObject.vtubeSubmit();
		Thread.sleep(5000);
	}

	@When("^user accept redeem checkout page$")
	public void user_accept_redeem_checkout_page() throws Throwable {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)", "");
		redeemCheckoutPgObject.checkTandCs();
		Thread.sleep(2000);
		redeemCheckoutPgObject.clickCheckOut();
		Thread.sleep(5000);

		jse.executeScript("window.scrollBy(0,500)", "");
		redeemCheckoutPgObject.clickCountinue();
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,300)", "");
		redeemCheckoutPgObject.clickConfirm();
		Thread.sleep(20000);
	}
}
