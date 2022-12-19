package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.IndexPage;

public class IndexSteps {

    IndexPage indexPage = new IndexPage();

    @When("al llegar a sección casas y departamentos en venta")
    public void seccionCasasYDepartamentos(){
        indexPage.contactanos();
    }
    @And("clickear opcion ver todas")
    public void clickearOpcionVerTodas(){
        indexPage.contactanos();
    }
}
