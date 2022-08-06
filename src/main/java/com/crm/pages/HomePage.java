package com.crm.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//a[contains(text(),'Contact support')]
	private WebDriver driver;
	
	String user="premrji20 prem";

	
	//@FindBy(xpath="//td[contains(text(),'\"+user+\"')]")
	//WebElement userName;
	//@FindBy(xpath="//*[@class=\"headertext\"]//preceding::td[2]")
	//WebElement userName;
	
	@FindBy(xpath="//td[contains(text(),'User: premrji20 prem')]")
	WebElement userName;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	WebElement logoutLnk;
	
	@FindBy(how=How.NAME, using= "search")
	WebElement SearchTxt;
	
	@FindBy(xpath="//input[@type='image']")
	WebElement SearchBtn;
	
	//case page link
	 @FindBy(xpath="//a[contains(text(),'Cases')]")
	 WebElement CasesLnk;
	 
	 @FindBy(xpath="//a[contains(text(),'New Case')]")
	 WebElement newCasesLnk;
	 //Call page link
	 @FindBy(xpath="//a[contains(text(),'New Call')]")
	 WebElement NewCallLnk;
	 
	 @FindBy(xpath="//a[@href=\"https://classic.freecrm.com/system/index.cfm?action=call\"]")
	 WebElement CallLnk;
	 
	 
	

	
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
	
	public CallPage ClickOnNewCallLink() {
		Actions action=new Actions(driver);
		action.moveToElement(CallLnk).build().perform();
		NewCallLnk.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return new CallPage(driver);
		
		
	}
	
	public void ClickOnNewCasesLnk() {
		newCasesLnk.click();
	}
	

}
