package inmetricsBDD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewUserElementMap{
	
	@FindBy (name = "username")
	protected WebElement Usuario;
	
	@FindBy (name = "pass")
	protected WebElement Senha;
	
	@FindBy (name= "confirmpass")
	protected WebElement VerSenha;
	
	@FindBy (className = "login100-form-btn")
	protected WebElement Cadastrar;
}