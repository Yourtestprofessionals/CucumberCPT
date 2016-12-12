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
		//Assert.assertFalse("Could not find the string '"+expectedResponse+"'",!result);	
	return result;
	}

}
