package E_commerce.EcommerceAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(linkText = "Signup / Login")
	WebElement signupLoginButton;
	
	
	@FindBy(linkText= "Contact us")
	WebElement contactUsLink;
	
	@FindBy(xpath= "(//div[@class = 'shop-menu pull-right']/ul/li)[2]")
	WebElement productLink;
	
	public void clickOnSignupLoginButton() {
		signupLoginButton.click();
	}
	
	
	public void clickOnContactUsLink() {
		contactUsLink.click();
	}
	
	public void clickOnproductLink() {
		productLink.click();
	}
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
