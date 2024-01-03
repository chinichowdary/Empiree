package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pages.Loginfunctionality;
import com.pages.Logoutfunctionality;

public class LogoutTest extends Testbase {
	
	Logoutfunctionality logut;
	Loginfunctionality logn;
public LogoutTest() {
		super();
	}
@BeforeMethod
public void inta() {
	
	set();
	
	 logn =new  Loginfunctionality(driver);
	 logut=new Logoutfunctionality(driver);
}

@Test
public void log() throws Throwable {
	logn.validelogin();
	Thread.sleep(2000);
	logut.valide();
}
}


