package configFramework.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import stepDefinitions.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "stepDefinitions",
        features = "src/test/resources/features",
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@dibrsitioweb")

public class BaseRunner extends Hooks{

}
