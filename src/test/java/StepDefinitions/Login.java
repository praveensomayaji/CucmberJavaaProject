package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("user is on login page")
	public void goToLoginPage() {
		System.out.println("Login page");
	}

	@When("user enters username and password")
	public void EnterCredentials() {
		System.out.println("EnterCredentials");
	}

	@When("clicks on login button")
	public void clickLogin() {
		System.out.println("clickLogin");
	}

	@Then("user is navigated to home page")
	public void verifyHomePage() {
		System.out.println("verifyHomePage");
	}

}
