package Cucumber.CucumberCPT;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","html:target/html/","json:target/json/outTestLink.json"},
		features = "resource/",
		tags = {"@TestLink"}
		)
public class RunnerTestLinkTest {

}
