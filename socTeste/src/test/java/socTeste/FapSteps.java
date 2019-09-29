package socTeste;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class FapSteps {
	@Given ("Eu preciso acessar a pagina Recursos > FAP")
	public void acessarFap() {
		FapPage fapPage = new FapPage();
		fapPage.acessarFap();
	}
	
    @When ("Informar os campos obrigatorios")
    public void informarDados() {
		FapPage fapPage = new FapPage();
		fapPage.informarDadosObrigatorios();
    	
    }
    
    @Then ("Clicar no botão Estimar FAP")
    public void estimarFap() {
		FapPage fapPage = new FapPage();
		fapPage.estimarFap();
    	
    }

	@And("Visualizar o resultado da estimativa FAP")
    public void visualizarResultado() {
		FapPage fapPage = new FapPage();
		fapPage.visualizarResultado();
    	
    }
}