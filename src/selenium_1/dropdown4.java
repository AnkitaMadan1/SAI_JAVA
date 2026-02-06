package selenium_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("autosuggest"))).sendKeys("ind");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-menu-item")));
		List<WebElement> option = driver.findElements(By.className("ui-menu-item"));
		for (int i = 0; i < option.size(); i++) {
			if (option.get(i).getText().equalsIgnoreCase("indIA")) {
				option.get(i).click();
				break;
			}
		}

	}
}
