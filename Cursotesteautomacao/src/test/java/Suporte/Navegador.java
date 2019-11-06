package Suporte;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navegador {

	public static final String USERNAME = "raalmeidaandrade1";
	public static final String AUTOMATE_KEY = "pu834ZxvhCzMCStw4q6F";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public static WebDriver IniciaNavegador() {

		// Abrindo o ChromeDriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Raí Almeida\\git\\Estudos-QA-Automation\\Cursotesteautomacao\\target\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navegando para o site
		navegador.get("http://www.juliodelima.com.br/taskit/");

		return navegador;
	}


	public static WebDriver cerateBrowserStack() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "77.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1920x1080");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
		//caps.setCapability("name", "Bstack-[Java] Sample Test"); 
	    
		WebDriver navegador = null;
		try {
			navegador = new RemoteWebDriver(new URL(URL), caps);
			navegador.manage().window().maximize();
			navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			navegador.get("http://www.juliodelima.com.br/taskit/");
		} catch (MalformedURLException e) {
			System.out.println("Houveram Problema com a URL" + e.getMessage());
		}

		return navegador;

	}
}


