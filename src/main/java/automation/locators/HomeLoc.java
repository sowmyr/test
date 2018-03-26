package automation.locators;

import org.openqa.selenium.By;

public interface HomeLoc {

	
	public static By LogoutBtn = By.cssSelector("form#logoutForm a"); 
	public static By WelcomeTxt = By.cssSelector(".global-nav-list li");
	
	//PreBook link
	public static By PreBookLink = By.xpath("//*[contains(@title, 'Prebook')]");
	public static By PreBookHeading = By.cssSelector("login-page__headline");
	
//My Account Tabs and Sub-Tabs	
	public static By MyAccountTab = By.cssSelector(".yCmsComponent a[title^='My']");
	public static By SubTabProfile = By.cssSelector(".yCmsComponent a[title^='Profile']");
	public static By SubTabAddressBook = By.cssSelector(".yCmsComponent a[title^='Address Book']");
	public static By SubtabManageUser = By.cssSelector(".yCmsComponent a[title^='Manage Users']");
	public static By SubTabOrderHistory = By.cssSelector(".yCmsComponent a[title^='Order History']");
	public static By SubTabAccBalance = By.cssSelector(".yCmsComponent a[title^='Account Balance']");
	
//Help Tab and Sub-Tabs
	public static By HelpTab = By.cssSelector(".yCmsComponent a[title^='Help']");
	public static By SubTabFAQ = By.cssSelector(".yCmsComponent a[title^='FAQ']");
	public static By SubTabTraining = By.cssSelector(".yCmsComponent a[title^='Training']");
	public static By SubTabContactUs = By.cssSelector(".yCmsComponent a[title^='Contact Us']");
	
	
	/*Used xpath here instead of css*/	
	
//Language Tab and Sub-Tab	
	public static By Languagetab = By.xpath("//a[contains(@class, 'global-nav-hasmenu country')]");
	public static By SubTabLangSelector = By.cssSelector("#lang-selector");
	
	//MEN TAB ON HOME PAGE
	public static By MenTab = By.cssSelector("ul.yCmsContentSlot.subnav-list a[title*='Men']");
	public static By WomenTab = By.cssSelector("ul.yCmsContentSlot.subnav-list a[title*='Women']");
	public static By QuickOrderTab = By.cssSelector("ul.yCmsContentSlot.subnav-list a[title*='Quick Order']");
	//Validate Men SubTabs
	public static By SubTabJeans = By.cssSelector("li.yCmsComponent a[title='Jeans']");
	public static By SubTabTrousers = By.cssSelector("li.yCmsComponent a[title*='Trousers']");
	public static By SubTabTees = By.cssSelector("li.yCmsComponent a[title*='Tees']");
	public static By SubTabShirts = By.cssSelector("li.yCmsComponent a[title*='Shirts']");
	public static By SubTabSweaters = By.cssSelector("li.yCmsComponent a[title*='Sweaters']");
	public static By SubTabSweatshirts = By.cssSelector("li.yCmsComponent a[title*='Sweatshirts']");
	public static By SubTabQuterwear = By.cssSelector("li.yCmsComponent a[title*='Outerwear']");
	public static By SubTabTaper = By.cssSelector("li.yCmsComponent a[title*='Range of Taper']");
	public static By SubTabTruckers = By.cssSelector("li.yCmsComponent a[title*='Truckers']");
	public static By SubTabShirtShop = By.cssSelector("li.yCmsComponent a[title*='Shirt Shop']");
	public static By SubTabStretchJeans = By.cssSelector("li.yCmsComponent a[title*='Stretch Jeans']");
	public static By SubTabIndigoTops = By.cssSelector("li.yCmsComponent a[title*='Indigo Tops']");
	public static By SubHeadingCategory = By.cssSelector("ul.yCmsContentSlot h3:nth-child(1)");
	//Seasonal initiatives not recognisable.
	//public static By SubHeadingSeasonal = By.cssSelector("ul.yCmsContentSlot h3:nth-child(2)");
	
	//Validate Women sub tabs
	public static By WSubTabJeans = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title='Jeans']");
	public static By WSubTabShortsSkirts = By.cssSelector("li.yCmsComponent a[title*='Shorts & Skirts']");
	public static By WSubTabDresses = By.cssSelector("li.yCmsComponent a[title*='Dresses']");
	public static By WSubTabShirts = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title='Shirts']");
	public static By WSubTabTees = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title='Tees']");		
	public static By WSubTabSweatshirts = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='Sweatshirts']");
	public static By WSubTabQuterwear = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='Outerwear']");
	public static By WSubTabTaper = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='Range of Skinnies']");
	public static By WSubTabTruckers = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='Truckers']");
	public static By WSubTabPrettyBlackTops = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='Pretty Black Tops']");
	public static By WSubTabGirlShirts = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='School Girl Shirts']");
	public static By WSubTabMileHigh = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='Mile High']");	
	public static By WSubTabSweaters = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='Sweaters']");
	public static By WSubTabVintageSoft = By.cssSelector("ul.yCmsContentSlot.subnav-list li:nth-child(2) li.yCmsComponent a[title*='Vintage Soft']");

}
