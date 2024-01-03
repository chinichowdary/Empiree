package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pages.Allcustomers;
import com.pages.Loginfunctionality;
import com.pages.Logoutfunctionality;

public class AllcustomersTest extends Testbase {
		Loginfunctionality logn;
		Allcustomers Ac;
		Logoutfunctionality logut;
		
		
	public AllcustomersTest () {
			super();
		}
	@BeforeMethod
	public void inta() {
		
		set();
		
		 logn =new  Loginfunctionality(driver);
		 Ac=new Allcustomers(driver);
		 logut=new Logoutfunctionality(driver);
	}

	@Test
	public void log() throws Throwable {
		logn.validelogin();
		Thread.sleep(2000);
		
		Ac.customers();
		Thread.sleep(2000);
		logut.valide();
	}
		
	}



