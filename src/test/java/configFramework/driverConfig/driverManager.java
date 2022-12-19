package configFramework.driverConfig;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverManager {
    private static SelfHealingDriver driver;

    public static void setUpDriver(String URL){
        WebDriverManager.chromedriver().setup();
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(URL);
    }

}
