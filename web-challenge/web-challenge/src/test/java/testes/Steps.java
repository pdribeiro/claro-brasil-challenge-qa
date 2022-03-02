package testes;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {

		metodos.abrirNavegador(site, site);

		//CN01 Realizar cadastro
	}

	@When("Clicar em Signin")
	public void clicar_em_signin() {
		metodos.clicar(el.getSignin());

	}

	@When("Preencher o campo email {string}")
	public void preencher_o_campo_email(String string) {
		metodos.escrever(string, el.getEmail());

	}

	@When("Clicar em Create an account {string}")
	public void clicar_em_create_an_account(String string) {
		metodos.Sleep();
		metodos.clicar(el.getCreate());

	}

	@When("Preencher o campo First name {string}")
	public void preencher_o_campo_first_name(String string) {
		metodos.Sleep();
		metodos.escrever(string, el.getFirstname());

	}

	@When("Preencher o campo Last name {string}")
	public void preencher_o_campo_last_name(String string) {
		metodos.escrever(string, el.getLastname());

	}

	@When("Preencher o campo Password {string}")
	public void preencher_o_campo_password(String string) {
		metodos.escrever(string, el.getPasswd());

	}

	@When("Preencher o campo de endereco Address {string}")
	public void preencher_o_campo_de_endereco_address(String string) {
		metodos.escrever(string, el.getAddress1());

	}

	@When("Preencher o campo de endereco City {string}")
	public void preencher_o_campo_de_endereco_city(String string) {
		metodos.escrever(string, el.getCity());

	}

	@When("Preencher o campo de endereco State")
	public void preencher_o_campo_de_endereco_state() {
		metodos.clicar(el.getState());
	}

	@When("Preencher o campo de endereco Zip {string}")
	public void preencher_o_campo_de_endereco_zip(String string) {
		metodos.escrever(string, el.getPostcode());

	}

	@When("Preencher o campo de endereco Country {string}")
	public void preencher_o_campo_de_endereco_country(String string) {

	}

	@When("Preencher o campo de endereco Mobile phone {string}")
	public void preencher_o_campo_de_endereco_mobile_phone(String string) {
		metodos.escrever(string, el.getPhone());

	}

	@When("Preencher o campo de endereco reference {string}")
	public void preencher_o_campo_de_endereco_reference(String string) {
		metodos.escrever(string, el.getEmail_reference());

	}

	@When("Clicar em {string}")
	public void clicar_em(String string) {
		metodos.clicar(el.getRegister());

	}

	@Then("Cadastrado realizado com sucesso")
	public void cadastrado_realizado_com_sucesso() {

	}

	@Then("Validar se o cadastro foi realizado {string}")
	public void validar_se_o_cadastro_foi_realizado(String textoEsperado) {
		metodos.validadeTexto(textoEsperado, el.getSignout());

	}

	@Then("Visualizo evidencias de {string}")
	public void visualizo_as(String p) throws IOException {
		metodos.screnShot(p);
		metodos.fecharNavegador();

	}
	
	//CN02 Teste negativo Campo de email em branco

	
	@When("Nao preencher o campo de email")
	public void nao_preencher_o_campo_de_email() {

	}

	@Then("Mensagem de erro")
	public void mensagem_de_erro() {
	
	}

	@Then("Valido mensagem de erro {string}")
	public void valido_mensagem_de_erro(String textoEsperado) {
	metodos.Sleep();
	metodos.validadeTexto(textoEsperado, el.getEmailinvalido());

	}
	
	@Then("Visualizo evidencias de erro {string}")
	public void visualizo_as1(String p) throws IOException {
		metodos.Sleep();
		metodos.screnShot(p);
		metodos.fecharNavegador();

	}
	
	//CN03 Teste negativo email ja cadastrado
	
	@When("Preencher o campo email com um email ja cadastrado {string}")
	public void preencher_o_campo_email_com_um_email_ja_cadastrado(String string) {
		metodos.escrever(string, el.getEmail());
	 
	}

	@Then("Valido Mensagem de erro {string}")
	public void valido_mensagem_de_erro1(String textoEsperado) {
	metodos.Sleep();
	metodos.validadeTexto(textoEsperado, el.getEmailregistered());

	}

	@Then("Visualizo evidencias de erro2 {string}")
	public void visualizo_evidencias_de_erro2(String p) throws IOException {
		metodos.Sleep();
		metodos.screnShot(p);
		metodos.fecharNavegador();
		
		
	//CN04 Realizar Login
   
	}
	
	@When("Preencher o campo email2 {string}")
	public void preencher_o_campo_email2(String string) {
		metodos.escrever(string, el.getEmail_logar());


	}

	@When("Clicar em Signin2")
	public void clicar_em_signin2() {
		metodos.clicar(el.getSubmitLogin());


	}

	@Then("Login realizado com  sucesso")
	public void login_realizado_com_sucesso() {

	}


}
