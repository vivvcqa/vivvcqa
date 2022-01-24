package pages;
import java.util.List; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.interactions.Actions; 
import org.openqa.selenium.support.CacheLookup; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 
import org.testng.Assert; 
import org.openqa.selenium.support.ui.*; 
import base.TestBase; 

public class HomePage extends base.TestBase{
	
	 //USER ROLES 

	@FindBy(id="sysConfigBtn") 
    WebElement sysconfig; 
	@FindBy(xpath = "//*[@id=\"p-accordiontab-0-content\"]/div/div/div/ul/li[1]") 
    WebElement users; 
    @FindBy(xpath = "//*[@id=\"p-accordiontab-0-content\"]/div/div/div/ul/li[2]") 
    WebElement user_roles; 
    @FindBy(xpath = "//*[@id='searchCareTeamTxtInput']") 
    WebElement adduser; 
    @FindBy(xpath ="//*/div/div/div/div[1]/div[1]/div[2]/div/button") 
    WebElement clickadd; 
    @FindBy(xpath= "//*[@id=\"rolebox\"]/p-listbox/div/div/ul/li[1]/li/span") 
    WebElement role1; 
    @FindBy(xpath ="/p-listbox/div/div/ul/li")
    WebElement addeduser;
    @FindBy(xpath="//*[@class ='p-listbox-list-wrapper']/ul/li[last()]")
    WebElement locateuser;
    @FindBy(xpath= "//*[@id='rolebox']/p-listbox/div/div/ul/li[2]/li/span") 
    WebElement role2; 
    @FindBy(xpath= "//*[@id='rolebox']/p-listbox/div/div/ul/li[3]/li/span") 
    WebElement role3; 
    @FindBy(xpath = "//*/vcp-user-care-team-maintainance/div/div/div/div[1]/div[2]/div[2]/div/button") 
    WebElement delete; 
    @FindBy(xpath = "//*/vcp-system-config/div/div/div[2]/div[2]/vcp-user-care-team-maintainance/div/p-confirmdialog/div/div/div[1]") 
    WebElement message; 
    @FindBy (xpath = "//*/vcp-user-care-team-maintainance/div/p-confirmdialog/div/div/div[3]/p-footer/button[1]") 
    WebElement confirm; 
    @FindBy(xpath = "//*/vcp-user-care-team-maintainance/div/p-confirmdialog/div/div/div[3]/p-footer/button[2]/span[2]") 
    WebElement cancel; 

	 

	 

	//users 

	@FindBy(xpath = "//*/div/div/button[2]") 
    WebElement newuser; 
    @FindBy(xpath = "//*[@id=\"first_name\"]") 
    WebElement firstname; 
    @FindBy(xpath = "//*[@id=\"last_name\"]") 
    WebElement lastname; 
    @FindBy(xpath = "//*[@id=\"emailAddress\"]") 
    WebElement email; 
    @FindBy(xpath ="//*[@id=\"pri_phone\"]") 
    WebElement phone; 
    @FindBy(xpath = "//*[@id=\"password\"]") 
    WebElement password1; 
    @FindBy(xpath="//*[@id=\"confirm_password\"]") 
    WebElement password2; 
    @FindBy (xpath ="//*[14]/div[1]/div/label/span") 
    WebElement schedule; 
    @FindBy (xpath="//*/vcp-user-maintenance/div/div/div/div[2]/form/div/div[2]/div/button") 
    WebElement saveu; 
    @FindBy(id = "searchProStakeTxtInput") 
    WebElement Search; 

	 

	 

	 

	public HomePage() { 

	PageFactory.initElements(driver, this); 

	} 

	 

	public void sysconfig() throws Exception{ 
    Thread.sleep(4000);
	sysconfig.click(); 

	 

	} 

	//USERS 

	public void users(){ 

	users.click(); 

	} 

	public void newuser() { 

	    newuser.click(); 

	} 

	public void userroles() throws Exception { 

	    user_roles.click(); 

	    Thread.sleep(2000); 

	} 

	public void fname() throws Exception { 

	firstname.sendKeys(prop.getProperty("firstname")); 

	Thread.sleep(2000); 

	} 

	public void lname() { 

	lastname.sendKeys(prop.getProperty("lastname")); 

	} 

	public void phone() { 

	phone.sendKeys(prop.getProperty("phone")); 

	} 

	public void email() { 

	email.sendKeys(prop.getProperty("email")); 

	} 

	public void password1() { 

	password1.sendKeys(prop.getProperty("password1")); 

	} 

	public void password2() { 

	password2.sendKeys(prop.getProperty("password2")); 

	} 

	public void schedule() throws Exception { 

	schedule.click(); 

	 

	} 

	 

	public void Search() { 

	//save.click(); 

	} 

	//USER ROLES 

	 

	public void addUser() throws Exception {	 

	adduser.click(); 

	adduser.sendKeys("testvx"); 

	} 

	public void click_Add() throws Exception { 

	clickadd.click(); 
	Thread.sleep(4000);
	

	 

	} 
	
	

		
	public void locateuser() {
		
		locateuser.click();
	}
			
		
		
		
	
	

	public void enable_role() { 

	role1.isEnabled(); 

	} 

	 

	public void first_role() { 

	  role1.click(); 

	} 

	 

	public void deleteuser() { 

	  delete.click(); 

	  

	} 

	public void message() { 

	message.click(); 

	message.isEnabled(); 

	} 

  public void confirm() throws Exception { 

	    	Thread.sleep(3000); 

	        confirm.click(); 

	  

	} 

	 

}
