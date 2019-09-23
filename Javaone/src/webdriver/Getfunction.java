package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getfunction {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		WebElement pwd=driver.findElement(By.id("pass"));
		
		String a=pwd.getAttribute("class");
		System.out.println(a);
		
		System.out.println(pwd.getTagName());
		System.out.println(pwd.getLocation());
		System.out.println(pwd.getSize());
		
		
		
		
		
		
	}

}
