package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	
	String newuser="sameer";
	
	//@FindBy(xpath="//td[contains(text(),'+newuser+')]")
	//WebElement userName1;
	
	@FindBy(xpath="//td[contains(text(),'premrji20 prem')]")
	WebElement userName;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	WebElement logoutLnk;
	
	@FindBy(how=How.NAME, using= "search")
	WebElement SearchTxt;
	
	@FindBy(xpath="//input[@type='image']")
	WebElement SearchBtn;
	

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTile() {
		return driver.getTitle();
	}
	
	public void logout() {
		logoutLnk.click();
	}

	public String getUserName() {
		
		String username = userName.getText();
		return username;
	}
	

}
