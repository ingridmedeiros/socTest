package socTeste;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscaPage extends BuscaElementMap {

	public String termo = "Segurança do Trabalho";

	public BuscaPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarBlog() {
		menuBlog.click();
	}

	public void informarTermoBusca() {
		txtBusca.sendKeys(termo);
	}

	public void finalizarBusca() {
		txtBusca.submit();
	}

	public void resultadoBusca() {
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 60);
		WebElement resultado = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".content-articles")));
		assertNotNull(resultado);
		// Falta validar o retorno caso o teste falhe, ou seja, caso a classe content-articles
		// não seja encontrada na página
	}
}
