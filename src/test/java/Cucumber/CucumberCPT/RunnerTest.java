package Cucumber.CucumberCPT;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","html:target/html/login/","json:target/json/loginOut.json"},
		features = "resource/",
		tags = {"@login"}
		)
public class RunnerTest {

}
