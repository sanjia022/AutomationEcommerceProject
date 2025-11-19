package E_commerce.EcommerceAutomation;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataFolder.DDTExcel;

public class SignupPage {
	DDTExcel d1 = new DDTExcel();
	
	@FindBy(id = "password")
	WebElement passwordField;
	

	@FindBy(id = "first_name")
	WebElement firstNameField;
	
	@FindBy(id = "last_name")
	WebElement lastNameField;
	
	@FindBy(id = "address1")
	WebElement address1Field;
	
	@FindBy(id = "country")
	WebElement countryDropdown;
	
	@FindBy(id = "state")
	WebElement stateField;
	
	@FindBy(id = "city")
	WebElement cityField;
	
	@FindBy(id = "zipcode")
	WebElement zipcodeField;
	
	@FindBy(id = "mobile_number")
	WebElement mobileField;
	
	
	@FindBy(xpath= "(//button[@class='btn btn-default'])[1]")
	WebElement creteAccountButton;
	
	public void inputPasswordField() throws EncryptedDocumentException, IOException {
		String password = d1.GetValueFromExcel("Sign-up", 1, 2);
		passwordField.sendKeys(password);
	}
	
	public void setFirstName() throws EncryptedDocumentException, IOException {
		String firstname = d1.GetValueFromExcel("Sign-up", 1, 3);
		firstNameField.sendKeys(firstname);
	}
	
	
	public void setLastName() throws EncryptedDocumentException, IOException {
		String lastname = d1.GetValueFromExcel("Sign-up", 1, 4);
		lastNameField.sendKeys(lastname);
	}
	
	public void addressField() {
		address1Field.sendKeys("123 address road");
	}
	
	public void setCountry() {
		Select s1 = new Select(countryDropdown);
		s1.selectByVisibleText("United States");
	}
	
	public void setState() {
		stateField.sendKeys("GA");
	}
	
	
	public void cityField() {
		cityField.sendKeys("AWErter");
	}
	
	
	public void setZipcode() throws EncryptedDocumentException, IOException {
		String zipcode = d1.GetNumericValueFromExcel("Sign-up", 1, 6);
		zipcodeField.sendKeys(zipcode);
	}
	
	
	public void setPhoneNumber() throws EncryptedDocumentException, IOException {
		String phonenumber = d1.GetNumericValueFromExcel("Sign-up", 1, 7);
		mobileField.sendKeys(phonenumber + Keys.ENTER);
	}
	
	public void clickonCreateAccountButton(WebDriver driver) {
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(60));
		w1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-default'])[1]")));
		creteAccountButton.click();
	}
	
	
	
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void scrolldown(WebDriver driver) {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//js1.executeScript("window.scrollBy(0,-500)");
		js1.executeScript("arguments[0].click();", creteAccountButton);
		
	}
}
