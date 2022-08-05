package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLnk;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDealsLnk;
	
	@FindBy(xpath="//a[contains(text(),'Products')]")
	WebElement ProductsLnk;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDealsBtn;
	
	@FindBy(xpath="//legend[contains(text(),'Deal')]")
	WebElement DealsLegend;
	
	//constructor
	public DealsPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public String getDealsPageTile() {
		return driver.getTitle();
	}
	
	public void getDealsLegend() {
		String dealLegend = DealsLegend.getText();
		System.out.println("DealLegend:"+dealLegend);
	}
	

}
