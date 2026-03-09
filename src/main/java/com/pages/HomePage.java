package com.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	private final static By img_Menu = By.xpath("//span[@class='oxd-userdropdown-tab']");
	
	private final static By link_logout = By.xpath("//a[text()='Logout']");
	
	
	public HomePage clickMenuImage() {
		click(img_Menu,"MenuImage");
		return this;
	}
	
	public HomePage clickLogoutLink() {
		click(link_logout,"LogoutButton");
		return this;
	}
	
	
	


}
