package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http;//naukari.com");
		driver.manage().window().maximize();
		Action1 a=new Action1(driver);
		
		//creating webelement
		Webelement Recruiters=driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[2]/a"));
		
		//moving cursur 
	
	     a.moveToElement(Recruiters).build().perform();
		
		//clicking on browser all record
		
	   driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[2]/div/ul/li[1]/a"));
		

	
	}
}
  
