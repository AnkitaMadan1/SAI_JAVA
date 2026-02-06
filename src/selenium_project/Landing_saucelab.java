package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumproject.abstractcomponenet.AbstractComponent;

public class Landing_saucelab extends AbstractComponent {

    public Landing_saucelab(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement login_button;

    public void go_to() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login_application(String user, String pass) {
        waitForVisibility(username);
        username.sendKeys(user);
        password.sendKeys(pass);
        login_button.click();
    }
}
