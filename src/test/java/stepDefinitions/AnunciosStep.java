package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.experimental.theories.Theory;
import pages.AnunciosPage;

public class AnunciosStep {

    AnunciosPage anunciosPage = new AnunciosPage();

    @Then("aparece listado de propiedades en venta")
    public void listadoPropiedadesEnVenta(){
        anunciosPage.contactanos();
    }

    @And("puedo ver todas las propiedades seleccionadas")
    public void propiedadesSeleccionadas(){
        anunciosPage.contactanos();
    }
}
