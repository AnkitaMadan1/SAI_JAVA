package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class drop_4 {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	Thread.sleep(2000);
	List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	for(WebElement option: options) {
		if(option.getText().equalsIgnoreCase("india"));
		{
			option.click();
			break;
		}
	}
	
	

	}

}
