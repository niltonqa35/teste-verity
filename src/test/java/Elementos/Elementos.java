package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnContato = By.id("comp-kevyodnk5label");
	private By campoNome = By.id("input_comp-kwz6tqej");
	private By campoEmail = By.id("input_comp-kwz6tqf7");
	private By campoTelefone = By.id("input_comp-kwz6tqfe");
	private By campoDesafio = By.id("textarea_comp-kwz6tqfr");
	private By checkboxAceito = By.id("comp-kwz6tqgp");
	private By btnEnviar = By.id("comp-kwz6tqhd");
	private By btnVerity = By.id("img_comp-kevyodng");
	private By textoNossasSolucoes = By.xpath("//*[@id=\"comp-kwv1yx4h\"]/h1/span");
	private By textoCultureAndTech = By.xpath("//*[@id=\"comp-kwv1yb5l\"]/p/span/span/span/span/span/span");
	private By msg = By.cssSelector("#comp-lfhfnha7 > div > svg > g > path:nth-child(1)");
	

	public By getBtnContato() {
		return btnContato;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoDesafio() {
		return campoDesafio;
	}
	public By getCheckboxAceito() {
		return checkboxAceito;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
	public By getBtnVerity() {
		return btnVerity;
	}

	public By getTextoCultureAndTech() {
		return textoCultureAndTech;
	}

	public By getMsg() {
		return msg;
	}


	public By getTextoNossasSolucoes() {
		return textoNossasSolucoes;
	}
	
}
