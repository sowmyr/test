package automation.locators;

import org.openqa.selenium.By;

public interface PreBookLandingPG {

	
	public static By footerSection = By.cssSelector("div.footer"); 
	public static By AboutUs = By.xpath("//*[contains(@title, 'About Us')]");
	public static By SiteMap = By.xpath("//*[contains(@title, 'Site map')]");
	public static By ContactUs = By.xpath("//*[contains(@title, 'Contact Us')]"); 
	public static By TermsNconditions = By.xpath("//*[contains(@title, 'Terms & Conditions and Privacy')]");
	public static By copyWrite = By.xpath("//*[contains(@title, '© 2017 Levi Strauss & Co.')]");
	
	public static By Levis = By.cssSelector("#brandswitch-form > label:nth-child(2)");
	public static By Dockers = By.cssSelector("#brandswitch-form > label:nth-child(4)");
}
