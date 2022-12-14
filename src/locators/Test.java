package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
//Step:1 Open a Browser 
		
		WebDriver driver=new ChromeDriver();
		
//Step:2 Maximize a browser 
		
		driver.manage().window().maximize();
		
//Step:3 open a application
		
		driver.get("https://demo.actitime.com/login.do");
		
//Step:4 Find Element by Id locator then input the valid username
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
//Step:5 Find Element by Name Locator then Input the valid password
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		

	}

}
