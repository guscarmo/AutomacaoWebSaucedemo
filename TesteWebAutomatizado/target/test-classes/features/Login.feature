#language: pt
#enconding: UTF-8

Funcionalidade: Acessar o sistema

	@Login
	Cenario: Login no sistema
		Dado que eu acesso o site
		Quando eu informar o usuario "standard_user"
		E informar a senha "secret_sauce"
		E clicar no botao login
		Entao o sistema exibe o usuario logado

	