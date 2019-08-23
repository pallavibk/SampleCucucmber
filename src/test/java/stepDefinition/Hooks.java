package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks {
	@Given("^first step$")
	public void first_step() throws Throwable {
	    
	    System.out.println("first");
	}

	@When("^second step$")
	public void second_step() throws Throwable {
	    
		System.out.println("second");  
	}

	@Then("^third step$")
	public void third_step() throws Throwable {
	    
		System.out.println("Third"); 
	}
	
	
	@Given("^fourth step$")
	public void fourth_step() throws Throwable {
		System.out.println("4"); 
	}

	@When("^fifth step$")
	public void fifth_step() throws Throwable {
		System.out.println("5"); 
	}

	@Then("^sixth step$")
	public void sixth_step() throws Throwable {
		System.out.println("6"); 
	}
@Before
public void beforehook()
{
	System.out.println("I am before hook");
}
@After
public void Afterhook()
{
	System.out.println("I am After hook");
}
}
