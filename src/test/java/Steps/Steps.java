package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import Page.Formulario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Formulario {
    Metodos m = new Metodos ();
	Elementos e = new Elementos ();
	
	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
	abrirNavegador(url);
	}
	
	@When("selecionar a aba Verity")
	public void selecionar_a_aba_verity() throws InterruptedException {
	clicar(e.getBtnVerity());
	pausa(3000);
	clicar(e.getMsg());    
	}
	@When("valido a mensagem culture and tech")
	public void valido_a_mensagem_culture_and_tech() throws InterruptedException {
	 pausa(3000);
	  validarTitulo(e.getTextoCultureAndTech(), "Design, Culture and Tech for solving complex problems");
	  fecharNavegador(); 
	  
	}
	@Then("valido a mensagem Nossas solucoes")
	public void valido_a_mensagem_nossas_solucoes() throws InterruptedException {
    pausa(3000);
	validarTitulo(e.getTextoNossasSolucoes(), "Nossas soluções_");	
	fecharNavegador(); 
	}


	@Given("selecionar a aba Contato")
	public void selecionar_a_aba_contato() {
	clicar(e.getBtnContato());
	   
	}
	@When("preencher o formulario Vamos conversar")
	public void preencher_o_formulario_vamos_conversar() throws InterruptedException {
	 pausa(3000);
	preencherFormulario();	
	}
	@When("selecionar o checkbox Aceito receber mensagens da Verity")
	public void selecionar_o_checkbox_aceito_receber_mensagens_da_verity() {
	clicar(e.getCheckboxAceito());
	    
	}
	@Then("clicar no botao enviar")
	public void clicar_no_botao_enviar() {
		clicar(e.getBtnEnviar());
		fecharNavegador();
	}

	

	
}