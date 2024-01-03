package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pages.Loginfunctionality;

public class LoginTest extends Testbase {
	
	Loginfunctionality logn;
	 public LoginTest() {
	}
	@BeforeMethod
	public void inta() {
		set();
		
		 logn=new Loginfunctionality (driver);
	}
	
	@Test
	public void log() {
		logn.validelogin();

}
}


