package pages;

import configFramework.driverConfig.DriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AnunciosPage {
    private WebDriver driver;

    public AnunciosPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//div[@class=\"anuncio\"]//a")
    List<WebElement> anuncios;

    @FindBy(xpath = "//h1")
    WebElement tituloCasaVenta;


    public void verificacionListadoPropiedades(){
        Assertions.assertEquals("https://dibrsite1.netlify.app/html/anuncios.html", driver.getCurrentUrl());
    }
    public void verificarPropiedades(){
        for (int i=0;i<anuncios.size();i++){
            WebElement aux = anuncios.get(i);
            aux.click();
            Assertions.assertEquals("Casa en Venta frente al Bosque",tituloCasaVenta.getAttribute("innerHTML"));
            driver.navigate().back();
            driver.navigate().refresh();
        }

    }
}
