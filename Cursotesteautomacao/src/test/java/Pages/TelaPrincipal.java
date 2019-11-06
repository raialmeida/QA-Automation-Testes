package Pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaPrincipal extends BasePage {
 
	  public TelaPrincipal(WebDriver navegador) {
		super(navegador);
		
	}
	public TelaPrincipal TextoLogado() {
		String saudacao = navegador.findElement(By.className("me")).getText(); 
		assertEquals("Hi, Raí Almeida", saudacao);
		return this;	
  }
	  public AdicionarContato ClicarLinkText() {
	  navegador.findElement(By.className("me")).click();
	  return new AdicionarContato(navegador);
	  
	  }
}
