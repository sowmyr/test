package poc.test.stepDefinitions;

import automation.locators.HomeLoc;
import automation.locators.LoginLoc;
import base.TestBase;
import poc.test.PageObjects.HomePG;
import cucumber.api.java.en.Then;

public class Home extends TestBase implements HomeLoc, LoginLoc {

HomePG homepage = new HomePG();
	
	@Then("^I check for Welcome text$")
	public void i_check_for_Welcome_text() throws Throwable {
		TestBase.waitUtillObject(ObjDriver, WelcomeTxt);
	    homepage.VerifyWelcometext();
	  
	}
	
	@Then("^I check for all fields in homePage$")
	public void i_check_for_all_fields_in_homePage() throws Throwable {
		
		homepage.VerifyHomePageFeilds();
	}
}
