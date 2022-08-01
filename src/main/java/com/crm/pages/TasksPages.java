package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TasksPages {

	 WebDriver driver;
	//Locator
	
		@FindBy(xpath="//a[contains(text(),'Tasks')]")
		WebElement TasksLnk;
		
		@FindBy(xpath="//a[contains(text(),'New Task')]")
		WebElement NewTaskLnk;

		@FindBy(xpath="//a[contains(text(),'Full Search Form')]")
		WebElement FullSearchFormLnk;	
	
	//Constructor
	public TasksPages(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
	
	public String getTasksPagesTile() {
		return driver.getTitle();
	}
}
