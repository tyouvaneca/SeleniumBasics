package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.findElement(By.id("checkBoxOption1")).click();
			
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
			
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
}
}