package Pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaPrincipal extends BasePage {
 
	  public TelaPrincipal(WebDriver driver) {
		super(driver);
		
	}
	public TelaPrincipal TextoLogado() {
		String saudacao = driver.findElement(By.className("me")).getText(); 
		assertEquals("Hi, Raí Almeida", saudacao);
		return this;	
  }
	  public AdicionarContato ClicarLinkText() {
	  driver.findElement(By.className("me")).click();
	  return new AdicionarContato(driver);
	  
	  }
}
