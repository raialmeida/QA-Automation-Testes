package Testeautomacao;

import static org.junit.Assert.assertEquals;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Suporte.Gerator;
import Suporte.Navegador;
import Suporte.Screenshot;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "IncluirContato.csv") 
public class Login {

	public WebDriver navegador;
	private String Textobutao = "MORE DATA ABOUT YOU";
	@Rule
	public TestName nomemetodo = new TestName();
	
	@Before 
	public void testLogin() { 
     
		navegador = Navegador.IniciaNavegador();
		
		// Logar no site
		navegador.findElement(By.linkText("Sign in")).click();

		navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("Raí");
		navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("123456");

		navegador.findElement(By.linkText("SIGN IN")).click();

		// Verificar saudação
		String saudacao = navegador.findElement(By.className("me")).getText(); 
		assertEquals("Hi, Raí Almeida", saudacao);
		// Tirar foto apos a verificação da saudação
		
/**
		Screenshot.takeScreenshot(navegador,
				"C:\\Users\\Raí Almeida\\eclipse-workspace\\Cursotesteautomacao\\Evidencia\\"
						+ nomemetodo.getMethodName() + Gerator.dataHoraParaArquivo());
*/
	}
	@Test
	public void AdicionarContato(@Param(name="Tipo")String tipo, @Param(name ="Contato")String Contato, @Param(name ="Mensagem")String mensagemesperada) {

		// Clicar no perfil para adicionar o contato
		navegador.findElement(By.linkText("Hi, Raí Almeida")).click();
		// clicar no MORE DATA ABOUT YOU para adicionar contato
		navegador.findElement(By.linkText(Textobutao)).click();
		// Clicar no botão para adicionar contato atraves do x-path
		// /html/body/div[1]/div/div/div/div[4]/div[2]/button
		navegador.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/button")).click();
		// Identificar popup
		WebElement popup = navegador.findElement(By.id("addmoredata"));
		// Selecionar o tipo de contato 
		WebElement campotype = popup.findElement(By.name("type"));
		new Select(campotype).selectByVisibleText(tipo);
		// Digitar o contato
		popup.findElement(By.name("contact")).sendKeys(Contato);
		// Clicar no botao SAVE
		popup.findElement(By.linkText("SAVE")).click();
		// Verificar a mensagem de texto apos o salve Your contact has been added!

		WebElement mensagempop = navegador.findElement(By.id("toast-container"));
		String mensagem = mensagempop.getText();
		assertEquals(mensagemesperada, mensagem); 

		// Tirar foto apos a verificação do texto
		Screenshot.takeScreenshot(navegador,"D:\\Cursotesteautomacao\\Evidencia\\"
						+ nomemetodo.getMethodName() + Gerator.dataHoraParaArquivo());
		// Aguardar 10 segundos para mesageme desparecer
		WebDriverWait aguardar = new WebDriverWait(navegador, 10);
		aguardar.until(ExpectedConditions.stalenessOf(mensagempop));
		
	
	}
	@Test
	public void Excluircontato() {
		
		// Excluir o contato informado na passo anterior pelo Xpath
		// ////span[text()='0194596566']/following-sibling::a
		navegador.findElement(By.xpath("//span[text()='0194596566']/following-sibling::a")).click();
		// confirmar na janela java scrip
		navegador.switchTo().alert().accept(); 
		// validar se mensagem foi apresentado Do you really want to remove this phone?
		WebElement mensagemjanela = navegador.findElement(By.id("toast-container"));
		String mensagem = mensagemjanela.getText();
		assertEquals("Rest in peace, dear phone!", mensagem);
		// Tirar foto apos deletar
		Screenshot.takeScreenshot(navegador,"D:\\Cursotesteautomacao\\Evidencia\\"
						+ nomemetodo.getMethodName() + Gerator.dataHoraParaArquivo());
		// Aguardar 10 segundos
		WebDriverWait aguardar = new WebDriverWait(navegador, 10);
		aguardar.until(ExpectedConditions.stalenessOf(mensagemjanela));
		// Fazer logout clicar no link Logout
		navegador.findElement(By.linkText("Logout")).click();
       
	}
	
	@After
	public void FecharNavegador() {
		navegador.quit();
	
	
	}
}

