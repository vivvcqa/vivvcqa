package util;
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import base.TestBase; 

public class TestUtil extends TestBase{
	

	public  static long PAGE_LOAD_TIMEOUT = 20; 
    public static long IMPLICIT_WAIT = 20; 
    public static String TESTDATA_SHEET_PATH = "TestData.xlsx"; 

	 
	 

	//static Workbook book; 

	///static Sheet sheet; 

	//static JavascriptExecutor js; 

	 
	 

	public void switchToFrame() { 

	driver.switchTo().frame("mainpanel"); 

	} 
	
	
	

}
