package Testeautomacao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import Suporte.Navegador;



public class TesteLoginPagesObjects {
	private WebDriver driver;

	@Before
	public void SetUp () {

		
		driver = Navegador.Iniciadriver();
	}

	@Test
	public void testLogin() {
				
		//String TextoGravar = 
			new LoginPage(driver)
		     .ClickSignin()
		     .FazerLogin("Raí", "123456")
		     .TextoLogado()
		     /*
		     .ClicarLinkText()
		     .ClicarNaAbaMoreData()
		     .ClicarNoBotaoAddMoreData()
		     .SelectTipo("Phone")
		     .DigitarConatato("011946857033")
		      //.AddContato("Phone", "011946857033")
		     .ClicarEmSalvar() 
		     
		    // .TextoGravar(); 
		
		assertEquals("Your contact has been added!", TextoGravar); 
		*/
		   ;  
		      
	}

	@After
	public void TearDown() {

		driver.quit();

	}
}
