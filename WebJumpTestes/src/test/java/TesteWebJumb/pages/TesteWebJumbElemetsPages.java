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

	@FindBy(id = "page-top")
	protected String pagina;

	@FindBy(id = "panel_size_one")
	protected String painel_1;

	@FindBy(id = "panel panel-default")
	protected String painel_2;

	@FindBy(id = "panel_body_one")
	protected WebElement painel_3;

	@FindBy(id = "btn_one")
	protected String btn ;

	@FindBy(id = "btn_two")
	protected String btn_two;

	@FindBy(id = "btn_link")
	protected String btn_link;

}
