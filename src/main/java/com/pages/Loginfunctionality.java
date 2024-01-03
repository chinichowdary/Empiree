package com.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Loginfunctionality extends Testbase {
	
	@FindBy(xpath="//input[@type='text']")
	WebElement usar;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement psd;
	
	@FindBy(xpath="//button[.='Login']")
	WebElement lgn;
	
	public Loginfunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validelogin() {
		usar.sendKeys(props.getProperty("username"));
		psd.sendKeys(props.getProperty("password"));
		lgn.click();
}
}
