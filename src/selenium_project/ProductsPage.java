package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumproject.abstractcomponenet.AbstractComponent;

public class ProductsPage extends AbstractComponent {

	By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
	By cartIcon = By.className("shopping_cart_link");

	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	public void addBackpackToCart() {
		waitAndClick(addToCartBackpack);
	}

	public void goToCart() {
		waitAndClick(cartIcon);
	}

}
