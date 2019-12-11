package TesteWebJumb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteWebJumbPages2 extends TesteWebJumbPages {

	public TesteWebJumbPages2(WebDriver driver) {
		super(driver);

	}

	/*
	 * 
	 * Segundo cenario
	 */
	public void verificarbotaoNoPaineIFrameButton(WebDriver driver) {

	   driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[contains(@src,'buttons.html')])[1]")));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_one")));
 
	}

	public void clicarBotaoNoPaineIFrameButtons(WebDriver driver) {

		driver.findElement(By.id("btn_one")).click();
		driver.findElement(By.id("btn_link")).click();
		driver.findElement(By.id("btn_two")).click();

	}

	public void verificarAusenciaBotaoIFrameButtons(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn_one")));
		driver.switchTo().defaultContent();

	}

}
