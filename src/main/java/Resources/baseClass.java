package Resources;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public WebDriver driver;
	
	public void driverIntilize() throws IOException {
		
		
  //This will read the properties
	FileInputStream fis=new FileInputStream("C:\\Users\\prasa\\eclipse-workspace\\SeleniumTestNgProject16thNov\\src\\main\\java\\Resources\\data.properties");
	
	//accee the properties file--
	
	Properties prop=new Properties();
	prop.load(fis);
	
	String browserName= prop.getProperty("browser");
	
	
	if(browserName.equalsIgnoreCase("chrome")) {
		
		 driver=new ChromeDriver();
		
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		//firefox code
		
	}
	else if (browserName.equalsIgnoreCase("Edge")) {
		//firefox code
	}
	else {
		System.out.println("please make sure you have correct browser");
	}
	
	
	
	
	}
	
	
	
	
	

}
