package E_commerce.EcommerceAutomation;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest extends LaunchAndquit {

	@Test()
	public void testSignup() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage h1 = new HomePage(driver);
		h1.clickOnSignupLoginButton();
		
		LoginPage l1 = new LoginPage(driver);
		l1.setUsername();
		l1.setEmailAddress();
		l1.clickSignupButton();
		
		SignupPage s1 = new SignupPage(driver);
		s1.inputPasswordField();
		s1.setFirstName();
		s1.setLastName();
		s1.addressField();
		s1.setCountry();
		s1.cityField();
		s1.setState();
		s1.setZipcode();
		s1.setPhoneNumber();
      //  s1.scrolldown(driver);
		//s1.clickonCreateAccountButton(driver);
	//	s1.scrolldown(driver);
//driver.manage().timeouts().implicitlyWait(driver,Duration.ofSeconds(20));
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - Account Created", "Sorry the title is not matching.");
	}
	
	
}
