package poc.test.stepDefinitions;

//import java.util.concurrent.TimeUnit;

import base.TestBase;
import automation.locators.CartPageLoc;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cart extends TestBase implements CartPageLoc {
	@When("^I search for first product$")
	public void i_search_for_first_product()  {
	TestBase.waitUtillObject(ObjDriver, SearchTxtBox);
	ObjDriver.findElement(SearchTxtBox).sendKeys("00501-0101");
	TestBase.waitUtillObject(ObjDriver, SearchBoxIcon);
	ObjDriver.findElement(SearchBoxIcon).click();
	
	}
	
	@When("^I search for second product$")
	public void i_search_for_second_product() throws InterruptedException  {
	TestBase.waitUtillObject(ObjDriver, SearchTxtBox);
	ObjDriver.findElement(SearchTxtBox).sendKeys("65824-0351");
	TestBase.waitUtillObject(ObjDriver, SearchBoxIcon);
	Thread.sleep(10000);
	ObjDriver.findElement(SearchBoxIcon).click();
	
	}
	
	

	@Then("^I am displayed with the corresponding search results$")
	public void i_am_displayed_with_the_corresponding_search_results() {
	TestBase.waitUtillObject(ObjDriver, SearchResultsTitle);    
	}

	@When("^I click on any of the product$")
	public void i_click_on_any_of_the_product() {
	TestBase.waitUtillObject(ObjDriver, Product);
	ObjDriver.findElement(Product).click();
	}

	@Then("^I am navigated to the product details page$")
	public void i_am_navigated_to_the_product_details_page() throws Exception  {
	TestBase.takeSnapShot(ObjDriver, "Screenshots\\ProductPage.png");
	}

	@When("^I select a color and size combination$")
	public void i_select_a_color_and_size_combination() {
	TestBase.waitUtillObject(ObjDriver, ColorSwatch);
	ObjDriver.findElement(ColorSwatch).click();  
	TestBase.waitUtillObject(ObjDriver, InStock_Green);
	ObjDriver.findElement(InStock_Green).sendKeys("1");
	}

	@When("^click on \"([^\"]*)\" button$")
	public void click_on_button(String arg1){
	TestBase.waitUtillObject(ObjDriver, AddToCartButton);
	ObjDriver.findElement(AddToCartButton).click();
	}

	@Then("^the product is added to the cart successfully$")
	public void the_product_is_added_to_the_cart_successfully() throws InterruptedException {
	TestBase.waitUtillObject(ObjDriver, Spinner);
	TestBase.waitUtillObject(ObjDriver, PopUpBlockClose);
	TestBase.waitUtillObject(ObjDriver, CartIcon);
	//ObjDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// Implicit and explicit waits are not working here	
	Thread.sleep(10000);
	ObjDriver.findElement(CartIcon).click();
	Thread.sleep(10000);
	//TestBase.scrollFn();
	}
}
