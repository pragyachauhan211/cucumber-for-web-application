package automation.cucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
features = "src/test/java/feature",
glue = "stepDefinition", stepNotifications = true, tags = "@Regr",dryRun=false,
plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json"},
monochrome = true
)

public class testRunner {

}
