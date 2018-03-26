package poc.test.PageObjects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import automation.locators.CheckoutLoc;
import base.TestBase;

public class CheckoutPG extends TestBase implements CheckoutLoc{

	public void selectInvoicePayment() {
		TestBase.waitUtillObject(ObjDriver, SelectPaymentMethodInvoice);
		ObjDriver.findElement(SelectPaymentMethodInvoice).click();
	}
	
	public void selectCardPayment(){
	ObjDriver.findElement(SelectPaymentMethodCard).click();	
	}
	
	public void selectDeliveryAddres() throws InterruptedException{
	TestBase.waitUtillObject(ObjDriver, AltDeliveryAddress);
	ObjDriver.findElement(AltDeliveryAddress).click(); 
	Thread.sleep(3000);
	TestBase.waitUtillObject(ObjDriver, UseThisAddress);
	ObjDriver.findElement(UseThisAddress).click();	
	Thread.sleep(3000);
	}
	
	public void getOrderNumber()
	{
		FileOutputStream fos = null;
	    File file;
	    String OrderNum =	ObjDriver.findElement(OrderNumber).getText();
	    String mycontent = "Order number is: "+OrderNum;
	    
	    try{
	    file = new File("C:\\Users\\9shete4\\Desktop\\OrderNumber\\orderNum.txt");
	  	fos = new FileOutputStream(file);
	  	
	  	byte[] bytesArray = mycontent.getBytes();

		  fos.write(bytesArray);
		  //fos.flush();
		  
	    }
	    catch(IOException ioe)
	    {
	    	ioe.printStackTrace();	
	    }
	}
}
