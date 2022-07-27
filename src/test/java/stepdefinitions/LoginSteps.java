package stepdefinitions;

import org.junit.Assert;

import com.crm.factory.DriverFactory;
import com.crm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

	private static String  title;
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	
	//private WebDriver driver;
	

	@Given("user is on login page")
	
	public void user_is_on_login_page() {
		
		DriverFactory.getDriver().navigate().to("https://classic.freecrm.com/");
	   
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		//driver.getTitle();
		String title = loginPage.getLoginPageTitle();
		System.out.println("loginpage_title:"+title);
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String ExpectedTitleName) {
		String title = loginPage.getLoginPageTitle();
	    Assert.assertTrue(title.contains(ExpectedTitleName));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    
		Assert.assertTrue(loginPage.isForgotPasswordLnk());
			
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickBtn();
	}

	@Then("user gets the title of the Home page")
	public void user_gets_the_title_of_the_home_page() {
		
		String title = loginPage.getLoginPageTitle();
		//String title = driver.getTitle();
		//System.out.println("Home page title"+title);
		Assert.assertEquals(title, "");
	}


}
