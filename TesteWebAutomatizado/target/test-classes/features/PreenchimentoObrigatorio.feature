#language: pt
#enconding: UTF-8

Funcionalidade: Os campos apos o checkout sao de preenchimento obrigatorio
	@PreenchimentoObrigatorio
	Cenario: Apos realizar o checkout os campos First Name, Last Name, e Zip Postal code sao de preenchimento obrigatorio
		Dado que eu estou com um macacao no carrinho
		E Acionei o botao checkout
		Quando eu acionar o botao continue
		Entao o sistema me sinaliza que o campo First Name e obrigatorio
		E apos preencher com o nome "Gustavo"
		E eu acionar o botao continue
		Entao o sistema me sinaliza que o campo Last Name e obrigatorio
		E apos preencher com o sobrenome "Carmo"
		E eu acionar o botao continue
		Entao o sistema me sinaliza que o campo Postal Code e obrigatorio
		E apos preencher com o postal code "348000"
		E eu acionar o botao continue
		Entao o sistema avanca para a proxima etapa
