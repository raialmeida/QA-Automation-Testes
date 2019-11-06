package Suporte;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navegador {

	public static final String USERNAME = "XXXXXXXXXXX";
	public static final String AUTOMATE_KEY = "XXXXXXXXXXXXX";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	/**
	 * Iniciar driver
	 * @author Raí Almeida
	 */
	public static WebDriver Iniciadriver() {

		// Abrindo o ChromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navegando para o site
		driver.get("http://www.juliodelima.com.br/taskit/");

		return driver;
	}

/***
 * Método Para Rodar na nuvem
 * @author Raí Almeida
 */
	public static WebDriver cerateBrowserStack() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "77.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1920x1080");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
		//caps.setCapability("name", "Bstack-[Java] Sample Test"); 
	    
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL(URL), caps);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://www.juliodelima.com.br/taskit/");
		} catch (MalformedURLException e) {
			System.out.println("Houveram Problema com a URL" + e.getMessage());
		}

		return driver;

	} 
}


