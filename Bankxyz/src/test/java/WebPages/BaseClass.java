package WebPages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases.DriverSetUp;

public class BaseClass extends DriverSetUp{
	public void ClickMethod(WebElement ele) {
		ele.click();
		
	}
	
		public void waits(WebDriver driver,Duration time,By loc) {
			 
			WebDriverWait wait = new WebDriverWait(driver,time);
 
			wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
 
		}

}
