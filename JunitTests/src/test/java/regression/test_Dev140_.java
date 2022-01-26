package regression;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import base.TestBase;
import pages.homePage;
import pages.LoginPage;
import util.TestUtil;

public class test_Dev140_ extends TestBase {
	
	LoginPage loginPage; 
    homePage hp; 
    TestUtil testUtil; 
   
    
    @Before
	public void setUp() throws Exception {
    	initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		hp = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//Logger log = Logger.getLogger(Dev140_Test_userroles.class);
		
	}
    
	
	
	@Test
	public void Add_UserRole() throws Exception {
		
		
		
		
		hp.sysconfig();
		hp.userroles();
		hp.addUser();
	    hp.click_Add();
	    hp.locateuser();
	    hp.first_role();
	    hp.deleteuser();
		driver.switchTo().defaultContent();
		hp.confirm();
		
		/*
		homePage.sysconfig();
		homePage.userroles();
		homePage.addUser();
	    homePage.click_Add();
	    homePage.locateuser();
	    homePage.first_role();
	    homePage.deleteuser();
		driver.switchTo().defaultContent();
		homePage.confirm();
		*/
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(8000);
		driver.quit();
	}
	
}
  
	
	
	


	
	


