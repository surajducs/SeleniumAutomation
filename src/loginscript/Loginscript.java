package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginscript {

	public static void main(String[] args) {
		
//Step:1 open the browser 
		WebDriver driver=new ChromeDriver();
		
//Step:2 Maximize the browser
		driver.manage().window().maximize();
		
//Step:3 open the URl
		driver.get("https://demo.actitime.com/login.do");
		
//Step:4 Enter the valid username 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
//Step:5 Enter the valid password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
//Step:6 click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

//Step:8 Get the Title		
		String title=driver.getTitle();
		System.out.println(title);

//Step:9 Get Current URl		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
//Step:10 Close Application
		driver.quit();
	}

}
