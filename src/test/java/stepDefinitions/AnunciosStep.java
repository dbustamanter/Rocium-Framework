package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AnunciosPage;

public class AnunciosStep {

    AnunciosPage anunciosPage = new AnunciosPage();

    @Then("aparece listado de propiedades en venta")
    public void listadoPropiedadesEnVenta(){
        anunciosPage.verificacionListadoPropiedades();
    }

    @And("puedo ver todas las propiedades seleccionadas")
    public void propiedadesSeleccionadas(){
        anunciosPage.verificarPropiedades();
    }
}
