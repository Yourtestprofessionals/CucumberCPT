package Cucumber.CucumberCPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

	public LoginPage (WebDriver driver){
		super(driver);
	}
	
	public LoginPage navigateToWebApp(String url) {
		driver.navigate().to(url); //"http://www.yourtestprojects.com/");
		return new LoginPage(driver);
	}
	
	public LoginPage setUserId(String user){
		driver.findElement(By.name("name")).sendKeys(user);
		return new LoginPage(driver);
	}
	
	public LoginPage setPass(String pass){
		driver.findElement(By.name("pass")).sendKeys(pass);	
		return new LoginPage(driver);
	}
	
	public CPTPage confirm(){
		driver.findElement(By.name("op")).click();	
		return new CPTPage(driver);
	}

}
