package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dop_3 {

	public static void main(String[] ags) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@text='Amritsar (ATQ)']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click();
		// driver.quit();

	}

}//a[@text()='Jabalpur (JLR)'][2]
