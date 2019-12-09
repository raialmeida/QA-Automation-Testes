package TesteWebJumb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TesteWebJumbElemetsPages {
    
	private WebDriver driver;

	public TesteWebJumbElemetsPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	

}
