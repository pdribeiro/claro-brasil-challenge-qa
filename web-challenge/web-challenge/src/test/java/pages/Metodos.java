package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site, String descricaoPasso) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("---------- Error ao clicar no elemento ----------" + e.getMessage());
			System.err.println("---------- Causa do erro ----------" + e.getCause());
		}
	}

	public void escrever(String texto, By elemento) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("---------- Error ao escrever ----------" + e.getMessage());
			System.err.println("---------- Causa do erro ----------" + e.getCause());
		}

	}

	public void Sleep() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.err.println("------- erro de Timeout -------- " + e.getMessage());
			System.err.println("---------- Causa do erro ----------" + e.getCause());
		}
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void validadeTexto(String textoEsperado, By elemento) {

		try {
			String texto = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, texto);
		} catch (Exception e) {
			System.err.println("------- erro de Timeout -------- " + e.getMessage());
			System.err.println("---------- Causa do erro ----------" + e.getCause());
		}
	}

	public void screnShot(String nome) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFIle = new File("./src/Evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFIle);

	}

}
