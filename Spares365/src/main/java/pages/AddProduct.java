package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProduct {

// Add Product	
	
	@FindBy(xpath="//input[@id='productName']")
	public static WebElement productName_bx;
	
	@FindBy(xpath="//input[@id='productPrice']")
	public static WebElement productPrice_bx;
	
	@FindBy(xpath="//input[@id='productQuantity']")
	public static WebElement productQuantity_bx;
	
	@FindBy(xpath="//input[@id='productDescription']")
	public static WebElement productDescription_bx;
	
	@FindBy(xpath="//input[@id='modelnumber']")
	public static WebElement modelnumber_bx;
	
	
	@FindBy(xpath="//input[@id='productCategory']")
	public static WebElement productCategory_bx;
	
	
	@FindBy(xpath="//input[@id='year']")
	public static WebElement year_bx;
	
	
	@FindBy(xpath="//*[@id='productImage']")
	public static WebElement Choosefile_btn;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	public static WebElement ADD_btn;
	
	
	
}
