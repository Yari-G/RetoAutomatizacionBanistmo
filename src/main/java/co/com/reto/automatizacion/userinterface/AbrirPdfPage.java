package co.com.reto.automatizacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AbrirPdfPage extends PageObject {
    public static final Target ABRIR_PDF =
            Target.the("Abrir PDF")
            .located(By.xpath("/html/body/form/div[13]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div/ul/li[8]/div/div/div/a[1]/img"));
}

