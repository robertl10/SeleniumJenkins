package com.lonnie.selentest;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ChromeLaunch {

	public static void main(String[] args) {
		String titil;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		
		
		driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.edureka.co");
		driver.manage().window().maximize();
		
		
		WebElement holdup;
		//driver.navigate().forward();
		driver.findElement(By.id("search-inp-overlay-new"));
		driver.navigate().forward();
		holdup=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-inp-overlay-new")));
		driver.findElement(By.id("search-inp-overlay-new")).sendKeys("Selenium");
		driver.findElement(By.id("search-inp-overlay-new")).sendKeys(Keys.RETURN);
		holdup=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-inp-overlay-new")));
		titil=driver.getTitle();
		System.out.println(titil);
		driver.findElement(By.tagName("li").className("ga-allcourses")).click();
		holdup=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-inp-overlay-new")));

	}

}
