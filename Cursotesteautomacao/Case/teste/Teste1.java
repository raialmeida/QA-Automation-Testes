package teste;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste1 {

	// Variaveis submenu
	private String Textoum = "HOME";
	private String Textodois = "SELENIUM";
	private String Textotreis = "ÚLTIMOS DESTAQUES"; 
	private String Textoquatro = "ABOUT";
	private WebDriver navegador;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"\\Users\\Raí Almeida\\eclipse-workspace\\Cursotesteautomacao\\target\\chromedriver.exe");

		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.get("https://classedetestes.wordpress.com");

	} 

	@Test
	public void Testeinfopagina() {

		// Verificar Texto submenu

		WebElement texto = navegador.findElement(By.id("menu-item-103"));
		String textonomenu = texto.getText();
		assertEquals(Textoum, textonomenu);

		WebElement texto2 = navegador.findElement(By.id("menu-item-6"));
		String textonomenu2 = texto2.getText();
		assertEquals(Textodois, textonomenu2);

		WebElement texto3 = navegador.findElement(By.id("menu-item-59"));
		String textonomenu3 = texto3.getText();
		assertEquals(Textotreis, textonomenu3);

		WebElement texto4 = navegador.findElement(By.id("menu-item-130"));
		String textonomenu4 = texto4.getText();
		assertEquals(Textoquatro, textonomenu4);
	}	
		@Test
		public void Addformulario() {
			
		// Navegar na pagina
		navegador.findElement(By.id("menu-item-6")).click();
		navegador.findElement(By.id("menu-item-51")).click();

		// Preencher formulario Simples

		// Nome
		navegador.findElement(By.id("g9-nome")).sendKeys("Raí Almeida");

		// Email
		navegador.findElement(By.id("g9-email")).sendKeys("raialmeida_@hotmail.com");

		// Website
		navegador.findElement(By.id("g9-website")).sendKeys("https://classedetestes.wordpress.com");

		// comentario
		navegador.findElement(By.id("contact-form-comment-g9-comentrio")).sendKeys("Analista de Testes");

		// clicar no butão para enviar formulario
		navegador.findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/form/p/button")).click();

		// Verificar texto se enviou o formulario
		WebElement textodoformulario = navegador.findElement(By.xpath("/html/body/div[2]/main/article/div/div[1]/h3"));
		String textdeenvio = textodoformulario.getText();
		assertEquals("A mensagem foi enviada (voltar)",textdeenvio);
   
	} 
	
	@After
	public void tearDown() {

		navegador.quit();
	}

}
