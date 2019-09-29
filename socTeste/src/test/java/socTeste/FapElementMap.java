package socTeste;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FapElementMap {
	/* Menu */
	@FindBy(css = "#menu-item-12080 a")
	protected WebElement menuRecurso;
	
	@FindBy(css = ".sub-menu #menu-item-12356 a")
	protected WebElement subMenuFap;
	
	/* Formulario */
	@FindBy(name = "nomeEmpresa")
	protected WebElement nmEmpresa;
	
	@FindBy(name = "fap")
	protected WebElement numFap;
	
	@FindBy(css = ".selectric .button")
	protected WebElement btnRat;
	
	@FindBy(css = ".selectric-scroll ul li")
	protected String numRat;
		
	@FindBy(name = "projecao")
	protected WebElement numProjecao;
	
	@FindBy(id = "estimar")
	protected WebElement btnEstimar;

}