package StepDef;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CuistomerCreationStep {
	
	@Before("@Second")
	public void setUp() {
		System.out.println("beforeclass1");
	}

	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("open browser");
	}

	@Then("^Enter Url$")
	public void enter_Url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("enter url");
	}

	@Then("^Enter username$")
	public void enter_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("enter username");
	}

	@Then("^Enter password$")
	public void enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("enter password");
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("click on login button");
	}

	@Then("^verify the customer should be sucessfully login\\.$")
	public void verify_the_customer_should_be_sucessfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("verify the customer should be sucessfully login");
	}
}
