package TesteWebJump.steps;

import org.openqa.selenium.WebDriver;

import Suporte.Browser;
import TesteWebJumb.pages.TesteWebJumbPages3;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TesteWebJumpSteps2 {

	protected WebDriver driver;
	TesteWebJumbPages3 TesteWebJumbPages = new TesteWebJumbPages3(driver);

	/*
	 * terceiro cenario
	 * 
	 */

	@Given("^Que acesse a pagina https://webjump-user\\.github\\.io/testqa$")
	public void queAcesseAPaginaHttpsWebjumpUserGithubIoTestqa() throws Throwable {

		driver = Browser.Iniciadriver();
	}

	@When("^digita no campo YourFirstName com o texto$")
	public void digitaNoCampoYourFirstNameComOTexto() throws Throwable {
		TesteWebJumbPages.digitarCampoYourFirstName(driver);
	}

	@When("^clicar no botao One$")
	public void clicarNoBotao() throws Throwable {
		TesteWebJumbPages.clicarBotaoOne(driver);

	}

	@When("^cheque a opcao OptionThree$")
	public void chequeAOpcao() throws Throwable {

	}

	@When("^selecione a opcao ExampleTwo dentro da select box$")
	public void selecioneAOpcaoDentroDaSelectBox() throws Throwable {
		TesteWebJumbPages.selectBox(driver);

	}

	@Then("^validar a presenca da imagem do logo do Selenium Webdriver$")
	public void validarAPresenADaImagemDoLogoDoSeleniumWebdriver() throws Throwable {
		TesteWebJumbPages.verificarlogoImagem(driver);

	}

}
