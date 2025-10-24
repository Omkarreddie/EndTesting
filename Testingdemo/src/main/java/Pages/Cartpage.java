package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cartpage{
	WebDriver driver;

	By checkout=By.name("checkout");
	By cartproducts=By.className("cart_item");

	public Cartpage(WebDriver driver) {
		this.driver=driver;
	}
	public void checkout() {

		driver.findElement(checkout).click();;

	}

	public List<String> cartprod()
	{
		List<WebElement> allProd=driver.findElements(cartproducts);
		List<String>cartItems=new ArrayList<>();
		for(WebElement ele:allProd)
		{

			cartItems.add(ele.findElement(By.className("inventory_item_name")).getText());
		}
		return cartItems;
	}
}
