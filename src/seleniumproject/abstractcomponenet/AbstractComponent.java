package seleniumproject.abstractcomponenet;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitForVisibility(By findBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitAndClick(By findBy) {
        wait.until(ExpectedConditions.elementToBeClickable(findBy)).click();
    }
}
