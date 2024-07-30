package selenium_package.Selenium_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_addto_cart {
	
	@FindBy(linkText="Add to Cart")
	WebElement addtocart;
	
	
		@FindBy(linkText="Go to Cart")
		WebElement proceed_to_buy;
		
		public void addtocart_page() {
			addtocart.click();
			}
		
		public void continue_shopping_button() {
			proceed_to_buy.click();
		}
		
		public Amazon_addto_cart(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}	
		
}



