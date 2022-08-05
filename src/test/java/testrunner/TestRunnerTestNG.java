package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/resources/AppFeatures"},
		glue={"StepDefinitions","appHooks"},
		dryRun = false,
		monochrome = true,
		//tags = "@Sanity",//scenarios under @sanity tag will be executed
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/cucumber-reports/reports_html.html","timeline:test-output-thread"}
		)

public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
