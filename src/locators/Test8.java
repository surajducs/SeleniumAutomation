package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
// find element by - Xpath By Attribute - Syntax: //tagname[@AN='AV']		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
//find element by - Xpath By Attribute - Syntax: //tagname[@AN='AV']		
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
//find Element by - Xpath by Text() - Syntax: //tagname[text()='AV']		

		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
