package selenium_package.Selenium_work;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase_search_02 {
	@Test
	public void amazon_login_page_using() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Amazon_login_page az_lgin=new  Amazon_login_page(driver);
	az_lgin.Un();
	az_lgin.countinue_button();
	az_lgin.passward_button();
	az_lgin.signin_button();
	az_lgin.searchprod();

	Amazon_searchresult_page az_search_result=new  Amazon_searchresult_page(driver);

	az_search_result.prdct();


}
}
