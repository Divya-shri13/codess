package WebPages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page extends BaseClass {
	WebDriver driver;
	
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By Managerbutton = By.xpath("(//button[@class='btn btn-primary btn-lg'])[position()=2]");
	
	public void Managerbutton()  {
		waits(driver, Duration.ofSeconds(10), Managerbutton);
		WebElement ele =  driver.findElement(Managerbutton);
		ClickMethod(ele);
		
		
	
 
		}
		
	}



	
	
