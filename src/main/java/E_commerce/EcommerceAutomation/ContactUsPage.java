package E_commerce.EcommerceAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	@FindBy(name = "name")
	WebElement nameInputField;

	@FindBy(name = "email")
	WebElement emailField;

	@FindBy(name = "subject")
	WebElement SubjectField;

	@FindBy(id = "message")
	WebElement messageField;

	@FindBy(name = "upload_file")
	WebElement upload_fileButton;

	@FindBy(name = "submit")
	WebElement submitButton;

	@FindBy(linkText = "Home")
	WebElement homeButton;

	@FindBy(xpath = "//div[@class = 'status alert alert-success']")
	WebElement getTextElement;

	public void InputName() {
		nameInputField.sendKeys("Joe Smith");

	}

	public void InputEmail() {
		emailField.sendKeys("JoeSmith@gmail.com");

	}

	public void InputSubject() {
		SubjectField.sendKeys("message");

	}

	public void InputMessage() {
		messageField.sendKeys("I'm a test.");

	}

	public void ClickOnFileUploadButton() {
		upload_fileButton.sendKeys("C:\\Users\\r88st\\AppData\\Roaming\\Zoom\\bin\\Zoom.exe");
	}

	public void clickOnsubmitButton() {
		submitButton.click();
	}

	public void clickOnHomeButton() {
		homeButton.click();
	}

	
	  public void getHandleJavaScriptPopupText(WebDriver driver) {

	  String test = driver.switchTo().alert().getText();
	  System.out.println(test);
	  
	  }
	  
	  public void handleJavaScriptPopUpText(WebDriver driver) {
	  driver.switchTo().alert().accept();
	  }
	  
	  
	  
	  public String getText(WebDriver driver ) { return getTextElement.getText(); }
	  
	  public void scrollDOwn(WebDriver driver) {
		 JavascriptExecutor e1 =  (JavascriptExecutor) driver;
		 e1.executeScript("window.scrollBy(0,-100)");
		 
	  }
	 
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
