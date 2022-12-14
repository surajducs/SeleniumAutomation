package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTreversing {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");

//Xpath by treversing - Identify the static element 		
		driver.findElement(By.xpath("//p[text()='C#']")).click();

//Xpath By treversing - Indetify the common perent 		
		driver.findElement(By.xpath("//p[text()='C#']/..")).click();
		
//Xpath By Treversing - go to with tagname and position value 		
		driver.findElement(By.xpath("//p[text()='C#']/../p[3]")).click();
		
		driver.quit();

	}

}
