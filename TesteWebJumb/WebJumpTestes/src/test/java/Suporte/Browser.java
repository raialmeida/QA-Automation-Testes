package Suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	private static ChromeDriver driver;

	public static WebDriver Iniciadriver() {

		// Abrindo o ChromeDriver
		System.setProperty("webdriver.chrome.driver", "target\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  
		// Navegando para o site
		driver.get("https://webjump-user.github.io/testqa/");
		return driver;
	}
}
