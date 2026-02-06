package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class sibling_locator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text = driver.findElement(By.xpath("//header/div/button[2]/following-sibling::button[2]")).getText();
        System.out.println(text);
        driver.close();
	}

}
