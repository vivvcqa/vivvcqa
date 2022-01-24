package pages;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 
import base.TestBase; 

public class LoginPage extends base.TestBase{
	 

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

	 
public HomePage login(String un, String pwd) throws Exception{ 
  
	username.sendKeys("vivek.sandira@viecure.com"); 
    password.sendKeys("U52C97"); 
    login.click(); 
    Thread.sleep(3000);

	    	//JavascriptExecutor js = (JavascriptExecutor)driver; 

	   // js.executeScript("arguments[0].click();", login); 

     return new HomePage(); 
    
	} 

	 

	//Actions: 

	public String validateLoginPageTitle(){ 

	return driver.getTitle(); 

	} 

	 

	 
	
	

}
