package Assignment1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String args[]) throws InterruptedException {
		 
		   System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");	
		   WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.get("http://the-internet.herokuapp.com/");
			
			Thread.sleep(6000);
			
	      JavascriptExecutor js= (JavascriptExecutor) driver;
	      
	      WebElement el = driver.findElement(By.linkText("Multiple Windows"));
	      
	      js.executeScript("arguments[0].scrollIntoView();", el);
	      el.click();
	      
	      driver.findElement(By.linkText("Click Here")).click();
	      
	      //to print child window text
	      
	      Set<String> id= driver.getWindowHandles();
	      Iterator<String> it = id.iterator();
	      
	      String ParentId = it.next();
	      String ChildId = it.next();
	      
	      driver.switchTo().window(ChildId);
	      System.out.println(driver.getTitle());
	      
	     // to print parent window text 
	      
	      driver.switchTo().window(ParentId);
	      System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());
	      
	      
	
	}	
}
