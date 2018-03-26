package poc.test.PageObjects;

import automation.locators.PreBookLandingPG;
import base.TestBase;

public class LandingPG extends TestBase implements PreBookLandingPG{

	public void validateFooters()
	{
		TestBase.waitUtillObject(ObjDriver, footerSection);
		TestBase.waitUtillObject(ObjDriver, AboutUs);
		TestBase.waitUtillObject(ObjDriver, SiteMap);
		TestBase.waitUtillObject(ObjDriver, ContactUs);
		TestBase.waitUtillObject(ObjDriver, TermsNconditions);
		TestBase.waitUtillObject(ObjDriver, copyWrite);
		TestBase.waitUtillObject(ObjDriver, Levis);
		TestBase.waitUtillObject(ObjDriver, Dockers);
		
	}
}
