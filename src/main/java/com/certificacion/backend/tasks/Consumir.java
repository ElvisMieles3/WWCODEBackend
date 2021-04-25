package com.certificacion.backend.tasks;

import com.certificacion.backend.tasks.get.Consultar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Consumir implements Task {

    private final String servicio;

    public Consumir(String servicio) {
        this.servicio = servicio;
    }

    public static Consumir el(String servicio) {
        return Tasks.instrumented(Consumir.class, servicio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (servicio) {
            case "consultar usuario":
                actor.attemptsTo(Consultar.usuario(servicio));
        }
    }
}
