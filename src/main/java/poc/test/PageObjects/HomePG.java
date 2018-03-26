package poc.test.PageObjects;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import automation.locators.HomeLoc;
import automation.locators.LoginLoc;
import base.TestBase;

public class HomePG extends TestBase implements LoginLoc,HomeLoc {

	public HomePG() {
		PageFactory.initElements(ObjDriver, this);
		}
	
	public void VerifyWelcometext(){
		TestBase.waitUtillObject(ObjDriver, WelcomeTxt);
		//String WlcText=ObjDriver.findElement(WelcomeTxt).getText();
		//System.out.println(WlcText);
		/*if(WlcText.contains("WELCOME"))
		{System.out.println("Successfully reached homepage");
		}*/
}
	public void clickPreBookLink(){
		TestBase.waitUtillObject(ObjDriver, PreBookLink);
		ObjDriver.findElement(PreBookLink).click();
	}
	
	
	public void VerifyHomePageFeilds() throws BiffException, IOException, InterruptedException{ 
		TestBase.waitUtillObject(ObjDriver, WelcomeTxt);
		
		//My Account tab.
		TestBase.mouseHover(ObjDriver.findElement(MyAccountTab));
		Assert.assertEquals((ObjDriver.findElement(MyAccountTab).getText()), expectedValue("MyAccountTab").toUpperCase());
		TestBase.waitUtillObject(ObjDriver, SubTabProfile);
		Assert.assertEquals((ObjDriver.findElement(SubTabProfile).getText()), expectedValue("SubTabProfile").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabAddressBook).getText()), expectedValue("SubTabAddressBook").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubtabManageUser).getText()), expectedValue("SubtabManageUser").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabOrderHistory).getText()), expectedValue("SubTabOrderHistory").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabAccBalance).getText()), expectedValue("SubTabAccBalance").toUpperCase());
		//Help Tab.
		TestBase.mouseHover(ObjDriver.findElement(HelpTab));
		Assert.assertEquals((ObjDriver.findElement(HelpTab).getText()), expectedValue("HelpTab").toUpperCase());
		TestBase.waitUtillObject(ObjDriver, SubTabFAQ);
		Assert.assertEquals((ObjDriver.findElement(SubTabFAQ).getText()), expectedValue("SubTabFAQ").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabTraining).getText()), expectedValue("SubTabTraining").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabContactUs).getText()), expectedValue("SubTabContactUs").toUpperCase());
		TestBase.waitUtillObject(ObjDriver,Languagetab );
		TestBase.mouseHover(ObjDriver.findElement(Languagetab));
		
		Select lang = new Select(ObjDriver.findElement(By.id("lang-selector")));
		lang.selectByVisibleText("English");
		
				
		TestBase.mouseHover(ObjDriver.findElement(MenTab));
		TestBase.waitUtillObject(ObjDriver,SubTabJeans );
		Assert.assertEquals((ObjDriver.findElement(SubTabJeans).getText()),expectedValue("SubTabJeans").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabTrousers).getText()),expectedValue("SubTabTrousers").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabTees).getText()),expectedValue("SubTabTees").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabShirts).getText()),expectedValue("SubTabShirts").toUpperCase());		
		Assert.assertEquals((ObjDriver.findElement(SubTabSweaters).getText()), expectedValue("SubTabSweaters").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabSweatshirts).getText()), expectedValue("SubTabSweatshirts").toUpperCase());		
		Assert.assertEquals((ObjDriver.findElement(SubTabQuterwear).getText()), expectedValue("SubTabQuterwear").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabTaper).getText()), expectedValue("SubTabTaper").toUpperCase());		
		Assert.assertEquals((ObjDriver.findElement(SubTabTruckers).getText()), expectedValue("SubTabTruckers").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabShirtShop).getText()), expectedValue("SubTabShirtShop").toUpperCase());		
		Assert.assertEquals((ObjDriver.findElement(SubTabStretchJeans).getText()), expectedValue("SubTabStretchJeans").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(SubTabIndigoTops).getText()), expectedValue("SubTabIndigoTops").toUpperCase());		
		Assert.assertEquals((ObjDriver.findElement(SubHeadingCategory).getText()), expectedValue("SubHeadingCategory").toUpperCase());
		//women tab.
		TestBase.mouseHover(ObjDriver.findElement(WomenTab));
		/*TestBase.waitUtillObject(ObjDriver,WSubTabJeans );
		Assert.assertEquals((ObjDriver.findElement(WSubTabJeans).getText()), expectedValue("WSubTabJeans").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(WSubTabShortsSkirts).getText()), expectedValue("WSubTabShortsSkirts").toUpperCase());	
		TestBase.waitUtillObject(ObjDriver,WSubTabTees );
		Thread.sleep(3000);
		Assert.assertEquals((ObjDriver.findElement(WSubTabTees).getText()), expectedValue("WSubTabTees").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(WSubTabDresses).getText()), expectedValue("WSubTabDresses").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(WSubTabShirts).getText()), expectedValue("WSubTabShirts").toUpperCase());		
		Assert.assertEquals((ObjDriver.findElement(WSubTabSweaters).getText()), expectedValue("WSubTabSweaters").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(WSubTabSweatshirts).getText()), expectedValue("WSubTabSweatshirts").toUpperCase());		
		Assert.assertEquals((ObjDriver.findElement(WSubTabQuterwear).getText()), expectedValue("WSubTabQuterwear").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(WSubTabTaper).getText()), expectedValue("WSubTabTaper").toUpperCase());	
		Assert.assertEquals((ObjDriver.findElement(WSubTabTruckers).getText()), expectedValue("WSubTabTruckers").toUpperCase());
		Assert.assertEquals((ObjDriver.findElement(WSubTabPrettyBlackTops).getText()), expectedValue("WSubTabPrettyBlackTops").toUpperCase());	
		Assert.assertEquals((ObjDriver.findElement(WSubTabGirlShirts).getText()), expectedValue("WSubTabGirlShirts").toUpperCase()); 
		Assert.assertEquals((ObjDriver.findElement(WSubTabMileHigh).getText()), expectedValue("WSubTabMileHigh").toUpperCase());	
		Assert.assertEquals((ObjDriver.findElement(WSubTabVintageSoft).getText()), expectedValue("WSubTabVintageSoft").toUpperCase()); 
		*/
		
				
		
		
		


	}


}
