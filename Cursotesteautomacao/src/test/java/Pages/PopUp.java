package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PopUp extends BasePage {

	public PopUp(WebDriver navegador) {
		super(navegador);

	}

	public PopUp SelectTipo(String tipo) {

		WebElement campotype = navegador.findElement(By.id("addmoredata")).findElement(By.name("type"));
		new Select(campotype).selectByVisibleText(tipo);

		return this;
	}

	public PopUp DigitarConatato(String contato) {
		
		navegador.findElement(By.id("addmoredata")).findElement(By.name("contact")).sendKeys(contato);
		return this;
	}

	public AdicionarContato ClicarEmSalvar() {
		
		navegador.findElement(By.id("addmoredata")).findElement(By.linkText("SAVE")).click();
		
		return new AdicionarContato(navegador);
	}

	public PopUp AddContato(String tipo, String contato) {

		SelectTipo(tipo);
		DigitarConatato(contato);
		ClicarEmSalvar();

		return new PopUp(navegador);
	}
}
