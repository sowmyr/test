package poc.test.stepDefinitions;

import poc.test.PageObjects.LandingPG;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PreBookLandingPageTest {
	LandingPG land = new LandingPG();
	@When("^I am on the footer section$")
	public void i_am_on_the_footer_section() throws Throwable {
	    
	    throw new PendingException();
	}

	@Then("^I see the footer links$")
	public void i_see_the_footer_links() throws Throwable {
	   land.validateFooters();
	    throw new PendingException();
	}

	@Then("^I am navigated to the product listing page$")
	public void i_am_navigated_to_the_product_listing_page() throws Throwable {
	    
	    throw new PendingException();
	}
}
