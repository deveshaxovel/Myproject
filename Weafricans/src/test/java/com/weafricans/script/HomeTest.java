package com.weafricans.script;

import org.testng.annotations.Test;

import com.actitime.generic.BaseLib;
import com.actitime.generic.WaitStatementLib;
import com.weafricans.pageobject.HomePage;

public class HomeTest extends BaseLib {
	@Test
	public void testLogin(){
		HomePage hp= new HomePage(driver);
		hp.getLoginBtn().click();
		WaitStatementLib.implicitWaitForSeconds(driver,5);
		
	}

}
