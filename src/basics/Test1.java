package basics; //this is name of the folder 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver(); //Launch the Chrome browser 

driver.get("https://www.google.com/"); //Open a website

System.out.println(driver.getTitle()); //Print Title name of the website

System.out.println(driver.getCurrentUrl()); //Print Current URL 

driver.close(); //For close 


	}

}
