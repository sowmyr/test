package automation.locators;

import org.openqa.selenium.By;

public interface CartPageLoc {
	public static By SearchTxtBox  = By.cssSelector(".subnav form#search-bar input"); 
	public static By SearchBoxIcon  = By.cssSelector(".subnav form#search-bar>a");	
	public static By SearchResultsTitle = By.cssSelector("#breadcrumb > ul > li.active");
// Since we need to select the first product from the list	
	public static By Product = By.cssSelector(".resultsList div.productListItem:nth-child(1)");
	
	public static By ColorSwatch = By.cssSelector(".color-swatch.selected");
	//Size availability
	public static By InStock_Green =By.cssSelector("div.single_grid_three_dimensions td.Green:first-of-type input.sku-quantity");
	public static By LimitedStock_Yellow =By.cssSelector("");
	public static By OutOfStock_Red =By.cssSelector("");
	
	public static By AddToCartButton= By.cssSelector(".ordergrid-buttons a > p");
	public static By CartIcon = By.cssSelector("#cart-container a div.mini-cart h3");
	
	public static By Spinner = By.cssSelector(".spinner");
	public static By PopUpBlockClose = By.cssSelector("#popupBoxClose");
	
	//public static By CheckoutBtnOnCartPage = By.xpath("//a[contains(@class, 'button-large checkout')]");
	public static By CheckoutBtnOnCartPage = By.cssSelector(".button-large.checkout");
	
}
