package TesteWebJumb.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TesteWebJumbPages extends TesteWebJumbElemetsPages {

	public TesteWebJumbPages(WebDriver driver) {
		super(driver);

	}

	public void verificarbotaoNaTela(WebDriver driver) {

		driver.findElement(By.id("btn_link")).isEnabled();
		driver.findElement(By.id("btn_two")).isDisplayed();
		driver.findElement(By.id("btn_one")).isDisplayed();

	}

	public void clicarbotao(WebDriver driver) {
		driver.findElement(By.id("btn_link")).click();
		driver.findElement(By.id("btn_two")).click();
		driver.findElement(By.id("btn_one")).click();
	}

	public void verificarAusencia(WebDriver driver) {
		
		driver.findElement(By.id("btn_link")).isEnabled();
		driver.findElement(By.id("btn_two")).isEnabled();
		driver.findElement(By.id("btn_one")).isEnabled();
	}

	}


