package selenium_project;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class automate_saucelabs {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        Landing_saucelab landing = new Landing_saucelab(driver);
        landing.go_to();
        landing.login_application("standard_user", "secret_sauce");

        ProductsPage products = new ProductsPage(driver);
        products.addBackpackToCart();
        products.goToCart();

        driver.quit();
    }
}
