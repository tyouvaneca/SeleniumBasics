package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		
	
		WebElement from = driver.findElement(By.xpath("//input[@id='FromTag']"));
		from.click();
		from.sendKeys("ban");
		Thread.sleep(5000);
         from.sendKeys(Keys.ENTER);
		
		WebElement to = driver.findElement(By.id("ToTag"));
		to.click();
		to.sendKeys("che");
		Thread.sleep(5000);
		to.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[2]/a")).click();
		
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByIndex(2);
		
		driver.findElement(By.id("SearchBtn")).click();
		
		//driver.switchTo().alert().dismiss();
		
	}
}
