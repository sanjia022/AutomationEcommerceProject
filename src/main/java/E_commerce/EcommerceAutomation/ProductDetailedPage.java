package E_commerce.EcommerceAutomation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailedPage {
	
	@FindBy(xpath = "//input[@id = 'quantity']")
	WebElement quantityCheckbox;
	
	@FindBy(xpath ="//button[@class ='btn btn-default cart']")
	WebElement addToCartButton;
	
	@FindBy(linkText = "View Cart")
	WebElement viewcartLink;
	
	
	public void updateQuantity() {
		quantityCheckbox.sendKeys(Keys.ARROW_UP);
		quantityCheckbox.sendKeys(Keys.ARROW_UP);
		quantityCheckbox.sendKeys(Keys.ARROW_UP);
		
	}
	
	
	public void clickOnAddtoCartButton() {
		addToCartButton.click();
	}
	
	public void clickOnViewcartLinkText() {
		viewcartLink.click();
	}
	public ProductDetailedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
