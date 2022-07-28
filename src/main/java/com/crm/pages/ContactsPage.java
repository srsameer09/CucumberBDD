package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	 WebDriver driver;
	//Locator
	
	@FindBy(xpath="//a[contains(text(),'')]")
	WebElement dealsBtn1;
	
	@FindBy(xpath="//a[contains(text(),'')]")
	WebElement dealsBtn;

	
	@FindBy(xpath="")
	WebElement userName;
	
	@FindBy(xpath="" ) 
	WebElement Pass;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;

	
	
	//Constructor
	public ContactsPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
}
