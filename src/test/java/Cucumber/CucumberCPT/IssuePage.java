package Cucumber.CucumberCPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IssuePage extends AbstractPage {

	public IssuePage(WebDriver driver) {
		super(driver);
	}
	
	//click on Issues link
	public void getIssuePage(String reportIssue){
		driver.switchTo().frame("mainframe");
		driver.findElement(By.linkText(reportIssue)).click();		
	}
	
	//click on Report issue page
	public ReportIssuePage getReportIssuePage(String issue) {
		driver.findElement(By.linkText(issue)).click();
		return new ReportIssuePage(driver);
	}

}
