package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
		WebDriver W = new ChromeDriver();
		W.get("https://www.w3schools.com/java/default.asp");
		W.manage().window().maximize();
		W.get("https://www.w3schools.com/java/java_comments.asp");
		W.get("https://www.w3schools.com/java/default.asp");
	
	}

}
