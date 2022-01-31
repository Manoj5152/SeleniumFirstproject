package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitterlogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumjars\\chromedriver.exe" );
		WebDriver t = new ChromeDriver();
		t.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
 t.manage().window().maximize();
t.findElement(By.xpath("/html/body")).click() ;
 
 t.manage().window().maximize();
 
	

}}