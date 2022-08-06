package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TasksSteps {

	@Given("user has already login to Application6")
	public void user_has_already_login_to_application6(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@Given("user is on Tasks page")
	public void user_is_on_tasks_page() {
	   
	}

	@When("get title of Tasks page")
	public void get_title_of_tasks_page() {
	    
	}

	@Then("Title of page should be {string}")
	public void title_of_page_should_be(String string) {
	    
	}

	@Given("User is on home page")
	public void user_is_on_home_page6() {
	    
	}

	@When("user click on Tasks page link")
	public void user_click_on_tasks_page_link() {
	   
	}

	@Then("Companies page should display fieldsetCaption {string}")
	public void companies_page_should_display_fieldset_caption(String string) {
	    
	}
}
