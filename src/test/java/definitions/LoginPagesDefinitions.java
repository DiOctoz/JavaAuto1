package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.HelperClass;

import static org.junit.Assert.assertEquals;

public class LoginPagesDefinitions {
    @When("Open browser {string}")
    public void Open_browser (String url){
        HelperClass.openPage(url);
    }
}
