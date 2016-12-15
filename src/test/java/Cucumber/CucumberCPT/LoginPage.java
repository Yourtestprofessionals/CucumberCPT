package Cucumber.CucumberCPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

	public LoginPage (WebDriver driver){
		super(driver);
	}
	
	// start CPT portal page
	public void navigateToWebApp(String url) {
		driver.navigate().to(url);
	}
	
	//fill in user id
	public LoginPage setUserId(String user){
		driver.findElement(By.name("name")).sendKeys(user);
		return new LoginPage(driver);
	}
	
	//fill in password
	public LoginPage setPass(String pass){
		driver.findElement(By.name("pass")).sendKeys(pass);	
		return new LoginPage(driver);
	}
	
	//click on login link
	public CPTPage confirm(){
		driver.findElement(By.name("op")).click();	
		return new CPTPage(driver);
	}

}
