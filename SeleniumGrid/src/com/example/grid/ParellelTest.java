package com.example.grid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class ParellelTest {
  
	static RemoteWebDriver driver;
	
	@BeforeTest
	  public void beforeTest() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities().firefox();
		capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setBrowserName("firefox");
		 // We are using remote webdriver for testing in cloud. [soucelabs]
		 driver = new RemoteWebDriver(new URL("http://192.168.126.128:5557/wd/hub"), capabilities);
		// driver = new RemoteWebDriver(new URL("http://192.168.10.1:5557/wd/hub" ), capabilities);
		 
		 driver.get("http://www.google.com");
	  }
	
	@Test
  public void GoogleSearch() throws InterruptedException {
		
		driver.findElementByName("q").sendKeys("execute automation");
		
		driver.findElementByName("btnG").click();
		Thread.sleep(3000);
  }
  
	@Test
	  public void ClickTheelement() {
			
			driver.findElementByPartialLinkText("execute automation").click();
			
		
	  }
	  
}
