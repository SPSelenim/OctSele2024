package com.stc.SeleniimTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {
	
	public WebDriver driver=null;
	public String fn="fname";
	public String ln="lname";
	public String qa="//a[@name='QA']";
	
	
	public POMSearch (WebDriver driver)
	{
		this.driver=driver;
	}
	
	private WebElement getFirstName()
	{
		WebElement f=null;
		
		try
		{
			f=driver.findElement(By.id(fn));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return f;
	}

	private WebElement getLastName()
	{
		WebElement l=null;
		
		try
		{
			l=driver.findElement(By.id(ln));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return l;
	}

	private WebElement getQA()
	{
		WebElement q=null;
		driver.findElement(By.id(fn));
		if (5==5)
		{
			System.out.println("Equal");
		}
		else
		{
			driver.findElement(By.id(fn));
			System.out.println("NOT Equal");
		}
		try
		{
			q=driver.findElement(By.xpath(qa));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return q;
	}

	
	public void sendFirstName(String f1)
	{
		getFirstName().sendKeys(f1);
	String aa="100";
	}
	
	

	public void sendLastName(String l1)
	{
		try
		{
		getLastName().sendKeys(l1);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		
		}
	public void clickQA()
	{
		try
		{
	getQA().click();
	
		}
		catch(Exception e)
		{
			}
		
		}


}
