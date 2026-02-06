package selenium_1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drop4_a {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		int j = 0;
		String[] a = { "Beetroot", "Cucumber" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> option = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < option.size(); i++) {
			String[] options = option.get(i).getText().split("-");
			String formatname = options[0].trim();

			List<String> drop = Arrays.asList(a);
			if (drop.contains(formatname)) {
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == a.length) {
					break;

				}
			}

		}

	}

}
