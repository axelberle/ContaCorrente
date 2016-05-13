Feature: Fazer retiradas de uma conta corrente

# -----------------------------------------------------------------------------------------------------------------------------

	Scenario: Retirar uma quantia com saldo insuficiente
	
		Given que a conta corrente tem um saldo de -500
		When  é feito uma retirada de 1000
		Then  a retirada é cancelada e o saldo fica intalterado
		
		
	
	


