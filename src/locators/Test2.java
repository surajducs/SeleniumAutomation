package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.findElement(By.id("email")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("manager");
		
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		driver.findElement(By.name("login")).click();
		
	}

}
