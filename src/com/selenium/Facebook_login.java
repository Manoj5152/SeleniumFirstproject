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
	d.findElement(By.className("oajrlxb2 g5ia77u1 qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 nc684nl6 p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x jb3vyjys rz4wbd8a qt6c0cv9 a8nywdso i1ao9s8h esuyzwwr f1sip0of lzcic4wl gmql0nx0 gpro0wi8 hnhda86s")).click();
	 }

}
//name("email")).sendKeys("7373208125");