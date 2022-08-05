package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CasesSteps {

	@Given("user has already login to Application1")
	public void user_has_already_login_to_application1(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
	}

	@When("get title of Cases page")
	public void get_title_of_cases_page() {
	    
	}

	@Then("title1 of page should be {string}")
	public void title1_of_page_should_be(String string) {
	  
	}

	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    
	}

	@When("user click on Cases page link")
	public void user_click_on_cases_page_link() {
	   
	}

	@Then("Cases page should display fieldsetCaption {string}")
	public void cases_page_should_display_fieldset_caption(String string) {
	   
	}

}
