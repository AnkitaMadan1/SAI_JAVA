package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dop1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("USD");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("AED");
		System.out.println(s.getFirstSelectedOption().getText());

	}

}
