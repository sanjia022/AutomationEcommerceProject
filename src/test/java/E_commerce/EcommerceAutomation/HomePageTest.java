package E_commerce.EcommerceAutomation;

import org.testng.annotations.Test;

public class HomePageTest extends LaunchAndquit {
	
	@Test (retryAnalyzer = DataFolder.RetryLogic.class,groups= {"regression"})
	public void testHomePage() {
		
		HomePage h1 = new HomePage(driver);
		h1.clickOnSignupLoginButton();
		
	}

}
