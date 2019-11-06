package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarContato extends BasePage{

	public AdicionarContato(WebDriver driver) {
		super(driver);
		
	}
      public AdicionarContato ClicarNaAbaMoreData() {
    	  driver.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
    	  return this;
      }
      
      public PopUp ClicarNoBotaoAddMoreData() {
    	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/button")).click();
    	  return new PopUp (driver);
      }
}
