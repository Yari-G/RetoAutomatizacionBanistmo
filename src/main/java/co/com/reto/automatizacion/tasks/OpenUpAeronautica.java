package co.com.reto.automatizacion.tasks;

import co.com.reto.automatizacion.userinterface.AbrirAeronauticaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpAeronautica implements Task {
    private AbrirAeronauticaPage abrirAeronauticaPage;
    public static OpenUpAeronautica ThePage() { return Tasks.instrumented(OpenUpAeronautica.class); }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(abrirAeronauticaPage));
    }
}
