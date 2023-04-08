package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.common;

public class signUpPageStepDefinition {
	
	String signInContent;
	common Common;
	
	
	public signUpPageStepDefinition(common Common)
	{ 
	  this.Common = Common;
	}

	  @Then("^Click on Sign up link and land to sign up page$")
	  public void click_on_sign_up_link_and_land_to_sign_up_page() throws Throwable 
	  {
		  Common.driver.findElement(By.xpath("(//a[@class='sign-up-link hide-in-os-page'])[1]")).click();
		  Thread.sleep(3000);
		  System.out.println("Clicked on sign up and now, it is at landing page");
	  }

	    @And("^Fetch sign in content from sign up page$")
	    public void fetch_sign_in_content_from_sign_up_page() throws Throwable 
	    {
	    	WebElement signIn =Common.driver.findElement(By.xpath("(//a[text()='Sign in'])[1]"));
	    	signInContent = signIn.getText();
	    	System.out.println(signInContent);
	    }
	    
	    @And("^Match actual content and expected sign in content$")
	    public void match_actual_content_and_expected_sign_in_content() throws Throwable {
	       
	    Assert.assertEquals(signInContent, Common.SignIn);	
	    System.out.println("Matched");
	    }
	 
}
