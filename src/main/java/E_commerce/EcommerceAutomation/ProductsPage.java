package E_commerce.EcommerceAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	@FindBy(id= "search_product")
	WebElement searchField;
	
	
	
	public void clickOnSignupLoginButton() {
		searchField.click();
	}
	
	public void sendProductValue(String data) {
		searchField.sendKeys(data+Keys.ENTER);
	}
	
	
	
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor e1 = (JavascriptExecutor) driver;
		e1.executeScript("window.scrollBy(0,-200)");
	}
	
	
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
