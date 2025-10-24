package Testclasses;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import BaseClasses.Basepage;
import Pages.*;
import Utils.LoginData;

public class Main_Test extends Basepage {

	@Test(dataProvider="LoginData", dataProviderClass=LoginData.class)
	public void e_commerce(String username,String pwd,String firstname,String lastname,String Zip)
	{
		Login lp=new Login(driver);
		lp.userName(username);
		lp.password(pwd);
		lp.click_Submit();

		Products prod=new Products(driver);
		String txt=prod.confirm();
		Assert.assertEquals(txt, "Products");
		List<String>addTocartItems=prod.items();
		prod.gotocart();

		Cartpage c=new Cartpage(driver);
		List<String>ItemsaddedTocart=c.cartprod();
		Assert.assertEquals(addTocartItems, ItemsaddedTocart, "Items are mismatched");
		c.checkout();

		Checkout ch=new Checkout(driver);
		ch.fname(firstname);
		ch.lname(lastname);
		ch.zip(Zip);
		ch.con();

		Order_SUmmary o_s=new Order_SUmmary(driver);
		List<String>Orderproducts=o_s.summaryprod();
		Assert.assertEquals(ItemsaddedTocart, Orderproducts, "Items are mismatched");
		o_s.finish();

		Confirmation C=new Confirmation(driver);
		String s=C.confirm();
		C.menu();
		C.logout();
		System.out.println(s);

	}

}
