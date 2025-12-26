package E_commerce.EcommerceAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import DataFolder.ListenerLogic;
@Listeners(DataFolder.ListenerLogic.class)


public class LaunchAndquit extends ListenerLogic{
	
	
	@BeforeMethod
	@Parameters("browser")
	public void launchTheBrowser(@Optional("chrome")String browser) {
		
		if(browser.equals("chrome")) {
			
			 driver = new ChromeDriver();
		}
		if(browser.equals("edge")) {
			
			
			driver=new EdgeDriver();
		}
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	public static void addImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void addExplicitWait(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	
	public static void jsClick(By locator) {
	    WebElement element = driver.findElement(locator);
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", element);
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");
	}

	
	@AfterMethod()
	public void TearDown(){
		driver.quit();
		
	}

}
