package saucelab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends Baseclass {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	

}
