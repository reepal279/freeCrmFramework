package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	 public static final long PAGE_LOAD_TIMOUT = 50;
	public static long PAGE_LOAD_TIMEOUT = 50;
	 public static long IMPLICIT_WAIT = 80;
	public static long EXPLICIT_WAIT = 20;
	
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}


	public static Object[][] getTestData(String sheetName) {
		// TODO Auto-generated method stub
		return null;
	}

}
