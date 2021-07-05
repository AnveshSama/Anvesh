package utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.AddProduct;
import pages.Loginpage;
import pages.RegisterPage;



public class BaseClass {
	
	public static WebDriver driver;
	public static Properties PropertiesObj;
	
	public static FileInputStream fis;
	
	public static File f;
	public static Actions action;
	
	public static Select select;
	
	public static pages.Loginpage loginpageobj;
	
	public static pages.AddProduct Addproductobj;
	
	public static pages.RegisterPage RegisterPageobj;
	
	public static pages.ForgotPass forgotpassobj;
	
	public static pages.ContactUS ContactUsobj;
	
	

    public static void Base() throws Exception
	{
	
	PropertiesObj = new Properties();
	fis = new FileInputStream(System.getProperty("user.dir")+"\\Conig.properties");
	PropertiesObj.load(fis);
	
	}
	
	public static void openbrower(){
		
	if(PropertiesObj.getProperty("BrowserType").equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samaa\\chromedriver.exe");
	driver=new ChromeDriver();
		 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	
	}
	public static void pageinit(){
		
		loginpageobj=PageFactory.initElements(driver, pages.Loginpage.class);
		
		Addproductobj=PageFactory.initElements(driver, pages.AddProduct.class);
		
		RegisterPageobj=PageFactory.initElements(driver, pages.RegisterPage.class);
		
		forgotpassobj=PageFactory.initElements(driver, pages.ForgotPass.class);
		
		ContactUsobj= PageFactory.initElements(driver, pages.ContactUS.class);
		
		
	}
	public static void openURL(){
		
		driver.get(PropertiesObj.getProperty("URL"));
		
	}
	

	public static void sendData(WebElement element ,String data)
	{
		element.sendKeys(data);
	}
	public static String getdata(WebElement element )
	{
		return element.getText();
	}
	
	public static void sleep(int sec)
	{
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void click(WebElement element)
	{
		
		element.click();
		
	}
	public static void clearData(WebElement element )
	{
		element.clear();
	}
	
	
	
	public static void moveOnToElement(WebElement element)
	{
		action = new Actions(driver);
		sleep(2);
	
		action.moveToElement(element).build().perform();
		sleep(1);
	}
	public static void selectByVisibleText(WebElement element,String data)
	{
		
		select=new Select(element);
		
		select.selectByVisibleText(data);
		sleep(2);
	}
	
	public static void selectByValue(WebElement element,String value)
	{
		
		select=new Select(element);
		
		select.selectByValue(value);
		sleep(2);
	}
	
	
	public static void selectByIndex(WebElement element,int index)
	{
		
		select=new Select(element);
		
		select.selectByIndex(index);
		sleep(2);
	}
	
	public static void initial(){
		
		Loginpage.myaccount_link.click();
		
		sleep(3);
		
		Loginpage.CreatAcount_link.click();
		
		sleep(5);
		
		
	}
	
    public static void Register() {
    	
    	RegisterPage.firstName_bx.sendKeys(PropertiesObj.getProperty("Fname"));
    	RegisterPage.Lastname_bx.sendKeys(PropertiesObj.getProperty("Lname"));
    	RegisterPage.phone_bx.sendKeys(PropertiesObj.getProperty("phn"));
    	RegisterPage.email_bx.sendKeys(PropertiesObj.getProperty("email"));
    	RegisterPage.password_bx.sendKeys(PropertiesObj.getProperty("pass"));
    	RegisterPage.passconfirm_bx.sendKeys(PropertiesObj.getProperty("passconform"));
		
	
		   
	}
	
	public static void Login(){
		
		Loginpage.Email_bx.sendKeys(PropertiesObj.getProperty("Username"));
		Loginpage.password_bx.sendKeys(PropertiesObj.getProperty("password"));
		Loginpage.Login_btn.click();
		
	}
	
	public static void AddProducts(){
		
		AddProduct.productName_bx.sendKeys(PropertiesObj.getProperty("Pname"));
		AddProduct.productPrice_bx.sendKeys(PropertiesObj.getProperty("Pprice"));
		AddProduct.productQuantity_bx.sendKeys(PropertiesObj.getProperty("PQuantity"));

		AddProduct.productDescription_bx.sendKeys(PropertiesObj.getProperty("PDesc"));

		AddProduct.modelnumber_bx.sendKeys(PropertiesObj.getProperty("ModelNmb"));
		AddProduct.productCategory_bx.sendKeys(PropertiesObj.getProperty("PCategory"));

		AddProduct.year_bx.sendKeys(PropertiesObj.getProperty("year"));

		AddProduct.ADD_btn.click();
		
		
	}
	
	public static void Navigate() {
		
		driver.navigate().back();
		
		
	}
	
     public static void ForgotPass() {
    	 
    	 pages.ForgotPass.ForgotPass_btn.click();
    	 
    	 pages.ForgotPass.email_bx.sendKeys(PropertiesObj.getProperty("Email"));
    	 
    	 pages.ForgotPass.send_btn.click();
    	 
   
	  
    }
		
     public static void ContactUs() {
    	 
    	 
    	 pages.ContactUS.Contacts_btn.click();
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
    	 js.executeScript("window.scrollBy(0,500)");
    	 pages.ContactUS.YourName_Bx.sendKeys(PropertiesObj.getProperty("YourName"));
    	 pages.ContactUS.email_Bx.sendKeys(PropertiesObj.getProperty("Email"));
    	 pages.ContactUS.subject_Bx.sendKeys(PropertiesObj.getProperty("subject"));
    	 pages.ContactUS.message_Bx.sendKeys(PropertiesObj.getProperty("message"));
    	 pages.ContactUS.SendMsg_btn.click();
		
	}
	
	
}
	

