package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CallPage {

	 WebDriver driver;
	//Locator
	
	 @FindBy(xpath="//a[contains(text(),'Cases')]")
	 WebElement CasesLnk;
	 
	@FindBy(xpath="//a[contains(text(),'New Case')]")
	WebElement newCasesLnk;
	
	 @FindBy(xpath="//a[contains(text(),'Full Search Form')]")
	 WebElement FullSearchFormLnk;
		

	
	
	//Constructor
	public CallPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
	
	public String getCallPageTile() {
		return driver.getTitle();
	}
}
