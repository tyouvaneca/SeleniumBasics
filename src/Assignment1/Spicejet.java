package Assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.tools.javac.util.List;

public class Spicejet {

	public static void main(String args[]) {
	 
   System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");	
   WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
	
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	
	driver.get("https://www.spicejet.com/");
	
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	
	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	 
     driver.findElement(By.xpath("//a[@value='BLR']")).click();
	 
	 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
     
	//List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[2]/a"));
	 While(!driver.findElement(By.cssSelector("div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-left")).getText().contains("August")) ;   
	 
	 {

		 driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click(); 
	 }
	 
	 //List<WebElement> dates = driver.findElements(By.className("selectDay"));
	 List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		 
	   int count = dates.size();
	   for(int i=0; i<count; i++)
	   {
		   String text = dates.get(i).getText();
		   if(text.equalsIgnoreCase("25"));
		   {
			   dates.get(i).click();
			   break;
		   }
		}
	
	driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
	 	
	Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
      s.selectByIndex(3);	

      driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
 }

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

	
}
