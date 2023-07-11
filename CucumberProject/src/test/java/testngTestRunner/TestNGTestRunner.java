package testngTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue = "stepDefination")
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
