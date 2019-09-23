package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("anshu");
		boolean a=driver.findElement(By.id("email")).isDisplayed();
		if (a==true)
			System.out.println("pass");
		else
			System.out.println("fail");
		
			
		

	}

}