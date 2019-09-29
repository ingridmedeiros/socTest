package socTeste;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class BuscaSteps {
	@Given("Eu preciso acessar o blog do site")
	public void acessarBlog() {
		BuscaPage buscapage = new BuscaPage();
		buscapage.acessarBlog();
	}

	@When("Informar o termo a ser buscado")
	public void informarTermoBusca() {
		BuscaPage buscapage = new BuscaPage();
		buscapage.informarTermoBusca();
		Utils.logPrint("Termo a ser buscado");
	}

	@Then("Finalizar a busca")
	public void finalizarBusca() {
		BuscaPage buscapage = new BuscaPage();
		buscapage.finalizarBusca();
	}
	
	@Then("Apresentar o resultado da pesquisa")
	public void resultadoBusca() {
		BuscaPage buscapage = new BuscaPage();
		buscapage.resultadoBusca();
		Utils.logPrint("Resultado da Busca");
	}
}
