package co.com.reto.automatizacion.stepdefinitions;


import co.com.reto.automatizacion.interactions.Switch;
import co.com.reto.automatizacion.questions.Comprobar;
import co.com.reto.automatizacion.tasks.Abrir;
import co.com.reto.automatizacion.tasks.Buscar;
import co.com.reto.automatizacion.tasks.OpenUpAeronautica;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class BanistmoStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa a la pagina de aeronautica$")
    public void queElUsuarioIngresaALaPaginaDeAeronautica() {
        OnStage.theActorCalled("Yariela").wasAbleTo(OpenUpAeronautica.ThePage());
    }


    @Cuando("^selecciona las diferentes opciones del menu hasta llegar al estado financiero de abril$")
    public void seleccionaLasDiferentesOpcionesDelMenuHastaLlegarAlEstadoFinancieroDeAbril() {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.pdf(),(Switch.TheWindow()),
                (Abrir.Pdf()),(Switch.TheWindow()));
    }

    @Entonces("^se debe abrir correctamente el archivo (.*)$")
    public void seDebeAbrirCorrectamenteElArchivoEstadoDeSituaciónFinancieraADeAbrilDe(String Verificar) {
        //OnStage.theActorInTheSpotlight().should(seeThat(Comprobar.ThePDF(Verificar)));
    }
}
