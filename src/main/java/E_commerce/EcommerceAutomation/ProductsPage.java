package E_commerce.EcommerceAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {
	@FindBy(id= "search_product")
	WebElement searchField;
	
	@FindBy(xpath="(//div[@class ='productinfo text-center'])[1]")
	WebElement firstProduct;
	
	@FindBy(xpath="(//div[@class ='productinfo text-center'])[2]")
	WebElement secondProduct;
	
	
	@FindBy(xpath = "(//a[@class ='btn btn-default add-to-cart'])[1]")
	WebElement addToCartOnModal;
	
	@FindBy(xpath ="//button[@class ='btn btn-success close-modal btn-block']")
	WebElement continueShoppingButton;
	
	
	@FindBy(linkText ="View Cart")
	WebElement viewCartButton;
	
	public void clickOnSignupLoginButton() {
		searchField.click();
	}
	
	public void sendProductValue(String data) {
		searchField.sendKeys(data+Keys.ENTER);
	}
	
	public void hoverOverFirstProduct(WebDriver driver) {
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(firstProduct).perform();
		
	
	}
	
public void hoverOverSecondProduct(WebDriver driver) {
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(secondProduct).perform();
		
	
	}
	
	public void clickOnAddToCartButtonOnModal() {
		addToCartOnModal.click();
	}
	
	public void clickOnContinueShopping() {
		continueShoppingButton.click();
	}
	
	public void clickOnViewButton() {
		viewCartButton.click();
	}
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
