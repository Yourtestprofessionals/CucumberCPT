package Cucumber.CucumberCPT;
/*******************
 * Created by:
 * Creation date:
 * updated: description
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestCaseData extends AbstractPage{
	public TestCaseData(WebDriver driver) {
		super(driver);
	}
	
	//fill test case data
	public void setTitleAndSummary(String title, String summary){
		System.out.println("title: "+ title);
		System.out.println("Summary: "+summary);
		driver.findElement(By.id("testcase_name")).sendKeys(title);
		driver.findElement(By.name("testcase_name")).sendKeys(Keys.TAB+summary);
 	}	
	
	//click on delete button
	public TestCaseData selectDelete(String cButton) {
		driver.findElement(By.name(cButton)).click();
		return new TestCaseData(driver);
	}
	
	//click on delete button confirmation
	public TestCaseData selectCDelteConfirm(String dButton){
		driver.findElement(By.id(dButton)).click();
		System.out.println("siurce: "+driver.getPageSource());
		return new TestCaseData(driver);		
	}
	
	//check deletion message
	public boolean checkDeleteConfirm(String succ6test){
		return driver.getPageSource().contains(succ6test);		
	}
	
}
