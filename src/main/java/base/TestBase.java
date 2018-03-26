package base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;







import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
public class TestBase {
	Properties sysProps = System.getProperties();
	String browserName = sysProps.getProperty("project.properties");
	
	//public static WebDriver driver;
	
	public static WebDriver ObjDriver;
	public static WebElement ObjElement;
	public static String Browser;
	public static String Environment;

	public static void scrollFn()
	{
	/*	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");*/
		
		
		Actions dragger = new Actions(ObjDriver);
        WebElement draggablePartOfScrollbar= ObjDriver.findElement(By.xpath("//a[contains(@class, 'button-large checkout')]"));
        int numberOfPixelsToDragTheScrollbarDown = 100;
        for (int i=10;i<500;i=i+numberOfPixelsToDragTheScrollbarDown){
            try{
        // this causes a gradual drag of the scroll bar, 10 units at a time
        dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
       
        Thread.sleep(1000L);
            }catch(Exception e1){}
        } 
	}
    
    public static void initilizeBrowser(String browser) throws IOException{
    	FileInputStream propFile =new FileInputStream( "project.properties");
    	Properties p =new Properties(System.getProperties());
    	p.load(propFile);
    	System.setProperties(p);
    	//System.getProperties().list(System.out);
    	Browser = p.getProperty("test.browser");
    	Environment = p.getProperty("test.env");
    	
    	// when system property 'geb.env' is set to 'integration000'
    	
    	

    	//System.out.println("browser detected "+Browser);

    	if(Browser.equalsIgnoreCase("chrome"))
    		
    	{
    		//chrome Driver
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\9shete4\\chromedriver_win32\\chromedriver.exe");
    		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			//place driver under the project 
			ObjDriver = new ChromeDriver();
			
			if(Environment.equalsIgnoreCase("preprod"))	    		
	    	    { 
				ObjDriver.get("http://preprod-origin.lsco-b2b.com");
				ObjDriver.manage().window().maximize();
	    	    }   
			
	    	else if(Environment.equalsIgnoreCase("integration000"))
	    		{
	    		ObjDriver.get("http://b2bint-000-store-000.lsco-b2b.com:9001/lscob2bstorefront");
				ObjDriver.manage().window().maximize();	
	    		}
			
	    	else if(Environment.equalsIgnoreCase("integration001"))
	    		{
	    		ObjDriver.get("http://b2bint-001-store-000.lsco-b2b.com:9001/lscob2bstorefront");
				ObjDriver.manage().window().maximize();	
	    		}
			
	    	else if(Environment.equalsIgnoreCase("qa000"))
	    		{
	    		ObjDriver.get("http://b2bqa-000-web-000.lsco-b2b.com");
				ObjDriver.manage().window().maximize();	
	    		}
			
	    	else if(Environment.equalsIgnoreCase("qa001"))
	    		{
	    		ObjDriver.get("http://b2bqa-001-web-000.lsco-b2b.com");
				ObjDriver.manage().window().maximize();	
	    		}
			
	    	else if(Environment.equalsIgnoreCase("qa002"))
	    		{
	    		ObjDriver.get("https://b2bqa-002-web-000.lsco-b2b.com");
				ObjDriver.manage().window().maximize();	
	    		}
			
	    	else if(Environment.equalsIgnoreCase("qa003"))
	    		{
	    		ObjDriver.get("https://b2bpreprod-001-web-000.lsco-b2b.com");
				//ObjDriver.manage().window().maximize();	
	    		}
			
	    	else if(Environment.equalsIgnoreCase("preprod001"))
	    		{
	    		ObjDriver.get("https://b2bpreprod-001-web-000.lsco-b2b.com");
				ObjDriver.manage().window().maximize();	
	    		}
	    		
    	}
    	
    	else if(Browser.equalsIgnoreCase("firefox"))
    	{
    		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\9shete4\\geckodriver-v0.18.0-win64\\geckodriver.exe");
    		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
    		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    		desiredCapabilities.setAcceptInsecureCerts(true);
    		ObjDriver = new FirefoxDriver(desiredCapabilities);
    			
    		if(Environment.equalsIgnoreCase("preprod"))	    		
    	    { 
			ObjDriver.get("http://preprod-origin.lsco-b2b.com");
			ObjDriver.manage().window().maximize();
    	    }   
		
    	else if(Environment.equalsIgnoreCase("integration000"))
    		{
    		ObjDriver.get("http://b2bint-000-store-000.lsco-b2b.com:9001/lscob2bstorefront");
			ObjDriver.manage().window().maximize();	
    		}
		
    	else if(Environment.equalsIgnoreCase("integration001"))
    		{
    		ObjDriver.get("http://b2bint-001-store-000.lsco-b2b.com:9001/lscob2bstorefront");
			ObjDriver.manage().window().maximize();	
    		}
		
    	else if(Environment.equalsIgnoreCase("qa000"))
    		{
    		ObjDriver.get("http://b2bqa-000-web-000.lsco-b2b.com");
			ObjDriver.manage().window().maximize();	
    		}
		
    	else if(Environment.equalsIgnoreCase("qa001"))
    		{
    		ObjDriver.get("http://b2bqa-001-web-000.lsco-b2b.com");
			ObjDriver.manage().window().maximize();	
    		}
		
    	else if(Environment.equalsIgnoreCase("qa002"))
    		{
    		ObjDriver.get("https://b2bqa-002-web-000.lsco-b2b.com");
			ObjDriver.manage().window().maximize();	
    		}
		
    	else if(Environment.equalsIgnoreCase("qa003"))
    		{
    		ObjDriver.get("https://b2bqa-003-web-000.lsco-b2b.com");
			ObjDriver.manage().window().maximize();	
    		}
		
    	else if(Environment.equalsIgnoreCase("preprod001"))
    		{
    		ObjDriver.get("https://b2bpreprod-001-web-000.lsco-b2b.com");
			ObjDriver.manage().window().maximize();	
    		}
    					
    	}
    					
    	else if(Browser.equalsIgnoreCase("internet explorer"))
    	 	{
    			    		
    					//System.setProperty("webdriver.ie.driver", "C:\\Users\\9r69461\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
    					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
    					capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
    					//File file = new File("C:\\Users\\9r69461\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
    					//System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
    					
    					System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
    							
    					ObjDriver = new InternetExplorerDriver(capabilities);
    					
    					if(Environment.equalsIgnoreCase("preprod"))	    		
    		    	    { 
    					ObjDriver.get("http://preprod-origin.lsco-b2b.com");
    					ObjDriver.manage().window().maximize();
    		    	    }   
    				
    		    	else if(Environment.equalsIgnoreCase("integration000"))
    		    		{
    		    		ObjDriver.get("http://b2bint-000-store-000.lsco-b2b.com:9001/lscob2bstorefront");
    					ObjDriver.manage().window().maximize();	
    		    		}
    				
    		    	else if(Environment.equalsIgnoreCase("integration001"))
    		    		{
    		    		ObjDriver.get("http://b2bint-001-store-000.lsco-b2b.com:9001/lscob2bstorefront");
    					ObjDriver.manage().window().maximize();	
    		    		}
    				
    		    	else if(Environment.equalsIgnoreCase("qa000"))
    		    		{
    		    		ObjDriver.get("http://b2bqa-000-web-000.lsco-b2b.com");
    					ObjDriver.manage().window().maximize();	
    		    		}
    				
    		    	else if(Environment.equalsIgnoreCase("qa001"))
    		    		{
    		    		ObjDriver.get("http://b2bqa-001-web-000.lsco-b2b.com");
    					ObjDriver.manage().window().maximize();	
    		    		}
    				
    		    	else if(Environment.equalsIgnoreCase("qa002"))
    		    		{
    		    		ObjDriver.get("https://b2bqa-002-web-000.lsco-b2b.com");
    					ObjDriver.manage().window().maximize();	
    		    		}
    				
    		    	else if(Environment.equalsIgnoreCase("qa003"))
    		    		{
    		    		ObjDriver.get("https://b2bqa-003-web-000.lsco-b2b.com");
    					ObjDriver.manage().window().maximize();	
    		    		}
    				
    		    	else if(Environment.equalsIgnoreCase("preprod001"))
    		    		{
    		    		ObjDriver.get("https://b2bpreprod-001-web-000.lsco-b2b.com");
    					ObjDriver.manage().window().maximize();	
    		    		}
    		    		
    					
    					WebElement ObjSecurityLink=ObjDriver.findElement(By.cssSelector("#overridelink"));
    					if (ObjSecurityLink.isDisplayed()){
    						ObjSecurityLink.click();
    					}
    					
    	
    	}
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void waitUtillObject(WebDriver driver, By elementPath ){
        Wait wait = new WebDriverWait(driver, 10).pollingEvery(2, TimeUnit.SECONDS).ignoring(ElementNotFoundException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementPath));
}

