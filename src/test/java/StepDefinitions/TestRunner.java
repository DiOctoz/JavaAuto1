package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/GoogleSearch.feature",
        glue={"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty","html:target/HtmlReports/HtmlReports.html",
                "json:target/HtmlReports/jsonReport.json",
                "junit:target/HtmlReports/xmlReport.xml"},
        tags = "@smoketest"
)
public class TestRunner {
}
