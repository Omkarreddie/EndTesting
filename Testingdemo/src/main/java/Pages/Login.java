

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login{
	WebDriver driver;
	By u=By.id("user-name");
	By p=By.name("password");
	By submit=By.className("submit-button");

	public Login(WebDriver driver) {
		this.driver=driver;
	}

	public void userName(String name)
	{
		driver.findElement(u).sendKeys(name);;
	}
	public void password(String pwd)
	{
		driver.findElement(p).sendKeys(pwd);
	}
	public void click_Submit()
	{
		driver.findElement(submit).click();
	}
}
