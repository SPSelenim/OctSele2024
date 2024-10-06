package com.stc.SeleniimTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SearchTest {
public WebDriver driver=null;

	@BeforeClass
	public void Init()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		//driver=new ChromeDriver(option);
		driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	}

	
	@Test
  public void f() {
driver.manage().window().maximize();
try
{
POMSearch ss=new POMSearch(driver);
ss.sendFirstName("xxx1");
ss.sendLastName("yyy1");
	ss.clickQA();
	String act=driver.findElement(By.xpath("//b")).getText();
	Assert.assertEquals(act,"Hello QA","NOT Matching")	;
	System.out.println(act + " : FOUND");
	Thread.sleep(2000);
}
catch(Exception e)
{
	System.out.println( e.getMessage());
}
  }

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	
}
