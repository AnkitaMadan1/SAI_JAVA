package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dop_final {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[text='Hubli (HBX)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text='Hyderabad (HYD)'])[2]")).click();
		// Thread.sleep(4000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

		// driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		Assert.assertTrue(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"));
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 4; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
