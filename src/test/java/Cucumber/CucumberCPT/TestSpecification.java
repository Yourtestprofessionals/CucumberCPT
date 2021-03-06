package Cucumber.CucumberCPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestSpecification extends AbstractPage {

	public TestSpecification(WebDriver driver) {
		super(driver);
	}
	
	//click on test Specification link
	public void getTestSpecification(String testspec){
		driver.switchTo().frame("mainframe");
		driver.findElement(By.linkText("Test Specification")).click();		
	}

	//click on test folder
	public void selectFolder(String testspec){
		driver.switchTo().frame("treeframe");
		driver.findElement(By.partialLinkText("TS XXX")).click();

	}
	
	//click on test create button
	public TestCaseData selectCreate(String cButton) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainframe");
		driver.switchTo().frame("workframe");
		driver.findElement(By.id(cButton)).click();
		return new TestCaseData(driver);
	}

}
