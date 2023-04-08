package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class sign {
	
	  @Given("^User is into at login page$")
	  public void User_is_into_at_login_page() throws Throwable 
	  {

		  System.out.println("Clicked on sign up and now, it is at landing page");
	  }
	  
	  @When("^Fetch sign in$")
	  public void Fetch_sign_in() throws Throwable 
	  {

		  System.out.println("Fetch Page");
	  }

}
