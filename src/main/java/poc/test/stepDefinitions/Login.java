package poc.test.stepDefinitions;
import java.io.IOException;

import org.testng.annotations.Test;

import automation.locators.HomeLoc;
import automation.locators.LoginLoc;
import base.TestBase;
//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;	
import poc.test.PageObjects.LoginPG;


public class Login extends TestBase implements HomeLoc,LoginLoc{
LoginPG loginPage = new LoginPG();
		
		@Test
		@Given("^I am on the Levis login page$")
		public void i_am_on_the_Levis_login_page() throws IOException, InterruptedException  {			
		TestBase.initilizeBrowser(Browser);	
		}

		@Test
		@When("^I enter a valid credentials$")
		public void i_enter_a_valid() throws IOException  {
		loginPage.enterValidCredentials();		
		}

		@Test
		@When("^I click on \"([^\"]*)\" button$")
		public void i_click_on_button(String arg1)  {
		loginPage.clickLoginBtn();    
		}

		@Then("^I am navigated to the HomePage$")
		public void i_am_navigated_to_the_HomePage() throws Exception  {
		TestBase.waitUtillObject(ObjDriver, WelcomeTxt);
		TestBase.takeSnapShot(ObjDriver, "Screenshots\\Homepage.png");
		}


		@Then("^I am displayed with incorrect credential message$")
		public void i_am_displayed_with_incorrect_credential_message() throws Exception  {
		TestBase.waitUtillObject(ObjDriver, InvalidLoginAlertMsg); 
		
		
		}
	
		@When("^I click on \"([^\"]*)\" button on Home page$")
		public void i_click_on_button_on_Home_page(String arg1) {
		loginPage.clickLogoutBtn();   
		}

		@Then("^I am successfully logged out$")
		public void i_am_successfully_logged_out()  {
		   
		}

		@When("^I enter an invalid credentials$")
		public void i_enter_an_invalid_credentials() throws Exception {
		loginPage.enterInvalidCredentials();    
		}

		@Then("^I am displayed with incorrect credentials message$")
		public void i_am_displayed_with_incorrect_credentials_message() {
		    
		}

}
