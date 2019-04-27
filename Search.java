import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;


public class Search {

	
	
public static void main(String args[]) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
        driver.get("https://www.navigator.ba/#/categories");
		
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
		//unesi ime u search
		
        driver.findElement(By.xpath("//input[@class='ember-view ember-text-field tt-query']")).sendKeys("Vijecnica");
     
        Thread.sleep(1000);
        
        Actions clickEnter = new Actions (driver);
         
        clickEnter.sendKeys(Keys.ENTER).build().perform();
    
        //choose  option
        
        driver.findElement(By.xpath("//div[@title='Gradska vijeænica']")).click();
     
        Thread.sleep(10000);
        
       driver.close();
         };
        
        
}

	
	

