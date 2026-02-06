package saucelab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	protected WebDriver driver;
	protected WebDriverWait wait;

	// Constructor
	public Baseclass(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

}
