package E_commerce.EcommerceAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import DataFolder.ListenerLogic;
import DataFolder.RetryLogic;
@Listeners(ListenerLogic.class)

public class VerifyProductQauntityTest extends LaunchAndquit {

	
	@Test(retryAnalyzer=RetryLogic.class)
	public void testVerifyProductQauntity()
	{
		HomePage h1 = new HomePage(driver);
		h1.clickOnViewProduct();
		
		ProductDetailedPage p1 = new ProductDetailedPage(driver);
		p1.updateQuantity();
		p1.clickOnAddtoCartButton();
		p1.clickOnViewcartLinkText();
		
		ViewCartPage v1 = new ViewCartPage(driver);
		v1.getTextQuantity();
		
		Assert.assertTrue(driver.findElement(By.xpath("//td[@class = 'cart_quantity']")).isDisplayed());
		
	}
}
