package com.crm.qa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

//Base class being used to initialize properties such as launch browser, maximize window, wait functions, get(url)
public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	//constructor class
	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream ip = new FileInputStream("D:\\EclipseInstallFolder\\EclipseWorkspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
	    } 
	}
	//Initialization method
	public static void initialization() {
		//read system property for browser
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\EclipseInstallFolder\\Softwares\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\EclipseInstallFolder\\Softwares\\geckodriver.exe");
			driver=new ChromeDriver();
		} 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//TestUtil.PAGE_LOAD_TIMEOUT & PLICIT_WAIT global variables imported from TestUtil class
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
}
	
	
}
