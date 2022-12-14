package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//launching web browser
		
		driver.manage().window().maximize();
		//for maximize web page
		
		driver.get("https://www.skillrary.com/");
		//open a web page
		
		Thread.sleep(3000);
		//for Delay 3sec 
		
		driver.navigate().to("https://amazon.com/");
		//for goto skillrary to amazon site
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
