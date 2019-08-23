package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutline_Hooks {
	
	@Given("^fisrt scenario$")
	public void fisrt_scenario() throws Throwable {
	    
		System.out.println("11");
	}

	@When("^second scenario$")
	public void second_scenario() throws Throwable {
	    
		 System.out.println("22");
	}

	@Then("^third scenario$")
	public void third_scenario() throws Throwable {
	    
	   System.out.println("33");
	}


}
