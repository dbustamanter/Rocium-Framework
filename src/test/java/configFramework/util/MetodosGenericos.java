package configFramework.util;

import configFramework.driverConfig.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class MetodosGenericos {

    public static void mostrarElemento(WebElement element) {
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void esperar(int tiempo) {
        try {
            System.out.println("Esperando: " + tiempo + "s");
            Thread.sleep(tiempo * 1000);
        } catch (InterruptedException io) {
            System.out.println(">>> " + io);
        }
    }

    public static void esperaImplicita(int time) {
        try {
            System.out.println("Esperando elemento");
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
        } catch (Exception var3) {

            System.out.println("Espera no cumplida");
        }
    }

    public static void esperaExplicita(WebElement elementName, int time) {
        try {
            System.out.println("Esperando elemento");
            WebDriverWait myWaitVar = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(time));
            myWaitVar.until(ExpectedConditions.visibilityOfAllElements(elementName));
        } catch (Exception var3) {
            System.out.println("Espera no cumplida");
        }
    }

    public static void compararTextos(String txtElemento, String textoComparar){
        try {
            if (txtElemento.equals(textoComparar)){
                Assert.assertTrue("Se comprueba que texto corresponde al mostrado en FRONT ", true);
            }else {
                Assert.fail("El texto no corresponde al que se encontro en el FRONT ");
            }
        }catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Se genera el siguiente error, al intentar verificar sección: " + e.getMessage());
        }
    }
    public static void cambiarPestana(int pantalla) {
        try {
            ArrayList<String> tabs = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
            DriverManager.getDriver().switchTo().window(tabs.get(pantalla));
        } catch (Exception e) {
            Assert.fail();
        }
    }

    public static boolean validarEstadoElemento(WebElement element) {
        boolean estado = false;
        try {
            estado = element.isEnabled();
        } catch (Exception e) {
            Assert.fail();
        }
        return estado;
    }

}
