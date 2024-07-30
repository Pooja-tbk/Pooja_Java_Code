package selenium_package.Selenium_work;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_product_page {
	
	@FindBy(xpath="//input[@id='add-to-wishlist-button-submit']")
	WebElement addto_wishlist;
	
	@FindBy(linkText="View Your List")
	WebElement view_wishlist;
	
	//@FindBy(className="a-button-text")
	//WebElement addtocart;
	

	
	//create method
	
	
	public void wishlist() {
		addto_wishlist.click();
    }
	
	public void view_wish() {
		view_wishlist.click();
	}
	
	
	//public void addtocart_page() {
	//	addtocart.click();
	//}
	
	
	
	//initialize
	public Amazon_product_page(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	


}
