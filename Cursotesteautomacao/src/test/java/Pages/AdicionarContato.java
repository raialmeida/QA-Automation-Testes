package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarContato extends BasePage{

	public AdicionarContato(WebDriver navegador) {
		super(navegador);
		
	}
      public AdicionarContato ClicarNaAbaMoreData() {
    	  navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
    	  return this;
      }
      
      public PopUp ClicarNoBotaoAddMoreData() {
    	  navegador.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/button")).click();
    	  return new PopUp (navegador);
      }
}
