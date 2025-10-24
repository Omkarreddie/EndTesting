package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmation{
	WebDriver driver;
	By complete=By.className("complete-header");
	By menu=By.id("react-burger-menu-btn");
	By loog=By.id("logout_sidebar_link");


	public Confirmation(WebDriver driver) {
		this.driver=driver;
		//  	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public String confirm() {	
		try
		{
			return driver.findElement(complete).getText();
		}
		catch(Exception e)
		{
			return "Failed";
		}

	}


	public void menu() {
		driver.findElement(menu).click();
	}

	public void logout() {
		driver.findElement(loog).click();
	}
}
