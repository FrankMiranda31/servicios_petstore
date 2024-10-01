package com.everis.base.stepDefinitions;

import com.everis.base.models.Order;
import com.everis.base.PetStoreStep2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;

public class PetStoreSD2 {
    @Steps
    PetStoreStep2 petstore2;
    @Given("dado que ingreso en la pagina")
    public void dadoQueIngresoEnLaPagina() {
    }

    @When("consulto la orden con ID {int}")
    public void consultoLaOrdenConID(int id) {
        petstore2.consultarOrder(id);
    }

    @Then("valido que el codigo de respuesta sea {int}")
    public void validoQueElCodigoDeRespuestaSea(int code) {
        petstore2.validarCodRespuesta(code);
    }

    @And("la respuesta debe contener el id{int}")
    public void laRespuestaDebeContenerElId(int id) {
        Order order=petstore2.obtenerrespuesta();
        assertEquals(id,order.getId());
    }
}
