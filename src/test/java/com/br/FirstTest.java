package com.br;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {
	protected WebDriver driver;
	public String url = "https://www.globo.com";
	
	@Test
	public void browserChrome(){

		System.setProperty(
				"webdriver.chrome.driver",
				"/usr/bin/chromedriver");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--no-sandbox");
				options.addArguments("--headless");
				options.addArguments("--disable-dev-shm-usage");
				driver = new ChromeDriver(options);
				driver.get(url);
	}
}
