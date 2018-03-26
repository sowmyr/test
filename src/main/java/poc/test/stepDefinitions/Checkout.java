package poc.test.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import poc.test.PageObjects.CheckoutPG;
import base.TestBase;
import automation.locators.CartPageLoc;
import automation.locators.CheckoutLoc;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checkout  extends TestBase implements CartPageLoc, CheckoutLoc {
	CheckoutPG check = new CheckoutPG();
	
	@When("^I click on checkout button on Cart page$")
	public void i_click_on_checkout_button_on_Cart_page() throws InterruptedException{
	//TestBase.scrollFn();
	TestBase.waitUtillObject(ObjDriver, CheckoutBtnOnCartPage);
	//System.out.println("checkout button: "+CheckoutBtnOnCartPage);
	Thread.sleep(8000);
	
	
	//Using Actions
	/*WebElement element = ObjDriver.findElement(CheckoutBtnOnCartPage);

	Actions actions = new Actions(ObjDriver);

	if(element.isDisplayed())
	{
	actions.moveToElement(element).click().perform();
	Thread.sleep(1000);
	actions.moveToElement(element).click().perform();
	}*/
	
	//Using scroll
	JavascriptExecutor jse = (JavascriptExecutor)ObjDriver;

	jse.executeScript("scroll(0, 250)"); 
	ObjDriver.findElement(CheckoutBtnOnCartPage).click();
	
	}

	@Then("^I am navigated to the Checkout page$")
	public void i_am_navigated_to_the_Checkout_page() throws Exception {
	TestBase.waitUtillObject(ObjDriver, CheckoutHeading);  
	TestBase.takeSnapShot(ObjDriver, "Screenshots\\CheckoutPage.png");
	}
	
	@When("^I select a Payment Option$")
	public void i_select_a_Payment_Option() {
	check.selectInvoicePayment();
	}

	@When("^a Delivery Address$")
	public void a_Delivery_Address() throws InterruptedException {
    check.selectDeliveryAddres();   
	}

	@When("^I click on Place Order button$")
	public void i_click_on_Place_Order_button() {
	TestBase.waitUtillObject(ObjDriver, PlaceOrderBtn);
	if(ObjDriver.findElement(PlaceOrderBtn).isEnabled())
	{
	   ObjDriver.findElement(PlaceOrderBtn).click();
	}
	    
	}

	@Then("^the order is placed successfully$")
	public void the_order_is_placed_successfully() throws Exception {
	TestBase.waitUtillObject(ObjDriver, OrderConfirmMsg); 
	TestBase.takeSnapShot(ObjDriver, "Screenshots\\OrderConfirm.png");
	check.getOrderNumber();
	}
	
	

}
