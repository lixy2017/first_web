package com.guoya;

import javax.print.attribute.standard.Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.selenesedriver.FindElement;
import org.openqa.selenium.support.FindBys;

public class Testselenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1:8081/first_web/MyHtml.html");
		boolean success = false;
		success=driver.getPageSource().contains("login:");
		
		System.out.println(success);
	    WebElement kw=driver.findElement(By.id("login"));
	    kw.clear();
	    kw.sendKeys("lixy");
	    Thread.sleep(2000);
	    WebElement password= driver.findElement(By.id("password"));
	    password.clear();
	    password.sendKeys("123456");	    
	    WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
	    submit.click();
	    Thread.sleep(2000);
	    boolean success2 = false;
	    success2= driver.getPageSource().contains("post success");
	    System.out.println(success2);
	    driver.close();
	    		
	    		
	    
	}
}
