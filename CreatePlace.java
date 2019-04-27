

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreatePlace {

	
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\internship\\webdrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
     	
		driver.get("https://www.navigator.ba/#/categories");
		
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		    
		 //Find "search" web element and click
		 
		 js.executeScript("document.getElementsByClassName('ember-view ember-text-field tt-query')[0].click()");
		 
		 //type "Vijecnica" into search
		 js.executeScript ("document.getElementsByClassName('ember-view ember-text-field tt-query')[0].value='Vijecnica';");
		 
		 //Hit search
		 
		 Thread.sleep(5000);
		 
		 js.executeScript ("document.getElementsByClassName('icon')[0].click()");
		
		 Thread.sleep (5000);
		 
		driver.get("https://www.navigator.ba/#/categories");
			

		 Thread.sleep(3000);

	  
	    
	    //find create place element
	    js.executeScript("document.getElementById('ember566').click()");
	     
	    //find "naziv" element inside form and fill with "Vijecnica"
	    
	    js.executeScript("document.getElementById('poi_name').value='Vijecnica'; ");
	    
	    
	   
	    //find "categories button"
	    
	     js.executeScript("document.getElementsByClassName('ember-view btn btn-small')[0].click()");
	    
	    //select categories
	    
	     js.executeScript("document.getElementsByXpath('span3')[0].click()");
	    
	    
	    Thread.sleep (3000);
	    
	    //find "create" button
	    
        js.executeScript("document.getElementsByClassName('btn btn-success').click()");
	    
	   
	    Thread.sleep(50000);
	   
		 driver.close();
		
		
	 


	}
	
	
	
	
}
