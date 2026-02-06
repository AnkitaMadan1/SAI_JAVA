package OrangeHRM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class loginpage extends BasePage {

	// Constructor
	public loginpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement login_button;
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement wrongmsg;

	public void user(String user) {
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(user);
	}

	public void pass(String pass) {
		password.sendKeys(pass);
	}

	public void login() {
		login_button.click();

	}

	public String errormsg() {
		wait.until(ExpectedConditions.visibilityOf(wrongmsg));
		return wrongmsg.getText();
	}
}
