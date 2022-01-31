package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
		WebDriver f1= new ChromeDriver ();
		f1.get("chrome://newtab");
		f1.get("https://www.amazon.in/");
		f1.manage().window().maximize();
		f1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486458391527%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5188558354404139662%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007810%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154447%26gclid%3DCj0KCQiAosmPBhCPARIsAHOen-Pr1JSUWkhdu1rvMFynFO4mIz5OTSxHXWIyMqwBabY-36sCVWgf2iQaArk8EALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	
	}
}