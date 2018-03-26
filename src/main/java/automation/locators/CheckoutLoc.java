package automation.locators;

import org.openqa.selenium.By;

public interface CheckoutLoc {
	
 
	public static By PaymentMethodInvoice = By.xpath("//*[contains(text(),'Invoice')]");
	public static By PaymentMethodCard = By.xpath("//*[contains(text(),'Card Payment')]");
	
	public static By SelectPaymentMethodInvoice = By.cssSelector("#PaymentTypeSelection_ACCOUNT");
	public static By SelectPaymentMethodCard = By.cssSelector("#PaymentTypeSelection_CARD");
	public static By AltDeliveryAddress = By.cssSelector("div.contentSection a.button");
	public static By UseThisAddress = By.cssSelector(".right.edit_btn_area button");
	
	public static By CheckoutHeading = By.cssSelector("#main-container h1");
	public static By PlaceOrderBtn = By.cssSelector(".button-large.placeOrderButton p");
	
	public static By OrderConfirmMsg = By.cssSelector("#main-container > h1");
	
	public static By OrderNumber = By.cssSelector("div.options p.ordernumber");
}
