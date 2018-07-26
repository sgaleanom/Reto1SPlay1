package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WebDemoTablePage extends PageObject
{
	public static final Target LABEL_MENSAJE_INICIAL = Target.the("Mensaje inicial")
			.located(By.xpath("//* [ contains (text (), ' - Double Click on Edit Icon to ')]"));
	
}
