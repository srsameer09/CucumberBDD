package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CallPage {

	 WebDriver driver;
	//Locator
	
	 @FindBy(xpath="//a[contains(text(),'Call')]")
	 WebElement CallLnk;
	 
	 @FindBy(xpath="//a[contains(text(),'New Call')]")
	 WebElement NewCallLnk;
	
	 @FindBy(xpath="//a[contains(text(),'Call Scripts')]")
	 WebElement CallScriptsLnk;
	 
	 @FindBy(xpath="//a[contains(text(),'Call List')]")
	 WebElement CallListLnk;
	 
		
     @FindBy(xpath="//*[contains(text(),'Call Information')]")
     WebElement fieldsetCaption;
	
	
	//Constructor
	public CallPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
	}
	
	
	public String getCallPageTile() {
		return driver.getTitle();
	}
	
	public CallPage ClickNewCallLnk() {
		NewCallLnk.click();
		return new CallPage(driver);
		
	}
	
	public String getLabel() {
		
		String caption = fieldsetCaption.getText();
		System.out.println("fieldsetCaption i.e Call Information: "+caption);
		return caption;
	}
}
