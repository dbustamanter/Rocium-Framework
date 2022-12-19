package stepDefinitions;

import io.cucumber.java.en.*;
import pages.IndexPage;

public class IndexSteps {

    IndexPage indexPage = new IndexPage();

    @And("clickear opcion ver todas")
    public void clickearOpcionVerTodas() {
        indexPage.verTodasLasPropiedades();
    }

    @When("al llegar a seccion casas y departamentos en venta")
    public void alLlegarASeccionCasasYDepartamentosEnVenta() {
        indexPage.moverASeccionCasasYDeptos();
    }
}
