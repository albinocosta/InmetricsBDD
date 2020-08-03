package inmetricsBDD;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewUserSteps {

	@Given("I access new user creation page")
	public void accessnewuserpage() {
		LoginPage loginPage = new LoginPage();
		loginPage.accessnewuserpage();

	}

	@When("I fill in fields for new user")
	public void fillinfields() {
		NewUserPage newuserPage = new NewUserPage();
		newuserPage.fillinfields();

	}

	@And("confirm creation")
	public void confirmcreation() {
		NewUserPage newuserPage = new NewUserPage();
		newuserPage.confirmcreation();

	}

	@Then("an new user is created")
	public void checkcreation() {

	}
}