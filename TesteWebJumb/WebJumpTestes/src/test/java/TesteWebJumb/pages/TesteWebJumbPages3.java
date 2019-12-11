package TesteWebJumb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteWebJumbPages3 extends TesteWebJumbPagesBase {

	public TesteWebJumbPages3(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void digitarCampoYourFirstName(WebDriver driver) {

		driver.findElement(By.id("first_name")).sendKeys("Raí Almeida");

	}

	public void clicarBotaoOne(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_one")));
		driver.findElement(By.id("btn_one")).click();
	}

	public void selectBox(WebDriver driver) {
		WebElement campotype = driver.findElement(By.id("select_box"));
		new Select(campotype).selectByVisibleText("ExampleTwo");
		
	}

	public void verificarlogoImagem(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("imagem")));
		
	}

}
