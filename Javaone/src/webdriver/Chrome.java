package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

	
	public static void main(String[] args) {
//		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\anshusharma9\\Desktop\\Webdriver\\JarChromeDriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("Anshu");
        driver.findElement(By.id("pass")).sendKeys("Sharma");
        driver.findElement(By.id("firstname")).sendKeys("Anshu");
        driver.close();
//        driver.findElement(By.id("surname")).sendKeys("Sharma");
//        driver.findElement(By.id("Mobile number or email address")).sendKeys("8897212894");
//        driver.findElement(By.id("new password")).sendKeys("Anshu#07");
//        driver.findElement(By.id("day")).sendKeys("25");
//        driver.findElement(By.id("month")).sendKeys("Sep");
//        driver.findElement(By.id("year")).sendKeys("1993");
//        driver.close();
//        driver.findElement(By.id("firstname")).sendKeys("Anshu");
//        driver.findElement(By.id("firstname")).sendKeys("Anshu");
//        driver.findElement(By.id("firstname")).sendKeys("Anshu");
//        
        
        
	}

}
