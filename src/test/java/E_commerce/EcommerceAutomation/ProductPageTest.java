package E_commerce.EcommerceAutomation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductPageTest extends LaunchAndquit{
	
	@Test(dataProvider= "data")
	
	public void testProductPage(String data) {
		HomePage h1 = new HomePage(driver);
		h1.clickOnproductLink();
		
		ProductsPage p1 = new ProductsPage(driver);
		p1.clickOnSignupLoginButton();
		p1.sendProductValue(data);
		//p1.scrollDown(driver);
		
		Assert.assertEquals("Automation Exercise - All Products", driver.getTitle());
	}
	@DataProvider(name ="data")
	public Object[][] dtatas(){
		return new Object[][] {{"top"},{"jeans"}};
	}

}
