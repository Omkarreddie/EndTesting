package BaseClasses;
import java.time.Duration;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basepage {
	public static WebDriver driver;
	
	
	@BeforeClass
	public void openingweb() {
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
	}
	@AfterTest
	public void quit() {
		if(driver!=null) {
		driver.quit();
	}
	}
	

}
