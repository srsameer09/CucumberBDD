package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsSteps {

	@Given("user2 has already login to Application")
	public void user2_has_already_login_to_application(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@When("get title of Contactspage")
	public void get_title_of_contactspage() {
	    
	}

	@Then("title of page should be {string}.")
	public void title_of_page_should_be(String string) {
	   
	}

	@Given("user2 is on home page")
	public void user2_is_on_home_page() {
	   
	}

	@When("user click on Contacts page link")
	public void user_click_on_contacts_page_link() {
	    
	}

	@Then("Contacts page should display fieldsetCaption {string}")
	public void contacts_page_should_display_fieldset_caption(String string) {
	    
	}

}
