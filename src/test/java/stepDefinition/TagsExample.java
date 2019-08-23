package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsExample {

	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
		System.out.println("Open Browser");

	}

	@When("^Enter valid credentials$")
	public void enter_valid_credentials() throws Throwable {
		System.out.println("eEnter valid credentials");

	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {

		System.out.println("User should be able to login");
	}

	@Given("^User logged in$")
	public void user_logged_in() throws Throwable {
		System.out.println("User logged in");

	}
	@Then("^test pallavi$")
	public void test_pallavi() throws Throwable {
	    System.out.println("test pallavi");
	}
	@When("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {

		System.out.println("user is on home page ");
	}

	@When("^click on signout link$")
	public void click_on_signout_link() throws Throwable {

		System.out.println("click on signout link");
	}

	@When("^User is logged in$")
	public void user_is_logged_in() throws Throwable {
		System.out.println("User is logged in");

	}

	@Then("^selected the items to cart$")
	public void selected_the_items_to_cart() throws Throwable {
		System.out.println("selected the items to cart");

	}

	@Then("^user clicked on cart link$")
	public void user_clicked_on_cart_link() throws Throwable {
		System.out.println("user clicked on cart link");

	}

	@Then("^User should be able to add items to cart$")
	public void user_should_be_able_to_add_items_to_cart() throws Throwable {
		System.out.println("User should be able to add items to cart");

	}

	@Given("^On sinout$")
	public void on_sinout() throws Throwable {
		System.out.println("On sinout");
}
}
