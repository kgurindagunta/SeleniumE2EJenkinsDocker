package com.pages;

import org.openqa.selenium.By;

public final class LoginPage extends BasePage {

	

	private final static By input_username = By.xpath("//input[@name='username']");

	private final static By input_password = By.xpath("//input[@name='password']");

	private final static By btn_submit = By.xpath("//button");


	public LoginPage enterUsername(String value) {

		enterInput(input_username, value,"Username");
		return new LoginPage();
	}

	public LoginPage enterPassword(String value) {

		enterInput(input_password, value,"Password");
		return new LoginPage();
	}
	
	public  HomePage clickSubmitBtn() {
		click(btn_submit, "SubmitButton");
		return new HomePage();
	}







}
