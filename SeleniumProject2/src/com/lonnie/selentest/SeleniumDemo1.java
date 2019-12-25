package com.lonnie.selentest;
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert; 
import org.openqa.selenium.WebElement; 
public class SeleniumDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		{ 
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe"); 
			  WebDriver driver = new ChromeDriver(); 
			  driver.get("https://www.toolsqa.com/"); 
			   
			  driver.manage().window().maximize(); 
			  // This step will result in an alert on screen 
			  driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/a/span/span")).click();  
			  //Alert simpleAlert = driver.switchTo().alert(); 
			  //String alertText = simpleAlert.getText(); 
			  //System.out.println("Alert text is " + alertText); 
			  //simpleAlert.accept(); 
			  //WebElement element = driver.findElement(By.xpath("//*[@id='cp-cp_id_5cc35 ']/div[1]/div[2]/div/div[2]/div/div")); 
			  //((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
			  driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[4]")).click();
			 
			  //Alert promptAlert  = driver.switchTo().alert(); 
			  //String alertText1 = promptAlert .getText(); 
			  //System.out.println("Alert text is " + alertText1); 
			  //promptAlert.accept(); 
			  //Send some text to the alert 
			 // Thread.sleep(5000);
			  //WebElement element1 = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[4]/a/span/span")); 
			  //((JavascriptExecutor) driver).executeScript("arguments[0].click()", element1);
			  driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[1]")).click();
			  //promptAlert.sendKeys("Hello Edureka"); 
			  //promptAlert.accept();
			 Thread.sleep(10000);
			 driver.close();
			 driver.quit();
			 } 
			 } 
			} 
