package Cucumber.CucumberCPT;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver;

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//close the driver
	public void closedriver(){
		driver.close();
	}
	

}
