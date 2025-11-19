package E_commerce.EcommerceAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends LaunchAndquit {

	
	@Test 
	public void testContactUs() {
		HomePage h1 = new HomePage(driver);
		h1.clickOnContactUsLink();
		
		ContactUsPage c1 = new ContactUsPage(driver);
		c1.InputName();
		c1.InputEmail();
		c1.InputSubject();
		c1.InputMessage();
		c1.ClickOnFileUploadButton();
		c1.scrollDOwn(driver);
		c1.clickOnsubmitButton();
		
		c1.getHandleJavaScriptPopupText(driver);
		c1.handleJavaScriptPopUpText(driver);
		
	Assert.assertEquals("Success! Your details have been submitted successfully.", c1.getText(driver), "Sorry");
	
	c1.clickOnHomeButton();
	Assert.assertEquals("Automation Exercise", driver.getTitle());
	}
}
