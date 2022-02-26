package co.com.reto.automatizacion.tasks;

import co.com.reto.automatizacion.interactions.Switch;
import co.com.reto.automatizacion.userinterface.BuscarPdfPage;
import com.sun.java.swing.plaf.windows.resources.windows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ResourceBundle;

public class Buscar implements Task {


    public static Buscar pdf() { return Tasks.instrumented(Buscar.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BuscarPdfPage.MENU_TRANSPARENCIA),
                Click.on(BuscarPdfPage.SUBMENU_PRESUPUESTO),(Switch.TheWindow()),
                Click.on(BuscarPdfPage.MENU_ESTADOS_FINANCIEROS),
                Click.on(BuscarPdfPage.OPCION_BALANCES),(Switch.TheWindow()));
    }
}




