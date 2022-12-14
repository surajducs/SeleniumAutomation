package locators;

//There are not Present Id,Name locator use CSS selector

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		
//Step:1 open a browser 

		WebDriver driver=new ChromeDriver();
		
//Step:2 Maximize Browser

		driver.manage().window().maximize();
		
//Step:3 open a application

		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
//Step:4 input Login id 

		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
		
//Step:5 input password

		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("manager");
		
//Step:6 select check box to keep me login

		driver.findElement(By.cssSelector("input[id='keepLoggedInCheckBox']")).click();
		
//Step:7 Click Login button

		driver.findElement(By.cssSelector("button[class='login_Btn']")).click();
		
	}

}
