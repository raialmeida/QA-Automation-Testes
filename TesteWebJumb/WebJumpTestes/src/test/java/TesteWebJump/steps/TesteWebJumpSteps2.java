package TesteWebJump.steps;

import org.openqa.selenium.WebDriver;

import Suporte.Browser;
import Suporte.screenshot;
import TesteWebJumb.pages.TesteWebJumbPages3;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TesteWebJumpSteps2 {

	protected WebDriver driver;
	
	TesteWebJumbPages3 TesteWebJumbPages2 = new TesteWebJumbPages3(driver);
	screenshot print = new screenshot();
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
		TesteWebJumbPages2.digitarCampoYourFirstName(driver);  
		print.Print("Digitar no campo YourFirstName o Texto");

	}

	@When("^clicar no botao One$")
	public void clicarNoBotao() throws Throwable {
		TesteWebJumbPages2.clicarBotaoOne(driver);

	}

	@When("^cheque a opcao OptionThree$")
	public void chequeAOpcao() throws Throwable {
		TesteWebJumbPages2.chequeAopcaoOptionThree(driver);

	} 

	@And("^selecione a opcao ExampleTwo dentro da select box$")
	public void selecioneAOpcaoDentroDaSelectBox() throws Throwable {
		TesteWebJumbPages2.selectBoxExampleTwo(driver);

	}

	@Then("^validar a presenca da imagem do logo do Selenium Webdriver$")
	public void validarAPresenADaImagemDoLogoDoSeleniumWebdriver() throws Throwable {
		TesteWebJumbPages2.verificarlogoImagem(driver);

	}
	@Then("^Fecha Browser$")
	public void fechaBrowser() throws Throwable {
	    driver.quit();
	}
}
