package com.gmailpomfact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComposeGmail {
	
	WebDriver driver;
	
	By compose=By.xpath("//*[@id=\":3n\"]/div/div");
	By toName=By.xpath("//*[@id=\":9e\"]");
	By subject=By.xpath("//*[@id=\":8w\"]");
	By message=By.xpath("//*[@id=\":a1\"]");
	By sendbtn=By.xpath("//*[@id=\":8m\"]");
	
	public ComposeGmail(WebDriver driver) {
		this.driver=driver;
	}
	public void composebutton() {
		driver.findElement(compose).click();
	}
	public void recepient() {
		driver.findElement(toName).sendKeys("guitarlon@aool.com");
	}
	public void subjectline() {
		driver.findElement(subject).sendKeys("Test Email");
	}
	public void mymessage() {
		driver.findElement(message).sendKeys("This email is just to test gmail creation");
	}
	public void sendmessage() {
		driver.findElement(sendbtn).click();
	}
	public void pcomposebutton() {
		this.composebutton();
	}
	public void precepient() {
		this.recepient();
	}
	public void psubjectline() {
		this.subjectline();
	}
	public void pmymessage() {
		this.mymessage();
	}
	public void psendmessage() {
		this.sendmessage();
	}
	

}
