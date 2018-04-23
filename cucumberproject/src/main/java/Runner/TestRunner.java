package Runner;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\250630.CTS\\workspace\\cucumberproject\\src\\main\\java\\Features\\login.feature", //the path of the feature files
			glue={"stepdefinition"}) //the path of the step definition files

public class TestRunner {

}
