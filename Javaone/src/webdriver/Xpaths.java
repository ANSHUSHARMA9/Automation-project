package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpaths {

	
	private static final By By = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("focusanshu@gmail.com");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("@07");
		
//		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");
//		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("23");
		//driver.findElement(By.xpath("//*[contains(@id 'login']")).click();
		driver.findElement(By.xpath("//select[@id='month']/following::*")).sendKeys("Sept");
				
		
		
		
		
		
				//driver.findElement(By.xpath("//select[@id='month']").sendKeys("Apr");
		
	
        //driver.findElement(By.xpath("//Input[@id='loginbutton']]")).click();
		
		//driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58me _58mi _3ma _6o _6v']")).click();
		
//		button.click();
		
		
		//button[@class='_6j mvm _6wk _6wl _58me _58mi _3ma _6o _6v']
        //driver.findElement(By.id("email")).sendKeys("anshu");
        		
		
	}

	
	}


