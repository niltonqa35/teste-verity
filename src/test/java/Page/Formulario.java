package Page;

import Elementos.Elementos;
import Metodos.Metodos;

public class Formulario extends Metodos {
		Elementos e = new Elementos();
			
			public void preencherFormulario() {
				preencher(e.getCampoNome(), "Nilton Barbosa de Amorim");
				preencher(e.getCampoEmail(), "niltonbarbosa4648amorim@gmail.com");
				preencher(e.getCampoTelefone(), "75982247783");
			    preencher(e.getCampoDesafio(), "Garantir a qualidade do software e a satisfação do usuário final!");
			
			}
			

		}


