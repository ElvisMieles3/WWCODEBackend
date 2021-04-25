package com.certificacion.backend.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;


public class ElCorreo implements Question<String> {

    String email;

    public ElCorreo(String campo) {
        this.email = campo;
    }

    public static ElCorreo es(String email) {
        return new ElCorreo(email);
    }

    @Override
    public String answeredBy(Actor actor) {

        return LastResponse.received().answeredBy(actor).jsonPath().getString("data.email");


    }
}
