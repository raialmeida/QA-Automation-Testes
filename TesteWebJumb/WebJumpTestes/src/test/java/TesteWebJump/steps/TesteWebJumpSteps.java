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
	@Then("^Fecha navegador$")
	public void fechaNavegador() throws Throwable {
	    this.driver.quit();
}
}
