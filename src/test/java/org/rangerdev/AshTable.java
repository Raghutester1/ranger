package org.rangerdev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AshTable {
	static WebDriver driver;
	@Parameters({"browser"})
	@Test
	private void tc01(String name) {
		if(name.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
			
		}
       if(name.equals("Chrome")) {
    	   WebDriverManager.chromedriver();
    	   driver= new ChromeDriver();
    	   driver.get("https://www.flipkart.com/");
		
	}
	}
	
}
