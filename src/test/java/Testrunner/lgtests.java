package Testrunner;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseSetup;

import Pages.Login;
import Utilities.ExcelUtility;

public class lgtests extends BaseSetup{
	@Test (dataProvider="lgsheet",priority=1,invocationCount = 2,threadPoolSize = 2)
	public void lgest(String user,String pass) {
		Login lg= new Login(driver);
		lg.lgtest(user, pass);
	}
	
	@DataProvider (name="lgsheet")
	public Object [][] lgte() throws IOException {
		String path="C:\\Users\\TESTING\\Downloads\\data5.xlsx";
		return ExcelUtility.data(path, "Sheet2");
		
	}
	
	

}
