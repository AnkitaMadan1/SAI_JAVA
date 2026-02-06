package New;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) throws InterruptedException {

		String name = "rahulshetty";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.className("error")).getText());

	}

}
