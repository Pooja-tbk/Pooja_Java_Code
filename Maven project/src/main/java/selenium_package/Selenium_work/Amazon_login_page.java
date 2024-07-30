package selenium_package.Selenium_work;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login_page {
	
	
	@FindBy(name="email")
	WebElement username;

	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continueButton;
	
	@FindBy(name="password")
	WebElement passward;
	
	@FindBy(className="a-button-input")
	WebElement signin;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_product;
	
	public void Un() {
		username.sendKeys("poo996444@gmail.com");
	}
	
	public void countinue_button() {
		continueButton.click();
	}
	
	public void passward_button() {
		passward.sendKeys("RoyalCare@2024");
	}

	public void signin_button() {
		signin.click();
	}
	
	public void searchprod() {
		search_product.sendKeys("shoes");
		search_product.sendKeys(Keys.ENTER);
	}
	
	public Amazon_login_page(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	
}

