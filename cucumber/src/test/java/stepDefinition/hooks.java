package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	
	  @Before("@sanity or @Regr") public void beforevalidated() {
	  System.out.println("Mobile before hook"); }
	  
	  @After("@sanity") public void aftervalidated() {
	  System.out.println("Mobile after hook"); }
	  
	  @Before("@Regr") public void beforecheck() {
	  System.out.println("Mobile before hook"); }
	  
	  @After("@Regr") public void aftercheck() {
	  System.out.println("Mobile after hook"); }
	 
}
