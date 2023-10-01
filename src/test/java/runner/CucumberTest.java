package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Hello",
        features = "src/test/resources/feature/",
        glue = "definitions"
)
public class CucumberTest {

}
