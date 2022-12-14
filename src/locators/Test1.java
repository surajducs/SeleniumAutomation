package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
//Step:1 open the Browser 
		
		WebDriver driver=new ChromeDriver();
		
//Step:2 maximize the maximize 
		
		driver.manage().window().maximize();
		
//Step:3 open the application 
		
		driver.get("https://www.facebook.com/");
		
//Step:4 Input valid user name 
		
		driver.findElement(By.id("email")).sendKeys("Suraj");
		
//Step:5 input valid password
		
		driver.findElement(By.id("pass")).sendKeys("Test");
		
//Step:6 Click Login button
		
		driver.findElement(By.name("login")).click();

	}

}
