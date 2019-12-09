package TesteWebJump.steps;

import org.openqa.selenium.WebDriver;

import Suporte.Browser;
import TesteWebJumb.pages.TesteWebJumbPages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TesteWebJumpSteps {

	
	protected WebDriver driver;

	TesteWebJumbPages TesteWebJumbPages = new TesteWebJumbPages(driver);

	@Given("^que eu acesse a pagina https://webjump-user\\.github\\.io/testqa/$")
	public void queEuAcesseAPaginaHttpsWebjumpUserGithubIoTestqa() throws Throwable {

		driver = Browser.Iniciadriver();
	}

	@When("^no painel Buttons e exibido os botoes 'One', 'Two', e 'Four'$")
	public void noPainelButtonsEExibidoOsBotoesOneTwoEFour() throws Throwable {
 
		TesteWebJumbPages.verificarbotaoNaTel(driver);  
	}

	@When("^clicar no botao 'One', 'Two', e 'Four'$")
	public void clicarNoBotaoOneTwoEFour1() throws Throwable {
		TesteWebJumbPages.clicarbotao(driver);
	}

	@Then("^verificar se os botoes ainda estao na tela$")
	public void verificarSeOsBotoesAindaEstaoNaTela() throws Throwable {
		TesteWebJumbPages.verificarAusencia(driver);
	}
	/*
	 * Segundo cenario
	 */
	
	@Given("^no painel iframe buttons Buttons e exibido os botoes 'One', 'Two', e 'Four'$")
	public void no_painel_iframe_buttons_Buttons_e_exibido_os_botoes_One_Two_e_Four() throws Throwable {
		TesteWebJumbPages.verificarbotaoNoPaineIFrameButtons(driver);
	}

	@When("^clicar no botao 'One', 'Two', e 'Four'do painel IFRAME BUTTONS$")
	public void clicar_no_botao_One_Two_e_Four_do_painel_IFRAME_BUTTONS() throws Throwable {
		TesteWebJumbPages.clicarBotaoNoPaineIFrameButtons(driver);
	}

	@Then("^verificar se os botoes ainda estao na tela do painel IFRAME BUTTONS$")
	public void verificar_se_os_botoes_ainda_estao_na_tela_do_painel_IFRAME_BUTTONS() throws Throwable {
		
		TesteWebJumbPages.verificarAusenciaBotaoIFrameButtons(driver);
	}

	
	
}



