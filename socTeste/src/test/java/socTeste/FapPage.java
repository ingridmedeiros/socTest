package socTeste;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FapPage extends FapElementMap {

	public FapPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarFap() {
		Actions actions = new Actions(TestRule.getDriver());
		actions.moveToElement(menuRecurso).moveToElement(subMenuFap).click().build().perform();
	}

	public void informarDadosObrigatorios() {
		nmEmpresa.sendKeys("Cat Cons");
		numFap.sendKeys("2");
		numProjecao.sendKeys("100.000,00");
		
		btnRat.click();
		
	}

	public void estimarFap() {
		btnEstimar.click();
	}

	public void visualizarResultado() {

	}
}