package E_commerce.EcommerceAutomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DataFolder.DDTExcel;

public class LoginPage {
	DDTExcel d1 = new DDTExcel();
@FindBy(xpath = "(//div[@class='signup-form']/form/input)[2]")
WebElement nameField;

@FindBy(xpath = "(//div[@class='signup-form']/form/input)[3]")
WebElement emailField;

@FindBy(xpath= "(//button[@class='btn btn-default'])[2]")
WebElement signupButton;


@FindBy(xpath= "(//div[@class='login-form']/form/input)[2]")
WebElement loginEmailField;

@FindBy(xpath= "(//div[@class='login-form']/form/input)[3]")
WebElement loginPasswordField;

@FindBy(xpath= "(//button[@class= 'btn btn-default'])[1]")
WebElement loginButton;
public void setUsername() throws EncryptedDocumentException, IOException {
	
	String username = d1.GetValueFromExcel("Sign-up", 1, 0);
	nameField.sendKeys(username);
}

public void setEmailAddress() throws EncryptedDocumentException, IOException {
	
	String emailAddress = d1.GetValueFromExcel("Sign-up", 1, 1);
	emailField.sendKeys(emailAddress);
}

public void clickSignupButton() throws EncryptedDocumentException, IOException {
	
	signupButton.click();
}

public void setLoginEmailAddress() throws EncryptedDocumentException, IOException {
	String loginemailAddress = d1.GetValueFromExcel("login", 1, 0);
	loginEmailField.sendKeys(loginemailAddress);
}
public void setLoginPassword() throws EncryptedDocumentException, IOException {
	String loginPassword = d1.GetValueFromExcel("login", 1, 1);
	loginPasswordField.sendKeys(loginPassword);
}

public void clickloginButton() throws EncryptedDocumentException, IOException {
	
	loginButton.click();
}
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
