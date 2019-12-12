package TesteWebJump.steps;

import org.openqa.selenium.WebDriver;

import Suporte.Browser;
import Suporte.screenshot;
import TesteWebJumb.pages.TesteWebJumbPages2;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TesteWebJumbStepsIframeButtons {

	protected WebDriver driver;

	TesteWebJumbPages2 TesteWebJumbPages2 = new TesteWebJumbPages2(driver);
	screenshot print = new screenshot();
	@Given("^que eu acesse o Iframe$")
	public void queEuAcesseOIframe() throws Throwable {
		driver = Browser.Iniciadriver();

	}

	@Given("^no painel iframe buttons Buttons e exibido os botoes 'One', 'Two', e 'Four'$")
	public void noPainelIframeButtonsButtonsEExibidoOsBotoesOneTwoEFour() throws Throwable {
		//driver.switchTo().frame(1);
		TesteWebJumbPages2.verificarbotaoNoPaineIFrameButton(driver);

	}

	@When("^clicar no botao 'One', 'Two', e 'Four'do painel IFRAME BUTTONS$")
	public void clicarNoBotaoOneTwoEFourDoPainelIFRAMEBUTTONS() throws Throwable {
		TesteWebJumbPages2.clicarBotaoNoPaineIFrameButtons(driver);

	}

	@Then("^verificar se os botoes ainda estao na tela do painel IFRAME BUTTONS$")
	public void verificarSeOsBotoesAindaEstaoNaTelaDoPainelIFRAMEBUTTONS() throws Throwable {
		TesteWebJumbPages2.verificarAusenciaBotaoIFrameButtons(driver);
		print.Print("Screenshot Cenário 2");
	}

	@Then("^Fecha Chrome$")
	public void fechaChrome() throws Throwable {
		driver.quit();
	}
}
