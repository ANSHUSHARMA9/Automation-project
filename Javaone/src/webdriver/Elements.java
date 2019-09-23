package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Elements {

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		List links=driver.findElements(By tagname("a"));
		System.out.println(((java.util.List<org.openqa.selenium.WebElement>) links).size());
		
		List <WebElement> imgs=driver.findElements(By tagname("img"));
		System.out.println(links.size());
		
		



}
}
