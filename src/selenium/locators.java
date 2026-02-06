package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Ankita");
		driver.findElement(By.name("inputPassword")).sendKeys("Ankita1@gmail.com");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Ankita");
		driver.findElement(By.xpath("//input[@type ='text'][2]")).sendKeys("Ankita@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("98644778876");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		Thread.sleep(1000);
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Ankita");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		//driver.findElement(By.className("submit signInBtn")).click();
		//driver.findElement(By.cssSelector("button[class*='submit']")).click();
		
        driver.close();
	}

}
