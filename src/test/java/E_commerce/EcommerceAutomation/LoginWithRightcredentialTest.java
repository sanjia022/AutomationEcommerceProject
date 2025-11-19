package E_commerce.EcommerceAutomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithRightcredentialTest extends LaunchAndquit {

	@Test()

	public void testLogin() throws EncryptedDocumentException, IOException {
		HomePage h1 = new HomePage(driver);
		h1.clickOnSignupLoginButton();

		LoginPage l1 = new LoginPage(driver);
		l1.setLoginEmailAddress();
		l1.setLoginPassword();
		l1.clickloginButton();

		
		 Assert.assertEquals("Automation Exercise", driver.getTitle());
		 
	}

	@Test(dependsOnMethods = "testLogin")
	public void logoutTest() {
		AutomationExercisePage a1 = new AutomationExercisePage(driver);
		a1.clickOnlogouttLink();
		
		Assert.assertTrue(driver.findElement(By.xpath("(//button[@class= 'btn btn-default'])[1]")).isDisplayed());;
	}

}
