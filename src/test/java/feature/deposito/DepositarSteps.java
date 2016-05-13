package feature.deposito;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepositarSteps {

	private static final Logger LOG = LoggerFactory.getLogger(DepositarSteps.class);

	@Given("^que a conta corrente tem um saldo de \"([^\"]*)\"$")
	public void que_a_conta_corrente_tem_um_saldo_de(String saldoAnterior) {

		DepositarSteps.LOG.debug("step 1: " + saldoAnterior);

	}

	@When("^é feito um depósito de \"([^\"]*)\"$")
	public void é_feito_um_depósito_de(String quantia)   {

		DepositarSteps.LOG.debug("step 2: " + quantia);
	}

	@Then("^a conta corrente tem o saldo final de \"([^\"]*)\"$")
	public void a_conta_corrente_tem_o_saldo_final_de(String saldoResultante)  {

		DepositarSteps.LOG.debug("step 3: " + saldoResultante);
	}

}
