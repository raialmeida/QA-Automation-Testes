package Testeautomacao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import Suporte.Navegador;



public class TesteLoginPagesObjects {
	private WebDriver navegador;

	@Before
	public void testLogin() {

		//navegador = Navegador.cerateBrowserStack();
		navegador = Navegador.IniciaNavegador();
	}

	@Test
	public void Login(
			/**@Param (name ="login")String login, 
			@Param (name ="senha") String senha, 
			@Param (name ="MensagemGravar") String textomensagem*/) {
				
		String TextoGravar = new LoginPage(navegador)
		     .ClickSignin()
		     .FazerLogin("Raí", "123456")
		     .TextoLogado()
		     .ClicarLinkText()
		     .ClicarNaAbaMoreData()
		     .ClicarNoBotaoAddMoreData()
		     .SelectTipo("Phone")
		     .DigitarConatato("011946857033")
		      //.AddContato("Phone", "011946857033")
		     .ClicarEmSalvar() 
		     .TextoGravar(); 
		
		assertEquals("Your contact has been added!", TextoGravar); 
		
		 //Mudar o metodo para Login depois    
		      
	}

	@After
	public void FecharNavegador() {

		navegador.quit();

	}
}
