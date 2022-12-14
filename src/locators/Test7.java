package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo");
		// Relative Xpath //input[@id='email']
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
