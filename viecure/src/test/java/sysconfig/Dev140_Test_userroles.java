package sysconfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import util.TestUtil;

public class Dev140_Test_userroles extends TestBase {
	
	LoginPage loginPage; 
    HomePage homePage; 
    TestUtil testUtil; 
   
    
    @BeforeMethod
	public void setUp() throws Exception {
    	initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Logger log = Logger.getLogger(Dev140_Test_userroles.class);
		
	}
    
	
	
	@Test
	public void Add_UserRole() throws Exception {
		homePage.sysconfig();
		homePage.userroles();
		homePage.addUser();
	    homePage.click_Add();
	    homePage.locateuser();
	    homePage.first_role();
	    homePage.deleteuser();
		driver.switchTo().defaultContent();
		homePage.confirm();
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(8000);
		driver.quit();
	}
	
}
  