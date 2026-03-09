package com.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.customAnnotation.FrameworkAnnotation;
import com.enums.FrameworkData;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.DataProvider;
import com.utils.PropertyFileUtil;

public class LoginLogoutHRMTest extends BaseTest{

	@FrameworkAnnotation(author = {"Kiran", "Gurindagunta"}, category = {"Sanity", "Regression"})
	@Test(dataProvider = "exceldata", dataProviderClass = DataProvider.class)
	public void newTest(Map<String,String> data) throws InterruptedException {


		HomePage login = new LoginPage()
				.enterUsername(data.get("username")).enterPassword(data.get("password")).
				clickSubmitBtn().clickMenuImage().clickMenuImage().clickLogoutLink();
		Thread.sleep(5000);

	}

	@FrameworkAnnotation(author = {"Kiran", "Gurindagunta"}, category = {"Sanity", "Regression"})
	@Test(dataProvider = "exceldata", dataProviderClass = DataProvider.class)
	public void loginLogoutTest(Map<String,String> data) throws InterruptedException {


		HomePage login = new LoginPage()
				.enterUsername(data.get("username")).enterPassword(data.get("password")).
				clickSubmitBtn().clickMenuImage().clickMenuImage().clickLogoutLink();
		//login.enterUsername("Admin").enterPassword("admin123").clickSubmitBtn();
		Thread.sleep(5000);

	}
	
	
	/*@Test(dataProvider = "exceldata", dataProviderClass = DataProvider.class)
	public void newTest(Map<String,String> data) throws InterruptedException {


		HomePage login = new LoginPage()
				.enterUsername(PropertyFileUtil.getPropertyFileValue(FrameworkData.USERNAME)).enterPassword(PropertyFileUtil.getPropertyFileValue(FrameworkData.PASSWORD)).
				clickSubmitBtn().clickMenuImage().clickMenuImage().clickLogoutLink();
		//login.enterUsername("Admin").enterPassword("admin123").clickSubmitBtn();
		Thread.sleep(5000);

	}

	@Test(dataProvider = "exceldata", dataProviderClass = DataProvider.class)
	public void loginLogoutTest() throws InterruptedException {


		HomePage login = new LoginPage()
				.enterUsername(PropertyFileUtil.getPropertyFileValue(FrameworkData.USERNAME)).enterPassword(PropertyFileUtil.getPropertyFileValue(FrameworkData.PASSWORD)).
				clickSubmitBtn().clickMenuImage().clickMenuImage().clickLogoutLink();
		//login.enterUsername("Admin").enterPassword("admin123").clickSubmitBtn();
		Thread.sleep(5000);

	}*/
}
