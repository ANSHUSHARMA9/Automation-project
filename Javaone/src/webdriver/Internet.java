package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet {

	
	public static void main(String[] args) {
//		System.setProperty("webdriver.ie.driver","C:\\Users\\anshusharma9\\Desktop\\webdriver\\Jariedriver.exe");
        WebDriver driver=new InternetExplorerDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        driver.close();
	}

	
		
	}

