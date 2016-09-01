package com.example.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class StarterofGrid {

	static RemoteWebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities().firefox();
		
		capabilities.setPlatform(Platform.WIN8_1);
		capabilities.setBrowserName("firefox");
		
		// driver = new RemoteWebDriver(new URL("http://192.168.137.1:5557/wd/hub"), capabilities);
		 driver = new RemoteWebDriver(new URL("http://192.168.126.128:5557/wd/hub"), capabilities); 
		 driver.get("http://www.google.com");
	}

}
