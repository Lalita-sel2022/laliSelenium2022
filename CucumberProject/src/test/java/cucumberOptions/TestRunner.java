package cucumberOptions;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "stepDefination", tags="@SmokeTest or @RegTest",dryRun= true, plugin= {"pritty","html:target/cucumber.html"})
public class TestRunner {
	//Junit test runner

}
