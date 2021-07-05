package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	//Myaccount 
	
	@FindBy(xpath="/html/body/app-root/app-root/div/div/header[2]/app-header/div/div[8]/app-indicator[2]/a/span[3]")
	public static WebElement myaccount_link;
	
	//Create New Account
	
	
	@FindBy(xpath="/html/body/app-root/app-root/div/div/header[2]/app-header/div/div[8]/app-indicator[2]/div/app-account-menu/form/div[5]/a")
	public static WebElement CreatAcount_link;
	
	
	//    login
	
	
	@FindBy(xpath="//*[@id='signin-email']")
	public static WebElement Email_bx;
	
	@FindBy(xpath="//*[@id='signin-password']")
	public static WebElement password_bx;
	
	@FindBy(xpath="/html/body/app-root/app-root/div/div/div/app-page-login/div/div/div/div[1]/div/div/form/div[4]/button")
	public static WebElement Login_btn;
	
}
