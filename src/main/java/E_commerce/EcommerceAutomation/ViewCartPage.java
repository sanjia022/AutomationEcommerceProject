package E_commerce.EcommerceAutomation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage {
	
	
	@FindBy(xpath = "//td[@class = 'cart_quantity']")
	WebElement quantityField;
	

	
	
	
	
	public void getTextQuantity() {
	String textValue=	quantityField.getText();
	System.out.println(textValue);
	}
	
	
	public ViewCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
