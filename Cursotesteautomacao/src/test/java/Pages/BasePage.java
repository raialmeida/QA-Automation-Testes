package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
   public String TextoGravar() {
	return driver.findElement(By.id("toast-container")).getText();
	   
	   
   }
}
