package StepDef;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {
	
	
	
	@Before("@first")
	public void setUp() {
		System.out.println("beforeclass");
	}
	
	
	@Given("^User navigate facebook Website$")
	public void user_navigate_facebook_Website()  {
	    System.out.println("Test1");
	}

	@Then("^User navigate facebook title$")
	public void user_navigate_facebook_title()  {
		System.out.println("Test2");
	}

	@Then("^User enter username$")
	public void user_enter_username()  {
		System.out.println("Test3");
	}

	@Then("^User enter password$")
	public void user_enter_password()  {
		System.out.println("Test4");
	}
	@Then("^User should be login sucessfully$")
	public void user_should_be_login_sucessfully() {
		System.out.println("Test5");
	}
	
	
	
//	@Given("^User navigate Gmail Website$")
//	public void user_navigate_Gmail_Website() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Test1");
//	}
//
//	@Then("^User navigate Gmail title$")
//	public void user_navigate_Gmail_title() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	}
//	@Then("^User enter invalid username$")
//	public void user_enter_invalid_username() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Test2");
//	}
//
//	@Then("^User enter invalid password$")
//	public void user_enter_invalid_password() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Test3");
//	}
//	
//	@Then("^User should not be login sucessfully$")
//	public void user_should_not_be_login_sucessfully() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Test4");
//	}
}
