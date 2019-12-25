package com.lonnie.selentest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class Flights1 {
	public static void CalDate(WebDriver driver, WebElement element, String date) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("aurguments[0].setAttribute(driver','"+date+"');", element);
	}
	

	public static void main(String[] args) throws InterruptedException {
		String url="https://www.goindigo.in/?linkNav=home_header";
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		  driver.navigate().to(url);
		  System.out.println("Lauched Chrome browser with link "+url);
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	      
			System.out.println("0 was clicked");
			 driver.findElement(By.linkText("Book Flight")).click();
			 System.out.println("Book Flight was clicked");
			 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/input")).click();
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/input")).sendKeys("Bengaluru");
			 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/input")).sendKeys(Keys.RETURN);
			 //driver.findElement(By.xpath("//*[@id=\"orSrcModal\"]/div/div/div[2]/div/div/div/div/div/div[22]/div[1]")).click();
			 System.out.println("1 was clicked");
			 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/input")).click();
			 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/input")).sendKeys("Lucknow");
			 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[2]/div/div/input")).sendKeys(Keys.RETURN);
			 System.out.println("2 was clicked");
			 //driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[2]/div[1]/div/input")).click();
			 WebElement element=driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[2]/div[1]/div/input"));
			 String date="20-11-2019";
			 CalDate(driver,element,date);
			 System.out.println("2.2 was clicked");
			 //JavaScriptExecutor js=((JavaScriptExecutor)driver);
			 //js.//("document.getElementById('dp1572792693300').value='05 Nov 2019'");
			 driver.findElement(By.xpath("//*[@id=\"dp1572831893318\"]"));
			 driver.findElement(By.linkText("4")).sendKeys(Keys.RETURN);
			 //driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[2]/div[1]/div/input")).sendKeys(Keys.RETURN);
			 System.out.println("3 was clicked");
			 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[2]/div[2]/div/input")).click();
			 System.out.println("4 was clicked");

	}

}
