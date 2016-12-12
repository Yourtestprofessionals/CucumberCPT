package Cucumber.CucumberCPT;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsLogin {

	WebDriver driver = new ChromeDriver();
	LoginPage loginPage;
	CPTPage cptPage;
	


	@Given("^navigate to CPT Portal ([^\"]*)$")
	public void navigate_to_CPT_Portal(String url) throws Throwable {
		loginPage = new LoginPage(driver);
		loginPage.navigateToWebApp(url);
	}

	@When("^logging into the portal using id ([^\"]*)$")
	public void logging_into_the_portal_using_id(String iuser) throws Throwable {
		loginPage.setUserId(iuser);
		
	}

	@And("^logging into the portal using pass ([^\"]*)$")
	public void logging_into_the_portal_using_pass(String pass) throws Throwable {
		loginPage.setPass(pass);
	}

	@And("^click on login$")
	public void click_on_login() throws Throwable {
		cptPage = loginPage.confirm();
	}

	@Then("^check out login link ([^\"]*)$")
	public void check_out_login_link(String expectedResponse) throws Throwable {
		Assert.assertTrue("Response is negative",cptPage.checkLogin(expectedResponse));
	}

	@And("^close the browser$")
	public void logging_is_successfully() throws Throwable {
			//driver.quit();
		cptPage.closedriver();
			System.out.println("doe iets anders");
	}
}
