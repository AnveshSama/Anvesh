package ExecutableTests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class sampleTest1 extends BaseClass {

	@Test
	@BeforeSuite
	public void intialization1() throws Exception{
		
		Base();
		
		openbrower();
		
	
		pageinit();
		
		openURL();
		 
	
	    }
		
		@BeforeTest
		
		public void Test2() {
			
		
		initial();
		
		sleep(3);
	
		
		Register();
		
		sleep(3);

	}
	
	    @BeforeMethod
		
		public void Test3() {
		
		Login();
		
		sleep(3);
		
	    }
		
        @BeforeMethod
			
		public void Test4() {
		
		AddProducts();
		
		sleep(3);
		
		Navigate();
		
		sleep(3);
		
		
		ForgotPass();
		
		sleep(3);
		
		Navigate();
		
		sleep(3);
       
		ContactUs();
		
		sleep(3);
		
		
	
		
	}
	@AfterSuite
	public void closedriver(){
		
		driver.close();
		
		
}}
