package socTeste;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscaElementMap {

	@FindBy(css = "[href='/blog']")
	protected WebElement menuBlog;

	@FindBy(name = "s")
	protected WebElement txtBusca;

}
