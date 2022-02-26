package co.com.reto.automatizacion.tasks;

import co.com.reto.automatizacion.userinterface.AbrirPdfPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Abrir implements Task {

    public static Abrir Pdf() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AbrirPdfPage.ABRIR_PDF));
    }
}