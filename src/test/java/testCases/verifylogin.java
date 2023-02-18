package testCases;

import java.io.IOException;




import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageobjectModel.LoginPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifylogin extends baseClass {
	

	@Test(dataProvider="testData")
	
	
	public void login(String uname,String password) throws IOException {
		
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		
		commonMethods.handleAssertions(driver.getCurrentUrl(),"https://login.salesforce.com/", "url is not matching");
		
		obj.enterusername().sendKeys(uname);
		
		obj.enterpassword().sendKeys(password);
		
		obj.clickonrLogin().click();
		
		commonMethods.handleAssertions(obj.errortext().getText(),constants.expectedErrorMessage,"Error message is not matching");
			
		
	
		
		
	}
	@DataProvider
	public Object[][] testData(){
		Object[][]data=new Object[2][2];
		data[0][0]=constants.username1;
		data[0][1]=constants.password1;
		data[1][0]=constants.username2;
		data[1][1]=constants.password2;
		
		
		return data;

	}
	
}
