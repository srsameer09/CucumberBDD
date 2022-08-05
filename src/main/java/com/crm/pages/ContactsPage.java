package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	 WebDriver driver;
	//Locator
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement ContactsLnk;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement NewContactLnk;


	@FindBy(xpath="//a[contains(text(),'Combined Form')]")
	WebElement CombinedFormLnk;
	
	@FindBy(xpath="//a[contains(text(),'Full Search Form')]")
	WebElement FullSearchFormLnk;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//legend[contains(text(),'Contact Information')]")
	WebElement ContactLegend;

	
	
	//Constructor
	public ContactsPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
	
	public String getContactsPageTile() {
		return driver.getTitle();
	}
	
	public void getContactLegend() {
		String dealLegend = ContactLegend.getText();
		System.out.println("ContactLegend:"+ContactLegend);
	}
	
}
