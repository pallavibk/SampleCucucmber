package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParametrisingUsingDataTables {

	@Given("^On Home Page$")
	public void on_Home_Page() throws Throwable {
	    System.out.println("On Home Page");
	}

	@When("^User Navigate to Login screen$")
	public void user_Navigate_to_Login_screen() throws Throwable {
		System.out.println("User Navigate to Login screen");
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials(DataTable usercredentials) throws Throwable {
	 
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Programs\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
			 
			 //Write the code to handle Data Table
			 List<List<String>> data = usercredentials.raw();
			 
			 //This is to get the first data of the set (First Row + First Column)
			 driver.findElement(By.name("userName")).sendKeys(data.get(0).get(0)); 
			 
			 //This is to get the first data of the set (First Row + Second Column)
			     driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
			 
			     driver.findElement(By.name("login")).click();
			 }
		
	

	@Then("^Login Message displayed Successfully$")
	public void login_Message_displayed_Successfully() throws Throwable {
		System.out.println("Login Message displayed Successfully");
	}


	
	
	
}
