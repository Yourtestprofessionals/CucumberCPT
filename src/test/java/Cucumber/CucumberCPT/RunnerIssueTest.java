package Cucumber.CucumberCPT;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","html:target/html/Mantis/","json:target/json/out_Mantis.json"},
		features = "resource/",
		tags = {"@Issues"}
		)
public class RunnerIssueTest {

}