    public static String expectedValue(String baseProperty) throws BiffException, IOException
	{			
		
					
		String FilePath = "Properties.xls";
		
		FileInputStream fs = new FileInputStream(FilePath);
		
		WorkbookSettings wbSettings = new WorkbookSettings();
		
		wbSettings.setEncoding("CP1252");
		
		Workbook wb = Workbook.getWorkbook(fs, wbSettings);
		
		Sheet sh = wb.getSheet(0);
		Cell cell = null ;
	
		
		int column=0;
		
		for (int row = 1; row < sh.getRows(); row++)
		{
		 cell = sh.getCell(column, row);
		String actual =cell.getContents();
			String expected = baseProperty;
			if(actual.equals(expected))
			{
				cell=sh.getCell(2, row);				
				break;
			}			
		}														
		return cell.getContents();
	}
	
	int count=0;
	
	public static void mouseHover(WebElement ObjElement){
		Actions a=new Actions(ObjDriver);
		a.moveToElement(ObjElement).build().perform();
		
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
public static Properties p =new Properties(System.getProperties());
	

	public static String credentials(String param) throws IOException  {
		FileInputStream propFile1 =new FileInputStream("users.properties");
		//Properties p =new Properties(System.getProperties());
		p.load(propFile1);
		
		return (p.getProperty(param));
		
		
	}

}







