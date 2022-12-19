package configFramework.testRunner;


import configFramework.driverConfig.DriverManager;
import configFramework.driverConfig.Navegador;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "stepDefinitions",
        features = "src/test/java/resources/features",
        plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        , "json:results/cucumber.json"
        , "junit:results/cucumber.xml"}
)
public class BaseRunner {

    @Before
    public void levantarDriver(){
        DriverManager.setUpDriver(Navegador.Chrome,"URL");
    }
    @After
    public void closeDriver(){
        DriverManager.getDriver().close();
    }

}
