package poc.test.stepDefinitions;

import base.TestBase;
import poc.test.PageObjects.HomePG;
import poc.test.PageObjects.LoginPG;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PreBookLoginPage extends TestBase {
	HomePG home = new HomePG();
	LoginPG login = new LoginPG();

	@When("^I click on \"([^\"]*)\" link on HomePage$")
	public void i_click_on_link_on_HomePage(String arg1)  {
	home.clickPreBookLink();
	}

	@Then("^I am navigated to PreBook landingpage$")
	public void i_am_navigated_to_PreBook_HomePage() throws Exception  {
	TestBase.takeSnapShot(ObjDriver, "Screenshots\\PreBookLoginPage.png");
	login.enterPreBookCredentials() ;
	TestBase.takeSnapShot(ObjDriver, "Screenshots\\PreBookHomepage.png");
	}

}
