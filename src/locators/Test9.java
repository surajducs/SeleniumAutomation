package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		
//Step:1 open the browser 
		
		WebDriver driver=new ChromeDriver();
		
//Step:2 Maximize the Browser
		
		driver.manage().window().maximize();
		
//Step:3 Open the application
		
		driver.get("https://demo.actitime.com/login.do");
		
//Step:4 Find Element- Xpath by Attribute 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
//Step:5 Find Element- Xpath by Attribute
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
//Step:6 Click on login button - Xpath by Text
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
