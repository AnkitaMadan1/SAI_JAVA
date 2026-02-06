package selenium_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown_4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement a = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_chk_friendsandfamily")));
		a.click();
		System.out.println(a.isSelected());

		List<WebElement> b = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(b.size());
		driver.quit();

	}

}
