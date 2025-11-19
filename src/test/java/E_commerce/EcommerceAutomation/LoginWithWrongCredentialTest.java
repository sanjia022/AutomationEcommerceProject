package E_commerce.EcommerceAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithWrongCredentialTest extends LaunchAndquit{

	
	@Test(dataProvider= "input",groups= {"regression"})
	public void testLoginWithWrongCredential(String username, String password) {
		HomePage h1 = new HomePage(driver);
		h1.clickOnSignupLoginButton();
		LoginPage l1 = new LoginPage(driver);
		l1.loginEmailField.sendKeys(username);
		l1.loginPasswordField.sendKeys(password);
		Assert.assertTrue(driver.findElement(By.linkText("Signup / Login")).isDisplayed());
	}
	
	@DataProvider(name = "input")
	public Object[][] data(){
	
		
		Object[][] d1  = new Object[2][2];
		d1[0][0] ="amreeas1@gmail.com";
		d1[0][1] = "jhgjgjgk";
		
		d1[1][0] ="hksflkahfks@gmail.com";
		d1[1][1] ="Amreen123@" ;
		
		return d1;
		
	}
}
