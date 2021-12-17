package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\java\\features\\setColor.feature",
		//"classpath:features",
		glue = "steps", 
		tags = "@tag", 
		monochrome = true, 
		dryRun = false,                   
		plugin = {
				"pretty",
				"html:target/cucmber",
				"json:target/cucumber.json" })

public class SetColorRunner {

}
