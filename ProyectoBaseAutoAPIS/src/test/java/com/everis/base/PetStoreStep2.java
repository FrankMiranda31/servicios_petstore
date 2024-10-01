package com.everis.base;

import com.everis.base.models.Order;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PetStoreStep2 {
    private String URL_BASE= "https://petstore.swagger.io/v2";

    public Order order;

    public void consultarOrder(int id){
       order=given()
                .baseUri(URL_BASE)
                .log()
                .all()
                .when()
                .get("/store/order/"+id)
                .as(Order.class)
        ;
        listarorder(order);



    }

    private void listarorder(Order order){

        System.out.println("OUT: ID: "+order.getId());
        System.out.println("OUT: PETID: "+order.getPetId());
        System.out.println("OUT: QUANTITY: "+order.getQuantity());


    }

    public Order obtenerrespuesta(){
        return order;
    }

    public void validarCodRespuesta(int i){
        assertThat(lastResponse().statusCode(),is(i));

    }



}
