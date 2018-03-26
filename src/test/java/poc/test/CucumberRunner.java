package poc.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions (
		monochrome = true,
		features ={ "classpath:features"
		}
		
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
