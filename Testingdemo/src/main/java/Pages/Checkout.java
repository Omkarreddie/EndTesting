package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout  {
	WebDriver driver;
	By fname=By.id("first-name");
	By lname=By.id("last-name");
	By zip=By.id("postal-code");
	By con=By.id("continue");
	public Checkout(WebDriver driver) {
		this.driver=driver;

	}

	public void fname(String firstname) {
		driver.findElement(fname).sendKeys(firstname);;
	}

	public void lname(String lastname) {
		driver.findElement(lname).sendKeys(lastname);;
	}

	public void zip(String code) {
		driver.findElement(zip).sendKeys(code);;
	}

	public void con() {
		driver.findElement(con).click();
	}


}
