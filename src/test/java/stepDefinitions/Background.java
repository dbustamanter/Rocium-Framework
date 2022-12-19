package stepDefinitions;


import io.cucumber.java.en.Given;
import pages.IndexPage;

public class Background {

    IndexPage indexPage = new IndexPage();
    @Given("me encuentro en sitio web")
    public void meEncuentroEnSitioWeb() throws InterruptedException {
        Thread.sleep(2000);
        indexPage.contactanos();
    }
}
