package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPass {
	
	@FindBy(xpath="/html/body/app-root/app-root/div/div/div/app-page-login/div/div/div/div[1]/div/div/form/div[2]/small/a")
	
    public static WebElement ForgotPass_btn;
	
	@FindBy(name="email")
     
	public static WebElement email_bx;
	
	@FindBy(xpath="/html/body/app-root/app-root/div/div/div/app-page-reset-password/div/form/div/div[2]/p/input")
	
	public static WebElement send_btn;
}
