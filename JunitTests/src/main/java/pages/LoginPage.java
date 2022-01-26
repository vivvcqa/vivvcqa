package pages;
import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.interactions.Actions; 
import org.openqa.selenium.support.CacheLookup; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 

import org.openqa.selenium.support.ui.*; 
import base.TestBase; 

public class LoginPage extends TestBase{
	 

	//Page Factory - OR: 

	@FindBy(name="username") 
    WebElement username; 
    @FindBy(name="password") 
    WebElement password; 
    @FindBy(xpath="//button[@label='Login']") 
    WebElement login; 

	 
	public LoginPage(){ 

	PageFactory.initElements(driver, this); 

	} 

	 
public homePage login(String un, String pwd) throws Exception{ 
  
	username.sendKeys("vivek.sandira@viecure.com"); 
    password.sendKeys("U52C97"); 
    login.click(); 
    Thread.sleep(3000);

	    	//JavascriptExecutor js = (JavascriptExecutor)driver; 

	   // js.executeScript("arguments[0].click();", login); 

     return new homePage(); 
    
	} 

	 

	//Actions: 

	public String validateLoginPageTitle(){ 

	return driver.getTitle(); 

	} 

	 

	 
	
	

}
