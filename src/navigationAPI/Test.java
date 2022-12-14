package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		//for back button
		Thread.sleep(3000);
		
		driver.navigate().forward();
		//for forward the page
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		//for refresh the page 
		Thread.sleep(5000);
		
		driver.close();
		//for automatic close web page
		
		

	}

}
