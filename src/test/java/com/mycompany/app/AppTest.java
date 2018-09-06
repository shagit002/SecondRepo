package com.mycompany.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
    

	public WebDriver driver;

	@Test
	public void logInTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucky\\eclipse-workspace\\SeleniumPractice\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
  
	}
}
