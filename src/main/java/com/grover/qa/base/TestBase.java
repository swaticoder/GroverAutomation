package com.grover.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver ;
	public static Properties prop;
	
	public TestBase(){
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:/Users/swati/eclipse-workspace/GroverAutomation/src/main/java/com/grover/qa/config/config.properties");
			prop.load(ip);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:/Users/swati/eclipse-workspace/GroverAutomation/src/main/java/com/crm/qa/util/chromedriver/chromedriver.exe");
		    driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("WebDriver.gecko.driver","Document/Download/geckodriver-v0.26.0-win64");
			driver=new FirefoxDriver();
			
		}
	 

    	driver.manage().deleteAllCookies();
        driver.get("http://www.imdb.com/chart/top");
        driver.manage().window().maximize();
        driver.navigate().refresh();
  
	}
	
	
}
