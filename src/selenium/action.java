package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class action {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		Actions s = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));

		s.moveToElement(a).build().perform();
		s.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();
		//s.moveToElement(a).contextClick().build().perform();

	}

}
