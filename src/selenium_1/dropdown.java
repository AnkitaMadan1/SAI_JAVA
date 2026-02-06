package selenium_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_DropDownListCurrency")));
		Select s = new Select(element);

		// First
		s.selectByValue("INR");
		String first = s.getFirstSelectedOption().getText();
		// System.out.println(first);
		Assert.assertEquals(first, "INR");
		// second

		s.selectByIndex(2);
		String second = s.getFirstSelectedOption().getText();
		// System.out.println(second);
		Assert.assertEquals(second, "AED");

		// Third
		s.selectByVisibleText("USD");
		String third = s.getFirstSelectedOption().getText();
		// System.out.println(third);
		Assert.assertEquals(third, "USD");
		driver.quit();

	}

}
