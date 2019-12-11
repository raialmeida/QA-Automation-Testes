package TesteWebJumb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;

public class TesteWebJumbPages extends TesteWebJumbPagesBase {

	@FindBy(id = "first_name")
	private WebElement btn;

	@FindBy(id = "")
	private WebElement texto;

	@FindBy(id = "btn_two")
	protected String btn_two;

	@FindBy(id = "btn_link")
	protected String btn_link;

	public TesteWebJumbPages(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void verificarbotaoNaTel(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_one")));

	}

	public void clicarbotao(WebDriver driver) {

		driver.findElement(By.id("btn_one")).click();
		driver.findElement(By.id("btn_link")).click();
		driver.findElement(By.id("btn_two")).click();

	}

	public void verificarAusencia(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn_one")));

	}

}