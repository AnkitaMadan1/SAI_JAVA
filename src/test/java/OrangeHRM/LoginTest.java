package OrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test

	public void validloginTest() {
		loginpage lp = new loginpage(driver);
		lp.user("Admin");
		lp.pass("admin123");
		lp.login();

		DashBoard db = new DashBoard(driver);
		Assert.assertTrue(db.isdiplayed(), "dashboard is not displayed");
		db.logout();
	}

	@Test
	public void InvalidLoginTest() {
		loginpage lp = new loginpage(driver);
		lp.user("test");
		lp.pass("test123");
		lp.login();
		Assert.assertTrue(lp.errormsg().contains("Invalid credentials"));

	}

}
