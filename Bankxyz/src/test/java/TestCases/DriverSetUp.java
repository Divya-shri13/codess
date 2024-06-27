package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {
	public static WebDriver driver;

	@BeforeSuite
	public void browserSetup() {
		
		
		
		// String actUrl ="https://demowebshop.tricentis.com/";
		//System.setProperty("webdriver.edge.driver",
			//	"C:\\selenium\\edgedriver_win64\\msedgedriver.exe");
		// System.setProperty("WebDriver.edge.driver", ("user dir")+
		// "msedgedriver.exe");
		
		WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void CloseBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}

