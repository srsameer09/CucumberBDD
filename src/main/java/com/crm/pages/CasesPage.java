package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasesPage {

	 WebDriver driver;
	//Locator
	 @FindBy(xpath="//a[contains(text(),'Cases')]")
	 WebElement CaseLnk;
	
	 @FindBy(xpath="//a[contains(text(),'Call')]//following::li[1]")
	 WebElement SearchFormLnk;
		
	 @FindBy(xpath="//a[contains(text(),'Call Scripts')]")
	 WebElement CallScriptsLnk;
		
	 @FindBy(xpath="//a[contains(text(),'Call List')]")
	 WebElement CallListLnk;
	 
	 
	 @FindBy(xpath="//a[contains(text(),'Full Search Form')]")
	 WebElement FullSearchFormLnk;
	 
	 @FindBy(xpath="//th[contains(text(),'Targets')]")
	 WebElement FLDCaption;
	 
	 
	
	//Constructor
	public CasesPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
	
	public String getCasesPageTile() {
		return driver.getTitle();
	}
	
	public void getFLDCaption() {
		
		String caption = FLDCaption.getText();
		System.out.println("caption:"+caption);
	}
	
}
