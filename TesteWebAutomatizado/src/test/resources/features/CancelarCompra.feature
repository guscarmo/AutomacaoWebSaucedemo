#language: pt
#enconding: UTF-8

Funcionalidade: Cancelar compra antes de finalizar
	@CancelarCompra
	Cenario: Apos o preenchimento dos dados do usuario e zip code deve ser possivel cancelar a compra antes de finalizar
		Dado que acrescentei um macacao no carrinho e realizei o checkout do carrinho
		E preencher os campos FirstName, LastName e ZIP Code respectivamente de "Gustavo" "Carmo" "180000"
		Quando eu clicar no botao cancel
		Entao o sistema retorna para a pagina inical