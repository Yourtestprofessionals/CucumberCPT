package Cucumber.CucumberCPT;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
/*******************
 * Created by:
 * Creation date:
 * updated: description
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		return new TestCaseData(driver);		
	}
	
	//check deletion message
	public boolean checkDeleteConfirm(String succ6test){
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Date date = new Date(System.currentTimeMillis());
			//System.out.println("Date: "+date);

			FileUtils.copyFile(source, new File("C://Users//elfer//git//CucumberCPT//DeleteConfirmation"+new SimpleDateFormat("_dd_MMMM_YYYY_HH_mm_ss").format(date)+".png"));	
		} catch (IOException e) {
	        e.printStackTrace();
	    }
		return driver.getPageSource().contains(succ6test);		
	}
	
}
