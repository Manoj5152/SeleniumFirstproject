package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver" ,"D:\\Seleniumjars\\chromedriver.exe" );
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
	d.manage().window().maximize();
	d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7373208125");
	d.findElement(By.name("pass")).sendKeys("07373208125");
	d.findElement(By.name("login")).click();
	Thread.sleep(5000);
	d.findElement(By.className("a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7")).click();
	 }

}
//name("email")).sendKeys("7373208125");