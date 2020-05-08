package com.br;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	protected WebDriver driver;
	public String url = "http://www.globo.com";
	
	//@Test
	public void browserChrome(){

		System.setProperty("webdriver.chrome.driver", "/var/jenkins_home/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

	}
	
	@Test
	public void browserFirefox(){
		System.setProperty(
				"webdriver.gecko.driver",
				"/var/jenkins_home/geckodriver");
		driver = new FirefoxDriver();
		driver.get(url);
	}

}
