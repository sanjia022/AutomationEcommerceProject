package E_commerce.EcommerceAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExercisePage {
	@FindBy(xpath = "(//div[@class='shop-menu pull-right']/ul/li)[5]")
	WebElement deleteAccoutnlink;

	@FindBy(xpath = "(//div[@class='shop-menu pull-right']/ul/li)[4]")
	WebElement logoutlink;

	public void clickOnDeleteAccountLink() {
		deleteAccoutnlink.click();
	}
	
	public void clickOnlogouttLink() {
		logoutlink.click();
	}

	public AutomationExercisePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
