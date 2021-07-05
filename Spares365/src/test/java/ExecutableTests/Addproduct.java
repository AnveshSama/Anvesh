package ExecutableTests;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pages.AddProduct;
import utilities.BaseClass;

public class Addproduct extends BaseClass {

	
	@Test(dataProvider ="Dataprovider" )
	
	public static void Test1(String Pname, String price,String product,String Pdesc,String Model,String category, String year,String FilePath) throws IOException{
		
		
		Login();
		
		AddProduct.productName_bx.sendKeys(Pname);
		AddProduct.productPrice_bx.sendKeys(price);
		AddProduct.productQuantity_bx.sendKeys(product);

		AddProduct.productDescription_bx.sendKeys(Pdesc);

		AddProduct.modelnumber_bx.sendKeys(Model);
		AddProduct.productCategory_bx.sendKeys(category);

		AddProduct.year_bx.sendKeys(year);

		AddProduct.Choosefile_btn.click();
		
		 Runtime.getRuntime().exec("C:\\Users\\samaa\\Desktop\\fileupload\\FileUploadScript.exe"+" "+FilePath);

	//	Runtime.getRuntime().exec("F:\\AutoIt\\Spare365T1.exe");
		
		
		 AddProduct.ADD_btn.click();
 
	
	//	driver.navigate().refresh();
		
	}
	
	@DataProvider
	public  Object [] [] Dataprovider() throws Exception{
		//return null;
		
		return utilities.ExcelBase.getData(System.getProperty("user.dir")+"\\Testdata\\Spares365.xlsx", "Sheet2");


	}
}
