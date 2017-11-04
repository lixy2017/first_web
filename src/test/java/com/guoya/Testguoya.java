package com.guoya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testguoya {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.baidu.com/");
		boolean success = false;
		success=driver.getPageSource().contains("百度一下");
		
		System.out.println(success);
	    WebElement kw=driver.findElement(By.id("kw"));
	    kw.clear();
	    kw.sendKeys("果芽软件");
	    Thread.sleep(2000);

	    WebElement su =driver.findElement(By.id("su"));
	    su.click();
	    Thread.sleep(2000);
	    boolean success2 = false;
	    success2= driver.getPageSource().contains("果芽软件");
	    System.out.println(success2);
	    driver.close();
	}	    		
}
