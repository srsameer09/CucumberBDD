package stepdefinitions;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.crm.factory.DriverFactory;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	private HomePage homepage;
	
	@Given("user has already login to application")
	public void user_has_already_login_to_application(DataTable credentialTable) {
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
		homepage=loginpage.doLogin(uname, pass);
	}

	@Given("user is on Home page")
	public void user_is_on_home_page() {
		String title=homepage.getHomePageTile();
		System.out.println(""+title);
	}

	@When("user get the title of home page")
	public void user_get_the_title_of_home_page() {
	    
	}

	@Given("user is on HomePage")
	public void user_is_on_homepage() {
	    
	}

	@When("user get Home Page")
	public void user_get_home_page() {
	    
	}

	@Then("username should be {string}")
	public void username_should_be(String string) {
		String username = homepage.getUserName();
		System.out.println("username"+username);
	}

	@Given("user already on the Home page")
	public void user_already_on_the_home_page() {
	    
	}

	@When("add {string} to the search box")
	public void add_to_the_search_box(String string) {
	    
	}

	@When("click the search button")
	public void click_the_search_button() {
	    
	}

	@Then("{string} should be mentioned in the result")
	public void should_be_mentioned_in_the_result(String string) {
	    
	}
}
