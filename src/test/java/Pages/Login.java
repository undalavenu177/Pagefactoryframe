package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.WaitUtils;

public class Login {
	WebDriver driver;
	WaitUtils waits;
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement UserID;
	@FindBy (xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement Pwdd;
	@FindBy (xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement Lgbtn;
	public Login(WebDriver driver) {
		this.driver= driver;
		waits= new WaitUtils();
		PageFactory.initElements(driver, this);
		
	}
	public void lgtest(String Uname,String Pwd) {
		waits.Visible(UserID).sendKeys(Uname);
		waits.Visible(Pwdd).sendKeys(Pwd);
		waits.clickable(Lgbtn).click();
	    try {
	        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(3))
	                .until(ExpectedConditions.alertIsPresent());

	        System.out.println("Alert message: " + alert.getText());
	        alert.accept();

	    } catch (TimeoutException e) {
	        System.out.println("No alert displayed");
	    }
	}

}
