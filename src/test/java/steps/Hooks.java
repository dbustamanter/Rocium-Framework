package steps;

import configFramework.driverConfig.DriverManager;
import configFramework.driverConfig.Navegador;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUpDriver() {
        DriverManager.setUpDriver(Navegador.Chrome, "https://dibrsite1.netlify.app/");
    }

    @After
    public void closeDriver() {
        DriverManager.getDriver().close();
    }
}
