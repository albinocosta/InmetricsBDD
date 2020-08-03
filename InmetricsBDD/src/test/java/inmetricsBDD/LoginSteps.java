package inmetricsBDD;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	@Given ("I access database login page")
	public void accessloginpage() {
		
	}
    @When ("I sumbmit my credentials")
    public void sendlogincredentials() {
    	LoginPage loginPage = new LoginPage();
		loginPage.sendlogincredentials();
    	
    }
    @And ("I confirm sending the credentials")
    public void confirmsending() {
    	LoginPage loginPage = new LoginPage();
		loginPage.comfirmsending();
    	
    }
    @Then ("employee webpage is loaded")
    public void employeewebpageloaded() {
    	
    }
	
}