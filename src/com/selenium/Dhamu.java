package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dhamu {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "D:\\Seljars\\chromedriver1.exe");
		WebDriver t = new ChromeDriver();
		t.get("https://learn.thryv.com/hc/en-us");
		t.manage().window().maximize();
t.findElement(By.className("login")).click();
t.findElement(By.name("user[email]")).sendKeys("cjt@depxy.com");
t.findElement(By.name("user[password]")).sendKeys("welcome1");
t.findElement(By.name("commit")).click();
	}

}
