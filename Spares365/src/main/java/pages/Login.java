package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	

		@FindBy(xpath="//*[@id='txtUsername']")
		public static WebElement UserName_txt;
		
		@FindBy(id="txtPassword")
		public static WebElement Password_txt;
		
		
		@FindBy(id="btnLogin")
		public static WebElement Login_button;
		
		
		

}
