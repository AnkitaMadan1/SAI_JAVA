package selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cucum {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);

		int j = 0;
		String[] s = { "Brocolli", "Cucumber" };

		List<WebElement> name = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < name.size(); i++) {
			String[] value = name.get(i).getText().split("-");
			String value1 = value[0].trim();
			List item = Arrays.asList(s);

			if (item.contains(value1)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if (j == 2) {
					break;
				}
			}

		}

	}

}
