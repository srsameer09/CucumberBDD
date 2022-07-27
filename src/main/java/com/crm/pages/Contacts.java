package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contacts {

	
	@FindBy(xpath="//a[contains(text(),'')]")
	WebElement dealsBtn1;
	
	@FindBy(xpath="//a[contains(text(),'')]")
	WebElement dealsBtn;
}
