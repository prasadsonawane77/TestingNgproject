package PageobjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	//This driver dont have scope
		public WebDriver driver; 
		
		private By username=By.xpath("//input[@id='username']");
		private By password=By.xpath("//input[@id='password']");
	    private By Login=By.xpath("//input[@id='Login']");
	    
	   
	    
		

		public LoginPageObjects(WebDriver driver2) {
			this.driver=driver2;
		}

		public WebElement enterusername(){
	    	return driver.findElement(username);
	    }
	    
	    public WebElement enterpassword(){
	    	return driver.findElement(password);
	    
	   }   
	    
	    public WebElement clickonrLogin(){
	    	return driver.findElement(Login);
	    	
	    }

}
