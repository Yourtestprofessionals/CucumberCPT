package Cucumber.CucumberCPT;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class CPTPage extends AbstractPage{

	public CPTPage(WebDriver driver) {
		super(driver);
	}
	public boolean checkLogin(String expectedResponse){
		boolean result = false;
		try {
			result = driver.findElement(By.linkText(expectedResponse)).getText().contains(expectedResponse);
			System.out.println("page element: "+driver.findElement(By.linkText(expectedResponse)).getText().contains(expectedResponse));
		} catch (NoSuchElementException e){
			System.out.println("Element: "+expectedResponse+" does not exist");
			result = false;
			
		}
		System.out.println("result: "+result);	
	return result;
	}
	
	public CPTPage clickArrow(){

		driver.findElement(By.id("arrow-right-wrapper")).click();
		return new CPTPage(driver);
		
	}
	
	public TestSpecification getIssuePage(String testCase){
		
		driver.findElement(By.linkText(testCase)).click();
		return new TestSpecification(driver);
	}

}
