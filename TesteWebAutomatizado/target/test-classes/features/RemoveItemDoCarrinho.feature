#language: pt
#enconding: UTF-8

Funcionalidade: Remove item do carrinho
	@RemoveItem
	Cenario: Remover item do carrinho antes de realizar o checkout
		Dado que estou com um item no carrinho
		Quando eu clicar em remove
		Entao o item e removido antes de ser realizado o checkout