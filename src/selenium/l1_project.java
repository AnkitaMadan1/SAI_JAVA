package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class l1_project {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String name = "Ankita";

        // 1️⃣ Open application
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // 2️⃣ Get temporary password
        String password = getPassword(driver, wait);

        // 3️⃣ Login with correct password
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);

        driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
        driver.findElement(By.xpath("//label[@for='chkboxTwo']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.className("signInBtn"))).click();

        // Optional: success message
        System.out.println("Login successful!");
    }

    // 🔹 Helper method to fetch password
    public static String getPassword(WebDriver driver, WebDriverWait wait) {

        // Click Forgot Password
        driver.findElement(By.linkText("Forgot your password?")).click();

        // Click Reset Password
        wait.until(ExpectedConditions.elementToBeClickable(
                By.className("reset-pwd-btn"))).click();

        // Capture password text
        String passwordText = driver.findElement(
                By.cssSelector("form p")).getText();

        // Extract password between single quotes
        String password = passwordText.split("'")[1];

        // Go back to Login page (VERY IMPORTANT)
        driver.findElement(By.className("go-to-login-btn")).click();

        // Wait until login page is fully loaded
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("inputUsername")));

        return password;
    }
}
		