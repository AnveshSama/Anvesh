package ExecutableTests;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.RegisterPage;
import utilities.ExcelBase;
import utilities.BaseClass;

public class Register extends BaseClass {


	@Test(dataProvider ="RegisterDataprovider" )

	public static void Test1(String Fname, String Lname,String phn,String email,String pass, String passconform ) throws IOException{


		
		sendData(RegisterPage.firstName_bx,Fname);
		sendData(RegisterPage.Lastname_bx,Lname);
		sendData(RegisterPage.phone_bx, phn);
		sendData(RegisterPage.email_bx,email);
		sendData(RegisterPage.password_bx,pass);
		sendData(RegisterPage.passconfirm_bx,passconform);
		click(RegisterPage.Register_btn);
		
		sleep(3);

		driver.navigate().refresh();
		sleep(5);

	}

	@DataProvider
	public  Object [] [] RegisterDataprovider() throws Exception{
		
		//return null;

		return utilities.ExcelBase.getData(System.getProperty("user.dir")+"\\Testdata\\Spares365.xlsx", "Sheet1");

	}
}
