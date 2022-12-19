package pages;

import configFramework.driverConfig.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnunciosPage {
    private WebDriver driver;

    public AnunciosPage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "")
    WebElement logo;

    @FindBy(xpath = "")
    WebElement barraNav;

    @FindBy(xpath = "")
    WebElement contactanosBtn;

    public void contactanos() {
        System.out.println("click button contactanos");
    }
}
