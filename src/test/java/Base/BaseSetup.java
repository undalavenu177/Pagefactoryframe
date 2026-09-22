package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utilities.Driverfactory;
import Utilities.configReader;

public class BaseSetup {
	configReader cr;
	protected WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void basetest(String browser) throws IOException {
		cr= new configReader();
		 Driverfactory.drive(browser);
		driver = Driverfactory.getDriver();
		driver.get(cr.Value("Url"));
		driver.manage().window().maximize();
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
