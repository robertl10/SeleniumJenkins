package com.gmailpomfact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailPOMlogin {
	
	WebDriver driver;
	
	By loginlink=By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/ul/li[1]/div");
	//By passwordlogin=By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
	By passwordlogin=By.name("password");
	By nextbtn=By.xpath("//*[@id=\"passwordNext\"]/span/span");
	
	public GmailPOMlogin(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loginlink() {
		driver.findElement(loginlink).click();
	}
	
	public void passwordinput() {
		driver.findElement(passwordlogin).click();
		driver.findElement(passwordlogin).sendKeys("lonnie10@");
	}
	public void btnext() {
		driver.findElement(nextbtn).click();
	}
	
	public void loginGmailPOM() {
		this.loginlink();
	}
	
	public void passwordin() {
		this.passwordinput();
	}
	public void nextbutton() {
		this.btnext();
	}

}
