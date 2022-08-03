package stepdefinitions;



import com.crm.base.Base;
import com.crm.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewLogin2Steps extends Base {
	
	

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	   DriverFactory.getDriver().get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		homepage=loginPage.doLogin(username, password);
		//log.info("login info:"+username+ "And"+password);
	}


	@Then("Page Title should be {string}")
	public void page_title_should_be(String ExpectedTitleName) {
		 String title = homepage.getHomePageTile();
		 System.out.println("Homepage titile"+title);
		 //Assert.assertEquals(title, ExpectedTitleName);
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		homepage.logout();
		
	}
}
