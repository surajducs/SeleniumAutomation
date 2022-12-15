package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGroupIndexInRealTime {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]")).click();
		
		//Xpath group index - Syntax: (//tagname[@text()='textValue'])[positionValue]

	}

}
