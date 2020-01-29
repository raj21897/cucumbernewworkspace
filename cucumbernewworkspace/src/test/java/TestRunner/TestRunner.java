package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "featurefile",
        glue = {"StepDefination"} ,tags="@Cart", plugin= {"pretty", "json:target/cucumber.json"}
		)

public class TestRunner {
		
}
