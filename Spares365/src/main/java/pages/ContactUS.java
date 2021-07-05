package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUS {
	
@FindBy(xpath="/html/body/app-root/app-root/div/div/header[2]/app-header/div/div[3]/app-topbar/div[3]/a")
	
    public static WebElement Contacts_btn;

 @FindBy(xpath="//*[@id=\"form-name\"]")

    public static WebElement YourName_Bx;
 
 @FindBy(xpath="//*[@id=\"form-email\"]")
 
   public static WebElement email_Bx;
 
 @FindBy(xpath="//*[@id=\"form-subject\"]")
  
   public static WebElement subject_Bx;
 
 @FindBy(xpath="//*[@id=\"form-message\"]")
 
   public static WebElement message_Bx;
 
 @FindBy(xpath="/html/body/app-root/app-root/div/div/div/app-page-contact-us-one/div/div/div/div/div/div[2]/div/form/button")
 
 public static WebElement SendMsg_btn;
}
