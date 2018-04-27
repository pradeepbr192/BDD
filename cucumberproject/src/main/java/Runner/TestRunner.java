package Runner;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\250630.CTS\\workspace\\cucumberproject\\src\\main\\java\\Features\\login.feature", //the path of the feature files
			glue={"stepdefinition"},  //the path of the step definition files 
			dryRun= false, // to check if the bindings are working fine.
			monochrome= true, //to display console output in a readable format.
			strict= true) //fails the test case if there are any incomplete steps/step definition in step definition file

public class TestRunner {

}
