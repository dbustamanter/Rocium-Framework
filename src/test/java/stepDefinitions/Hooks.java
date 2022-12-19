package steps;

import configFramework.driverConfig.DriverManager;
import configFramework.driverConfig.Navegador;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

public class Hooks {

    private Scenario scenario;
    private static String tomarEvidencia;

    static {
         tomarEvidencia = System.getProperty("evidence", "fullEvidence");
    }

    @Before
    public void setUpDriver(Scenario scenario) {
        this.scenario = scenario;
        DriverManager.setUpDriver(Navegador.Chrome, "https://dibrsite1.netlify.app/");
    }

    @After
    public void closeDriver() {
        DriverManager.getDriver().close();
    }
    @AfterStep
    public void capturarEvidencia() throws Exception{
        if (this.scenario.isFailed()) {
            generarEvidencia("[FALLIDO] Captura de Scenario");
        } else if (Hooks.tomarEvidencia.equalsIgnoreCase("fullEvidence")) {
            generarEvidencia("[EXITO] Captura de Step");
        }
    }
    public void generarEvidencia(String textoRefImagen){
        byte[] screenShot = ((TakesScreenshot) DriverManager.getDelegate()).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(screenShot, "image/png", textoRefImagen);
    }
}
