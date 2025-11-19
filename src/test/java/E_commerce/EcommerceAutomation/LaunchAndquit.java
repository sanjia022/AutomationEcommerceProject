package E_commerce.EcommerceAutomation;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
	
	@AfterMethod()
	public void TearDown(){
		driver.quit();
		
	}

}
