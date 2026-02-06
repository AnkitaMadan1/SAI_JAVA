package selenium_1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class dropdown_2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("divpaxinfo"))).click();
		for (int i = 1; i < 5; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("hrefIncAdt"))).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		String a = driver.findElement(By.id("divpaxinfo")).getText();
		Assert.assertEquals(a, "5 Adult");

	}

}
