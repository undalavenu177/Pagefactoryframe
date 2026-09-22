package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	WebDriverWait waits;
	WebDriver driver;
	public WaitUtils () {
		waits= new WebDriverWait(driver, Duration.ofSeconds(1000));
	}
	public WebElement clickable(WebElement element) {
		return waits.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public WebElement Visible(WebElement element) {
		return waits.until(ExpectedConditions.visibilityOf(element));
	}

}
