package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l_project {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String name = "Ankita";
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String password = getpassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("ankita@321");
	    driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ankita@321");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("89765456");
	    driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		Thread.sleep(5000);
		driver.findElement(By.className("go-to-login-btn")).click();
	    driver.findElement(By.id("inputUsername")).sendKeys("ankita");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
		driver.findElement(By.xpath("//label[@for='chkboxTwo']")).click();
		driver.findElement(By.className("signInBtn")).click();
	}

	private static String password2(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordtext.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;

	}
}
