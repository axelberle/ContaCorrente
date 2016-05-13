Feature: Fazer depósitos de uma conta corrente

# -----------------------------------------------------------------------------------------------------------------------------

	Scenario Outline: Depositar uma quantia
	
		Given que a conta corrente tem um saldo de "<saldo_anterior>"
		When  é feito um depósito de "<quantia>"
		Then  a conta corrente tem o saldo final de "<saldo_final>"
		
	Examples:
	
		|  saldo_anterior  | quantia   |  saldo_final |
		|  100             | 200       |  300         |
		|  50.23           | 40.50     |  90.73       |
		|  -500.50         | 10000     |  499.50      |
			

	
	


