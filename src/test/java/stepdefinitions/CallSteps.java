package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CallSteps {

	@Given("user has already login to Application")
	public void user_has_already_login_to_application(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
	}

	@Given("user is on call page")
	public void user_is_on_call_page() {
	   
	}

	@When("get title of call page")
	public void get_title_of_call_page() {
	    
	}

	@Then("title of page should be {string}")
	public void title_of_page_should_be(String string) {
	    
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
	    
	}

	@When("user click on call page link")
	public void user_click_on_call_page_link() {
	    
	}

	@Then("call page should display fieldsetCaption {string}")
	public void call_page_should_display_fieldset_caption(String string) {
	  
	}
}
