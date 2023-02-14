package testCases;

import java.io.IOException;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageobjectModel.LoginPageObjects;
import Resources.baseClass;

public class verifylogin extends baseClass {
	@Test
	public void login() throws IOException {
		
		driverIntilize();
		//This driver have scope
		driver.get("https://login.salesforce.com/");
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		
		obj.enterusername().sendKeys("rahul");
		
		obj.enterpassword().sendKeys("test");
		
		obj.clickonrLogin().click();
	}

	
}
