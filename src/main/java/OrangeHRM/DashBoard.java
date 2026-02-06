package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoard extends BasePage {

	// constructor
	public DashBoard(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement dropdown;
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;
	//@FindBy()

	public boolean isdiplayed() {
		wait.until(ExpectedConditions.visibilityOf(dashboard));
		return dashboard.isDisplayed();
	}

	public void logout() {
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(logout));
		action.moveToElement(logout).click().build().perform();

	}

}
