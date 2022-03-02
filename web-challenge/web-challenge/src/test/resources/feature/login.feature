#Author: pedro.r.franco90@gmail.com

Feature: Realizar cadastro
  Eu como usuario deseja realizar cadastro no site
  
  Background: Acessar o site automationpractice.com
  Given que eu esteja no "http://automationpractice.com/index.php"

  Scenario: CN01 Realizar cadastro
  	When Clicar em Signin
  	And Preencher o campo email "alfredo14@hotmail.com"
  	And Clicar em Create an account ""
  	And Preencher o campo First name "Pedro"
  	And Preencher o campo Last name "Franco"
  	And Preencher o campo Password "12345"
  	And Preencher o campo de endereco Address "Av1"
  	And Preencher o campo de endereco City "Sao Paulo"
  	And Preencher o campo de endereco State
  	And Preencher o campo de endereco Zip "00000"
  	And Preencher o campo de endereco Country ""
  	And Preencher o campo de endereco Mobile phone "987656787"
  	And Preencher o campo de endereco reference ""
  	And Clicar em "Registrar"
  	Then Cadastrado realizado com sucesso
  	Then Validar se o cadastro foi realizado "Sign out"
  	Then Visualizo evidencias de "Login"
  	

  Scenario: CN02 Teste negativo Campo de email em branco
  	When Clicar em Signin
  	And Clicar em Create an account ""
  	And Nao preencher o campo de email
  	Then Mensagem de erro
  	Then Valido mensagem de erro "Invalid email address."
  	Then Visualizo evidencias de erro "Email invalid"
  	
 
	Scenario: CN03 Teste negativo email ja cadastrado
		When Clicar em Signin
  	And Preencher o campo email com um email ja cadastrado "emailjacadastrado@hotmail.com"
  	And Clicar em Create an account ""
  	Then Mensagem de erro
  	Then Valido Mensagem de erro "An account using this email address has already been registered. Please enter a valid password or request a new one."
  	Then Visualizo evidencias de erro2 "Email ja cadastrado"
  	
  	
  	Scenario: CN04 Realizar Login
  		When Clicar em Signin
  		And Preencher o campo email2 "emailjacadastrado@hotmail.com"
  		And Preencher o campo Password "12345"
  		And Clicar em Signin2
  		Then Login realizado com  sucesso 
  		Then Validar se o cadastro foi realizado "Sign out"
  		Then Visualizo evidencias de "Login2"
  		
  		
  		 
  	
  	
  	
  	
  	
  	
  	

  


  	

  	
  	
  	
  	
  	
  	
  	
  	
  	


