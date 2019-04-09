package cuc;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/Destination"}, 
							features = {"src/test/resources/cuc/hello" }  )
public class RunGenericTest {
}
