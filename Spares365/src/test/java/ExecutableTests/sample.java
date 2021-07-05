package ExecutableTests;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pages.AddProduct;
import utilities.BaseClass;

public class sample extends BaseClass {

	
	@Test

	public static void Test1() throws Exception{
		
		AddProduct.productName_bx.sendKeys("BRKT-BPR SIDE,L");
		AddProduct.productPrice_bx.sendKeys(String.valueOf("82"));
		AddProduct.productQuantity_bx.sendKeys(String.valueOf("20"));

		AddProduct.productDescription_bx.sendKeys("RNM ALLIANCE (RENAULT, NISSAN, MITSUBISHI)");

		AddProduct.modelnumber_bx.sendKeys(String.valueOf("52522"));
		AddProduct.productCategory_bx.sendKeys("BUMPER");

		AddProduct.year_bx.sendKeys(String.valueOf("2021"));

		AddProduct.Choosefile_btn.click();
		
		sleep(3);
		
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\Stigentech\\Selinium\\Autoit\\upload.exe");
		
		// Runtime.getRuntime().exec("‪F:\\AutoIt\\Spare365T1.exe");

		 sleep(3);
		 
		Addproductobj.ADD_btn.click();
 
	
		sleep(3);
		
		
		driver.navigate().refresh();
		
	}
	
	@DataProvider
	public  Object [] [] Dataprovider() throws Exception{
		//return null;
		
		return utilities.ExcelBase.getData(System.getProperty("user.dir")+"\\Testdata\\Spare365.xlsx", "Sheet1");

	}
}
