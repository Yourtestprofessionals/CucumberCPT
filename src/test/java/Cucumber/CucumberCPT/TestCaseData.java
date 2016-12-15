package Cucumber.CucumberCPT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestCaseData extends TestSpecification{
	public TestCaseData(WebDriver driver) {
		super(driver);
	}
	
	public void setTitleAndSummary(String title, String summary){
		System.out.println("title: "+ title);
		System.out.println("Summary: "+summary);
		driver.findElement(By.id("testcase_name")).sendKeys(title);
		driver.findElement(By.name("testcase_name")).sendKeys(Keys.TAB+summary);
 	}	
	
	public TestCaseData selectDelete(String cButton) {
		driver.findElement(By.name(cButton)).click();
		return new TestCaseData(driver);
	}
	
	public TestCaseData selectCDelteConfirm(String dButton){
		driver.findElement(By.id(dButton)).click();
		return new TestCaseData(driver);		
	}
	
	public boolean checkDeleteConfirm(String succ6test){
		return driver.getPageSource().contains(succ6test);		
	}
	
}
