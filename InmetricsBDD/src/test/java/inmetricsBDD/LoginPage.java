package inmetricsBDD;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginElementMap{
	
	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void accessnewuserpage() {
		SignUp.click();
	}
	
	public void sendlogincredentials() {
		Usuario.sendKeys("fakeuser");
		Senha.sendKeys("fakepassword");	
	}
	
	public void comfirmsending() {
		Entrar.click();
	}
}