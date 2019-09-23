package CPSAT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Inconito {

	
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Incognito");
		options.addArguments("-disable-notifications");
		//initialize the browser
        WebDriver driver=new ChromeDriver(options);
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        
    //wait time for script to execute
     //driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     driver.findElement(By.id("email")).sendKeys("ANSHU");
     driver.close();
     
//	    Launch URL
  driver.get("http://facebook.com");
  driver.manage().window().maximize();
  //driver.close();

    
	}

}
