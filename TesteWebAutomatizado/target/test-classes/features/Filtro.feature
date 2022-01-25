#language: pt
#enconding: UTF-8

Funcionalidade: Filtrar preco
	@Filtro
	Cenario: Filtrar preco do mais baixo para o maior
		Dado que eu estou logado na tela inicial
		Quando eu acionar o filtro low to high
		Entao o sistema exibe os produtos do menor preco para o maior