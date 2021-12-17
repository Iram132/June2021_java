package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SetColorPage;
import util.BrowserFactory;

public class SetColorStepDefinition {
	WebDriver driver;
	SetColorPage setColorPage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		setColorPage = PageFactory.initElements(driver, SetColorPage.class);
	}

	@Given("^User is on techfios test Website$")
	public void user_is_on_techfios_test_Website() throws Throwable {
		driver.get("https://techfios.com/test/101/");
	}

	@When("^User clicks on the set Skyblue button;$")
	public void user_clicks_on_the_set_Skyblue_button() {
		//setColorPage = PageFactory.initElements(driver, SetColorPage.class);
		setColorPage.clickOnSkyBlueButton();

	}

	@Then("^the background color will change to skyblue;$")
	public void the_background_color_will_change_to_skyblue() {
		//setColorPage = PageFactory.initElements(driver, SetColorPage.class);
		setColorPage.assertSkyBlueColor();
	}

	@When("^User clicks on the set White background button;$")
	public void user_clicks_on_the_set_White_background_button() {
		//setColorPage = PageFactory.initElements(driver, SetColorPage.class);
		setColorPage.clickOnWhiteButton();
	}

	@Then("^the background color will change to white;$")
	public void then_the_background_color_will_change_to_white() {
		//setColorPage = PageFactory.initElements(driver, SetColorPage.class);
		setColorPage.assertWhiteColor();
	}

	
	
	@After
	public void tearDown() throws IOException {
	BrowserFactory.takeScreenshot(driver);
		BrowserFactory.tearDown();
	}

}
