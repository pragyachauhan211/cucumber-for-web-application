package automation.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = "src/test/java/feature/sample.feature",
		glue = "stepDefinition", tags = "@tag1",dryRun=false,
		plugin = {"pretty","html:target/cucumber.html"},
		monochrome = true
)

public class testNGTestRunner extends AbstractTestNGCucumberTests
{
	

 
 public testNGTestRunner()
 {
	 
 }
 
 
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
	
}
