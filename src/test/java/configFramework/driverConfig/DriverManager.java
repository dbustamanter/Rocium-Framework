package configFramework.driverConfig;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static SelfHealingDriver driver;
    private static WebDriver delegate;

    public static void setUpDriver(Navegador nav, String URL){
        switch (nav){
            case Chrome:
                WebDriverManager.chromedriver().setup();
                delegate = new ChromeDriver();
                driver = SelfHealingDriver.create(delegate);
            case Firefox:
                WebDriverManager.firefoxdriver().setup();
                delegate = new FirefoxDriver();
                driver = SelfHealingDriver.create(delegate);
            case Edge:
                WebDriverManager.edgedriver().setup();
                delegate = new EdgeDriver();
                driver = SelfHealingDriver.create(delegate);
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(URL);
    }
    public static SelfHealingDriver getDriver(){
        return driver;
    }

}
