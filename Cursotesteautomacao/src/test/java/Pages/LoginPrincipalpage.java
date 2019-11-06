package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPrincipalpage extends BasePage {

	public LoginPrincipalpage(WebDriver navegador) {
		super(navegador);
		
	
	}

	public LoginPrincipalpage DigitarLogin(String login) {
		navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
		return this;
	}

	public LoginPrincipalpage DigitarSenha(String Senha) {
		navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(Senha);
		return this; 
	}

	public TelaPrincipal ClicarSignIn() {
		navegador.findElement(By.linkText("SIGN IN")).click();
		return new TelaPrincipal(navegador);
	}
	public TelaPrincipal FazerLogin(String login, String Senha) {
		DigitarLogin(login);
		DigitarSenha(Senha);
		ClicarSignIn();
		//navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
		//navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(Senha);
		//navegador.findElement(By.linkText("SIGN IN")).click();
		
		return new TelaPrincipal(navegador);
}
}