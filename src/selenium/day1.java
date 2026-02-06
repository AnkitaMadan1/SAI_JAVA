package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// System.out.println(driver.getTitle());
		//System.out.println(driver.getTitle());
		String act_title = driver.getTitle();
		if (act_title.equals("Google")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
