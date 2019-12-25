package com.lonnie.selentest;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	 public static WebDriver driver=null;
	 
	public static void main(String[] args) throws Exception {
		String browsr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser type ... Chrome or Firefox");
		browsr=sc.nextLine();
		if(browsr.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.edureka.co");
		driver.manage().window().maximize();
		}
		if(browsr.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://www.edureka.co");
		driver.manage().window().maximize();
		}
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\rober\\eclipse-workspace\\SeleniumProject2\\Drivers\\IEDriverServer.exe");
	    //driver =new InternetExplorerDriver();
		//driver.get("https://www.edureka.co");
		//driver.manage().window().maximize();
		
		
		//driver.findElement(By.id("search-inp-overlay-new")).click();
		//driver.findElement(By.id("search-inp-overlay-new")).sendKeys("Just Testing");
		driver.findElement(By.tagName("li").className("ga-allcourses")).click();
		//driver.findElement(By.className("new-search-inp")).click();
		//driver.findElement(By.className("new-search.inp")).sendKeys("post");
		driver.findElement(By.linkText("Log In")).click();
		//driver.findElement(By.partialLinkText("javascript"));
		//driver.findElement(By.className("close")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("si_popup_email")).sendKeys("Test@test.com");
		
	}

}
