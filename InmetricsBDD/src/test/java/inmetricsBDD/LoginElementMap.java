package inmetricsBDD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {
	
	@FindBy (linkText = "Cadastre-se")
	protected WebElement SignUp;
	
	@FindBy (name = "username")
	protected WebElement Usuario;
	
	@FindBy (name = "pass")
	protected WebElement Senha;
	
	@FindBy (className = "login100-form-btn")
	protected WebElement Entrar;
}