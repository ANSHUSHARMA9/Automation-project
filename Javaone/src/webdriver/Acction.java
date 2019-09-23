package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Acction {

	
	public static void main(String[] args)throws Exception { 
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		WebElement rec=driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[2]/a/div"));
		
		Actions as=new Actions(driver);
		
		//moving 
	
	     as.moveToElement(rec).build().perform();
		
		//clicking on browser all record
		
	   driver.findElement(By.xpath("/html/body/div[1]/div/div/ul/li[2]/div/ul/li[1]/a")).click();
		

	

	}

}
