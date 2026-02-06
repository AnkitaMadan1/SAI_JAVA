package selenium_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class section_5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String name = "ankita";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String Password = word(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("ankita@123");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		WebElement s = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.submit.signInBtn")));
		s.click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ankita@321");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876456754");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String text = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		Assert.assertEquals(text, "Please use temporary password 'rahulshettyacademy' to Login.");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(Password);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.submit.signInBtn"))).click();
		Thread.sleep(4000);
		String value = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(value, "Hello " + name + ",");

	}

	public static String word(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String msg = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] info = msg.split("'");
		String text = info[1].split("'")[0];
		return text;

	}

}
