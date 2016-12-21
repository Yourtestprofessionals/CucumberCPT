package Cucumber.CucumberCPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReportIssuePage extends AbstractPage {

	public ReportIssuePage(WebDriver driver) {
		super(driver);
	}
	
	//click on Report Issues link
	public void getReportIssuePage(String reportIssue){
		driver.switchTo().frame("mainframe");
		driver.findElement(By.linkText(reportIssue)).click();		
	}
	
	//select category
	public void getCategory(String category){
		new Select(driver.findElement(By.name("category_id"))).selectByVisibleText(category);
	}
	
	//select severity
	public void getReproducibility(String sev){
		new Select(driver.findElement(By.name("reproducibility"))).selectByVisibleText("random");
	}
	
	//select severity
	public void getSeverity(String sev){
		new Select(driver.findElement(By.name("severity"))).selectByVisibleText("High");
	}
	
	//select severity
	public void getPriority(String sev){
		new Select(driver.findElement(By.name("priority"))).selectByVisibleText("Low");
	}
	
	public void setSummarDescription(String summary, String description){
		driver.findElement(By.name("summary")).sendKeys(summary);
		driver.findElement(By.name("description")).sendKeys(description);
	}
	
	public void getSubmittion (){
		driver.findElement(By.cssSelector("input[value='Submit Report']")).click();
	}
	
}
