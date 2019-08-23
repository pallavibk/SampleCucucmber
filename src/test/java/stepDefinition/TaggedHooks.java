package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooks {

	@Before("@smokeTest")
	public void beforehook()
	{
		System.out.println("I am Before Tagged hook for \"@smokeTest\" tag ");
	}
	@After("@smokeTest")
	public void Afterhook()
	{
		System.out.println("I am After Tagged hook for \"@smokeTest\" tag");
	}
	
	@Before("@smokeTest,@Regression")
	public void b4Hook()
	{
		System.out.println("I am Before Tagged hook for \"@Regression\" tag ");
	}
	@After("@smokeTest,@Regression")
	public void AfttHook()
	{
		System.out.println("I am After Tagged hook for \"@Regression\" tag");
	}
	
	
	@Given("^First test$")
	public void first_test() throws Throwable {
	    
	   System.out.println("First test"); 
	}

	@When("^second test$")
	public void second_test() throws Throwable {
		System.out.println("Second test"); 
	    
	}

	@Then("^Third test$")
	public void third_test() throws Throwable {
	    
		System.out.println("Third test");   
	}

	@Given("^Fourth test$")
	public void fourth_test() throws Throwable {
		System.out.println("Fourth test");  
	    
	}

	@When("^Fifth test$")
	public void fifth_test() throws Throwable {
	    
		System.out.println("Fifth test"); 
	}

	@When("^Sixth test$")
	public void sixth_test() throws Throwable {
		System.out.println("Sixth test"); 
	    
	}


@Given("^seventh test$")
public void seventh_test() throws Throwable {
	System.out.println("Sixth test");  
    
}

@When("^eighth test$")
public void eighth_test() throws Throwable {
	System.out.println("eighth test");   
    
}

@Then("^Ninth test$")
public void ninth_test() throws Throwable {
	System.out.println("Ninth test");  
    
}

@Given("^thenth test$")
public void thenth_test() throws Throwable {
    
	System.out.println("thenth test"); 
}

@When("^eleventh test$")
public void eleventh_test() throws Throwable {
	System.out.println("eleventh test"); 
    
}

@Then("^Telve test$")
public void telve_test() throws Throwable {
	System.out.println(" Telve test"); 
    
}
@Before(order=1)
public void orderb4hook()
{
	System.out.println("I am Before Tagged hook for 1st ");
}
@After(order=1)
public void orderaftrhook()
{
	System.out.println("I am After Tagged hook for 1st");
}


	
}
