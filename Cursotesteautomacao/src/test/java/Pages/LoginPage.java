package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


	public LoginPage(WebDriver navegador) {
		super(navegador);
		
	}

	public LoginPrincipalpage ClickSignin() {
		navegador.findElement(By.linkText("Sign in")).click();

		return new LoginPrincipalpage(navegador);
	}

}
