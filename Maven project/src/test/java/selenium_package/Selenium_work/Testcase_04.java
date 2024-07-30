package selenium_package.Selenium_work;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase_04 {
	WebDriver driver;
	@Test
	public void amazon_login_page_using() throws InterruptedException {
		driver=new ChromeDriver();
	//WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Amazon_login_page az_lgin=new  Amazon_login_page(driver);
	az_lgin.Un();
	az_lgin.countinue_button();
	az_lgin.passward_button();
	az_lgin.signin_button();
	az_lgin.searchprod();

	Amazon_searchresult_page az_search_result=new  Amazon_searchresult_page(driver);

	az_search_result.prdct();
Thread.sleep(2000);

	
Set<String>ids=driver.getWindowHandles();
Iterator<String> it=ids.iterator();//
String pc_id=it.next();
String c_id=it.next();
System.out.println(pc_id);
System.out.println(c_id);

driver.switchTo().window(c_id);

Amazon_product_page az_product1=new  Amazon_product_page(driver);

az_product1.wishlist();

az_product1.view_wish();


Amazon_addto_cart add_tocart=new Amazon_addto_cart(driver);
Thread.sleep(2000);
add_tocart.addtocart_page();
add_tocart.continue_shopping_button();
Thread.sleep(2000);

	

}
}

