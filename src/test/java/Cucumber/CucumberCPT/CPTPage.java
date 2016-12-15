package Cucumber.CucumberCPT;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CPTPage extends AbstractPage {

	public CPTPage(WebDriver driver) {
		super(driver);
	}

	// check if login message is displayed
	public boolean checkLogin(String expectedResponse) {
		boolean result = false;
		try {
			result = driver.findElement(By.linkText(expectedResponse)).getText().contains(expectedResponse);
			System.out.println("page element: "
					+ driver.findElement(By.linkText(expectedResponse)).getText().contains(expectedResponse));
		} catch (NoSuchElementException e) {
			System.out.println("Element: " + expectedResponse + " does not exist");
			result = false;
		}
		return result;
	}

	//click op the arrow to get into the second page
	public CPTPage clickArrow() {
		driver.findElement(By.id("arrow-right-wrapper")).click();
		return new CPTPage(driver);
	}

	//click on test case page
	public TestSpecification getTestCasePage(String testCase) {
		driver.findElement(By.linkText(testCase)).click();
		return new TestSpecification(driver);
	}

}
