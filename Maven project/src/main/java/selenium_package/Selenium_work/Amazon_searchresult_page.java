package selenium_package.Selenium_work;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_searchresult_page {
	
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-tall-aspect'][1]")
	WebElement product;
	
	//create method
	
	public void prdct() {
		product.click();
	}
	
	//initialize
	public Amazon_searchresult_page(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	


}

