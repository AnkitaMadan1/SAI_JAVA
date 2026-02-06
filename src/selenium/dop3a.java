package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dop3a {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@text='Kozhikode (CCJ)']")).click();
		Thread.sleep(4000);
		driver.findElement(
				By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[text='Hyderabad (HYD)']"))
				.click();

	}

}
