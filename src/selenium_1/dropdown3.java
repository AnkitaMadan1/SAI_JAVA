package selenium_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class dropdown3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[value='DED']"))).click();
		String a = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value");
		Assert.assertEquals(a, "Dehradun (DED)");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Bhopal (BHO)']")))
				.click();
		String b = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value");
		Assert.assertEquals(b, "Bhopal (BHO)");
		// driver.quit();

	}

}
