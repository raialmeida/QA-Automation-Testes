package Suporte;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	
	WebDriver driver = new ChromeDriver();
	static String pastascreenshot = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
	//Funções de Apoio
	
	public void Print(String nomePrint) throws IOException {
	File foto = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(foto, new File("target\\screenshot\\" + pastascreenshot + "\\" + nomePrint +".png"));	
}
}
