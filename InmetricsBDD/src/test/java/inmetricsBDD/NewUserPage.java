package inmetricsBDD;

import org.openqa.selenium.support.PageFactory;

public class NewUserPage extends NewUserElementMap{
	
	public NewUserPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void fillinfields() {		
		Usuario.sendKeys("fakeuser2");
		Senha.sendKeys("fakepassword");
		VerSenha.sendKeys("fakepassword");
	}
	
	public void confirmcreation() {
		Cadastrar.click();
		
	}
	
}