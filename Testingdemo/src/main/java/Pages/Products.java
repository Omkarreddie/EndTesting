package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products{
	WebDriver driver;
	//   By c=By.id("add-to-cart-sauce-labs-backpack");
	//   By c1=By.id("add-to-cart-sauce-labs-bike-light");
	By cart=By.className("shopping_cart_link");
	By title=By.className("title");
	By products=By.className("inventory_item");


	public Products(WebDriver driver) {
		this.driver=driver;
		//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

	public List<String> items()
	{
		List<WebElement> allProd=driver.findElements(products);
		List<String>added_to_cartItems=new ArrayList<>();
		for(WebElement ele:allProd)
		{
			WebElement btn=ele.findElement(By.tagName("button"));
			if(added_to_cartItems.size()<2)
			{
				added_to_cartItems.add(ele.findElement(By.className("inventory_item_name")).getText());
				btn.click();
			}
		}

		return added_to_cartItems;
	}

	public void gotocart() {
		driver.findElement(cart).click();;
	}

	public String confirm() {

		try
		{
			return driver.findElement(title).getText();
		}	 
		catch(Exception e)
		{
			return "Failed";
		}

	}



}
