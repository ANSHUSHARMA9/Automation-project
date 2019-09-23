package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actions {

	public Actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http;//naukari.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions a=new Actions(driver);
		
		//creating webElement
		Webelement Recruiters=driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[2]/a"));
		
		//moving cursur 
	
	     a.moveToElement(Recruiters).build().perform();
		System.out.println("pass");
		//clicking on browser all rec
		
	   //driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[2]/div/ul/li[1]/a"));
		
		
		
		
		

	}

	}





