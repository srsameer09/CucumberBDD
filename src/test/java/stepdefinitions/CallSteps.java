package stepdefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.crm.base.Base;
import com.crm.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CallSteps extends Base{

	
	@Given("user1 has already login to Application")

		public void user1_has_already_login_to_application(DataTable credentialTable) {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		    //
		    // For other transformations you can register a DataTableType.
			Map<String, String> cred =  credentialTable.asMap();
			
			List<Map.Entry<String,String>> credlist = new ArrayList<Map.Entry<String,String>>(cred.entrySet());
			String uname =credlist.get(1).getKey();
			String pass =credlist.get(1).getValue();
			
			//String uname = credlist.get(0).get("username");
			//String pass = credlist.get(0).get("password");
			
			//DriverFactory.getDriver().get("https://classic.freecrm.com/");
			DriverFactory.getDriver().navigate().to("https://classic.freecrm.com/");
			System.out.println("login with: " + uname + " and " + pass);
			homepage=loginPage.doLogin(uname, pass);
	   
	}

	@Given("user is on call page")
	public void user_is_on_call_page() {
		callpage=homepage.ClickOnNewCallLink();
		
	}

	@When("get title of call page")
	public void get_title_of_call_page() {
		title=callpage.getCallPageTile();
		System.out.println("callpage:"+title);
	}

	@Then("title of page1 should be {string}")
	public void title_of_page1_should_be(String callpagetitle) {
		title=callpage.getCallPageTile();
		System.out.println("callpage:"+title);
		Assert.assertEquals(callpagetitle, title);   
		
	}

	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    
	}

	@When("user click on call page link")
	public void user_click_on_call_page_link() {
		callpage.ClickNewCallLnk();
	}

	@Then("call page should display fieldsetCaption {string}")
	public void call_page_should_display_fieldset_caption(String string) {
		String label = callpage.getLabel();
		System.out.println("callpage:"+label);
		
	}
}
