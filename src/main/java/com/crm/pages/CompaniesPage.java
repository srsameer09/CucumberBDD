package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage {
	
	 WebDriver driver;
	//Locator
	 @FindBy(xpath="//a[contains(text(),'Companies')]")
	 WebElement CompaniesLnk;
	 
	@FindBy(xpath="//a[contains(text(),'New Company')]")
	WebElement NewCompanyLnk;
	
	 @FindBy(xpath="//a[contains(text(),'Combined Form')]")
	 WebElement CombinedFormLnk;
	 
	 @FindBy(xpath="//a[contains(text(),'Full Search Form')]")
	 WebElement FullSearchFormLnk;

	
	
	//Constructor
	public CompaniesPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
	
	public String getCompaniesPageTile() {
		return driver.getTitle();
	}
	
	
}
