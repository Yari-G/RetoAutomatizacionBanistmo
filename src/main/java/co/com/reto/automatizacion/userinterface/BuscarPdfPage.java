package co.com.reto.automatizacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarPdfPage extends PageObject {
    public static final Target MENU_TRANSPARENCIA = Target
            .the("Seleccionar menu transparencia")
            .located(By.xpath("//a[@href='/transparencia']"));

    public static final Target SUBMENU_PRESUPUESTO = Target
            .the("Seleccionar subMenu Presupuesto")
            .located(By.xpath("//a[@title='Ir a' and contains(text(),'Presupuesto')]"));

    public static final Target MENU_ESTADOS_FINANCIEROS = Target
            .the("Seleccionar menu estados financieros")
            .located(By.xpath("//a[@title='Estados financieros' and contains(text(),'Estados financieros')]"));

    public static final Target OPCION_BALANCES = Target
            .the("Seleccionar opcion balances")
            .located(By.xpath("//*[contains(text(),'Balances')]"));
}
