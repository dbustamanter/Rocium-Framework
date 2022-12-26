package stepDefinitions;

import io.cucumber.java.en.*;
import pages.IndexPage;

public class IndexSteps {

    IndexPage indexPage = new IndexPage();

    @When("al llegar a seccion casas y departamentos en venta")
    public void alLlegarASeccionCasasYDepartamentosEnVenta() {
        indexPage.moverASeccionCasasYDeptos();
    }
    @And("clickear opcion ver todas")
    public void clickearOpcionVerTodas() {
        indexPage.verTodasLasPropiedades();
    }
}
