package Suporte;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	/**
	 * public static void tirar(WebDriver navegador, String arquivo) {
	 * 
	 * File screenshot = ((TakesScreenshot)
	 * navegador).getScreenshotAs(OutputType.FILE);
	 * 
	 * try { FileUtils.copyFile(screenshot, new File(arquivo)); 
	 * } catch (Exception
	 * e) { System.out.println("Houve problema ao copiar o arquivo" +
	 * e.getMessage()); }
	 * 
	 * }
	 */
	public static void takeScreenshot(WebDriver navegador, String fileName) {
		File scrFile = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,
					new File(fileName +".jpeg"),
					true);  
		} catch (IOException e)
		{ System.out.println("Houve problema ao copiar o arquivo" + e.getMessage()); }
		} 
	}
