package pages;

import configFramework.driverConfig.DriverManager;
import configFramework.util.MetodosGenericos;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
    private WebDriver driver;

    public IndexPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//h2[@class=\"fw-300 centrar-texto\" and contains(text(),\"Venta\")]")
    WebElement tituloSeccionVentas;

    @FindBy(xpath = "//div[@class=\"contenedor-anuncios\"]")
    WebElement contenedorAnuncios;

    @FindBy(xpath = "//a[@class=\"boton boton-verde d-block\"]")
    WebElement btnVerTodas;

    public void validarIngresoIndex() {
        System.out.println("Validando ingreso al index");
        Assertions.assertEquals("Bienes Raices", driver.getTitle());
    }
    public void moverASeccionCasasYDeptos() {
        MetodosGenericos.mostrarElemento(tituloSeccionVentas);
    }
    public void verTodasLasPropiedades() {
        btnVerTodas.click();
    }

}
