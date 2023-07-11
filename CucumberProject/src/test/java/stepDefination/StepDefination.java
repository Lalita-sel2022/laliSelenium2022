package stepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefination {
	  @Given("^user is on netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() {
	        //Code to navigate login page
		  System.out.println("Navigate to login page");
	    }
	  
	  @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	       
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	       
	    }

	    @Then("^Ckeck if the browser is started$")
	    public void ckeck_if_the_browser_is_started() throws Throwable {
	       
	    }

	  @When("^user login into application \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_something_and_something(String strArg1, String strArg2) {
		  System.out.println(strArg1);
		  System.out.println(strArg2);
	        
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() {
	    	 //Code to verify
	    	System.out.println("Validate homepage");
	    }

	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) {
	    	System.out.println(strArg1);
	       
	    }

	    //How data caugh here
	    @When("^user sign up with follwoing details$")
	    public void user_sign_up_with_follwoing_details(DataTable data) throws Throwable {
	    	List<String> row = data.asList();
	    	System.out.println(row.get(0));
	       
	    }
	    
	    @When("^user login into application (.+) and (.+)$")
	    public void user_login_into_application_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
}
