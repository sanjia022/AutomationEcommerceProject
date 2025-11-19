package E_commerce.EcommerceAutomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAccountTest extends LaunchAndquit {

	
	@Test(timeOut =100000)
	public void testDeleteAccount() throws EncryptedDocumentException, IOException {
		
		HomePage h1 = new HomePage(driver);
		h1.clickOnSignupLoginButton();
		
		LoginPage l1 = new LoginPage(driver);
		l1.setLoginEmailAddress();
		l1.setLoginPassword();
		l1.clickloginButton();
		
		AutomationExercisePage a1 = new AutomationExercisePage(driver);
		a1.clickOnDeleteAccountLink();
		
		Assert.assertEquals(driver.getTitle(),"Automation Exercise - Account Created");
	}
}
