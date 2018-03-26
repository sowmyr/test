package poc.test.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import automation.locators.HomeLoc;
import automation.locators.MyAccountLoc;
import automation.locators.OrderHistoryLoc;
import base.TestBase;
import cucumber.api.java.en.When;

public class OrderHistory extends TestBase implements HomeLoc,MyAccountLoc,OrderHistoryLoc{
	

	@When("^I click on \"([^\"]*)\" tab$")
	public void i_click_on_tab(String arg1) throws Exception {
	  TestBase.waitUtillObject(ObjDriver, MyAccountTab);
	  //TestBase.mouseHover(ObjDriver.findElement(MyAccountTab));
	  ObjDriver.findElement(MyAccountTab).click();
	  TestBase.takeSnapShot(ObjDriver, "Screenshots\\MyAccount.png");
	}

	@When("^I click on \"([^\"]*)\" section$")
	public void i_click_on_section(String arg1) throws Exception  {
		
		JavascriptExecutor jse = (JavascriptExecutor)ObjDriver;

		jse.executeScript("scroll(0, 250)"); 
		TestBase.waitUtillObject(ObjDriver, OrderHistoryLink);
		ObjDriver.findElement(OrderHistoryLink).click();
		Thread.sleep(8000);
		TestBase.waitUtillObject(ObjDriver, OrderHistoryHeading);
		jse.executeScript("scroll(0, 250)");
		TestBase.takeSnapShot(ObjDriver, "Screenshots\\OrderHistory.png");
	}
}
