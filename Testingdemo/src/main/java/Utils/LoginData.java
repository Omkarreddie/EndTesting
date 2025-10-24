package Utils;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class LoginData {

	@DataProvider(name="LoginData")
	public Object[][]  loginData() throws IOException
	{
		String filepath="C:\\Users\\Kiosk_user.SYNPYBRL1126X8C\\Desktop\\Selenium ETE\\Testingdemo\\Testdata\\login.xlsx";
		return Excel.getCredentials(filepath);
	}

}
