package poc.test.PageObjects;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import automation.locators.*;

public class LoginPG extends TestBase implements LoginLoc,HomeLoc{
	public LoginPG(){
		PageFactory.initElements(ObjDriver, this);
	}

	public void enterValidCredentials() throws IOException {
		TestBase.waitUtillObject(ObjDriver, UserName);
		
		ObjDriver.findElement(UserName).sendKeys(TestBase.credentials("valid1"));
		//parameterize 
		ObjDriver.findElement(Password).sendKeys(TestBase.credentials("validPass1"));
		
		}
	
	public void enterPreBookCredentials() throws IOException
	{
TestBase.waitUtillObject(ObjDriver, UserName);
		
		ObjDriver.findElement(PreBookUsername).sendKeys(TestBase.credentials("valid1"));
		//parameterize 
		ObjDriver.findElement(PreBookPassword).sendKeys(TestBase.credentials("validPass1"));
		ObjDriver.findElement(PreBookLoginBtn).click();
	}

	public void enterInvalidCredentials() throws Exception {
		ObjDriver.findElement(UserName).sendKeys(TestBase.credentials("invalid1"));
		ObjDriver.findElement(Password).sendKeys(TestBase.credentials("invalidPass1"));
		ObjDriver.findElement(LoginBtn).click();
		TestBase.takeSnapShot(ObjDriver, "Screenshots\\InvalidLogin.png");
		//para
		ObjDriver.findElement(UserName).clear();
		}
	


	public void clickLoginBtn() {
		ObjDriver.findElement(LoginBtn).click();	
	}
	
	public void clickLogoutBtn(){
		ObjDriver.findElement(LogoutBtn).click();
	}
	
	/*public void clearFields()
	{
		ObjDriver.findElement(UserName).clear();
	}*/
}
