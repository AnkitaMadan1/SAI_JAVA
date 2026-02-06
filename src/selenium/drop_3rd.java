package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class drop_3rd {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='BLR']")).getText());
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='ATQ'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@value='ATQ'])[2]")).getText());

	}

}
