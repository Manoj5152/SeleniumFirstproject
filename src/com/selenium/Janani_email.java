package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janani_email {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumjars\\chromedriver.exe");
		WebDriver email = new ChromeDriver ();
		email.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		email.findElement(By.id("identifierId")).sendKeys("b.janani530@gmail.com");
		email.findElement(By.className("VfPpkd-vQzf8d")).click();
		email.findElement(By.name("password")).sendKeys("cutejanani");
		email.findElement(By.className("VfPpkd-vQzf8d")).click();
	}

}
//("//*[@id=\"identifierId\"]")).sendKeys("b.janani530@gmail.com");VfPpkd-vQzf8d