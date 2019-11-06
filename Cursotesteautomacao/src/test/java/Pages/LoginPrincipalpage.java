package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPrincipalpage extends BasePage {

	public LoginPrincipalpage(WebDriver driver) {
		super(driver);
		
	
	}

	public LoginPrincipalpage DigitarLogin(String login) {
		driver.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
		return this;
	}

	public LoginPrincipalpage DigitarSenha(String Senha) {
		driver.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(Senha);
		return this; 
	}

	public TelaPrincipal ClicarSignIn() {
		driver.findElement(By.linkText("SIGN IN")).click();
		return new TelaPrincipal(driver);
	}
	public TelaPrincipal FazerLogin(String login, String Senha) {
		DigitarLogin(login);
		DigitarSenha(Senha);
		ClicarSignIn();
		//driver.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
		//driver.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(Senha);
		//driver.findElement(By.linkText("SIGN IN")).click();
		
		return new TelaPrincipal(driver);
}
}