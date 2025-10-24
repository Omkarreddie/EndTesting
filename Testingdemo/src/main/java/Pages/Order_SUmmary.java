package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_SUmmary {
	WebDriver driver;
	By f=By.id("finish");
	By order_summary=By.xpath("//div[@class='cart_item']");


	public Order_SUmmary(WebDriver driver) {
		this.driver=driver;

	}

	public void finish() {
		driver.findElement(f).click();
	}
	public List<String> summaryprod()
	{
		List<WebElement> order_products=driver.findElements(order_summary);
		List<String>cartItems=new ArrayList<>();
		for(WebElement ele:order_products)
		{

			cartItems.add(ele.findElement(By.className("inventory_item_name")).getText());
		}
		return cartItems;
	}
}
