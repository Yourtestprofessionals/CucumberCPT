package Cucumber.CucumberCPT;

import java.util.concurrent.TimeUnit;

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
	TestSpecification testSpec;
	TestCaseData testCaseData;

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
		Assert.assertTrue("Response is negative", cptPage.checkLogin(expectedResponse));
	}

	@And("^close the browser$")
	public void logging_is_successfully() throws Throwable {
		cptPage.closedriver();
		System.out.println("doe iets anders");
	}

	// TestLink set

	@When("^user clicks on the right arrow$")
	public void user_clicks_on_the_right_arrow() throws Throwable {
		cptPage.clickArrow(); 	
	}
	
	@When("^user clicks on \"(.*?)\"$")
	public void user_clicks_on(String issue) throws Throwable {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);		
		testSpec = cptPage.getTestCasePage(issue);
		
	}
	
	@When("^user clicks on Test Specification \"(.*?)\"$")
	public void user_clicks_on_Test_Specification(String testspec) throws Throwable {
		testSpec.getTestSpecification(testspec);
	}

	@When("^user clicks on folder name \"(.*?)\"$")
	public void user_clicks_on_folder_name(String folder) throws Throwable {
		testSpec.selectFolder(folder);
	}

	@When("^user clicks on Test Case Operation button$")
	public void user_clicks_on_Test_Case_Operation_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		testCaseData = testSpec.selectCreate("create_tc");		
	}

	@When("^user fills in \"(.*?)\" and \"(.*?)\"$")
	public void user_fills_in_and(String title, String summary) throws Throwable {
		testCaseData.setTitleAndSummary(title, summary);
		
	}

	@When("^user clicks on create button$")
	public void user_clicks_on_create_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		testCaseData = testSpec.selectCreate("do_create_button");
		
	}

	@When("^user clicks on delete button$")
	public void user_clicks_on_delete_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		testCaseData.selectDelete("delete_tc");		
	}

	@When("^user clicks on deletion confiramtion button$")
	public void user_clicks_on_deletion_confiramtion_button() throws Throwable {
		testCaseData.selectCDelteConfirm("do_delete");
	}
	
	@Then("^check if test cases is successfully deleted \"(.*?)\"$")
	public void check_if_test_cases_is_successfully_deleted(String succ6test) throws Throwable {
		Assert.assertTrue("succ. checked: ",testCaseData.checkDeleteConfirm(succ6test));
	}

}
