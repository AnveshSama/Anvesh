package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

// Add Product	
	
	@FindBy(xpath="//input[@id='signup-firstName']")
	public static WebElement firstName_bx;
	
	@FindBy(xpath="//input[@id='signup-lastName']")
	public static WebElement Lastname_bx;
	
	@FindBy(xpath="//input[@id='signup-phone']")
	public static WebElement phone_bx;  
	
	@FindBy(xpath="//input[@id='signup-email']")
	public static WebElement email_bx;
	
	@FindBy(xpath="//input[@id='signup-password']")
	public static WebElement password_bx;
	
	
	@FindBy(xpath="//input[@id='signup-confirm']")
	public static WebElement passconfirm_bx;
	
	
	@FindBy(xpath="/html/body/app-root/app-root/div/div/div/app-page-login/div/div/div/div[2]/div/div/form/div[7]/button")
	public static WebElement Register_btn;
	
	
	
}
