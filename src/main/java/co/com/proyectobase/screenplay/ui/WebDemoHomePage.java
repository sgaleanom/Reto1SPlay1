package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")

public class WebDemoHomePage extends PageObject {
	
	
	public static final Target CAMPO_NOMBRE =  Target.the("Campo de texto Nombre")
			.located(By.xpath("//input [ contains (@placeholder, 'First Name')]"));
	
	public static final Target CAMPO_APELLIDO = Target.the("Campo de texto Apellido")
			.located(By.xpath("//input [ contains (@placeholder, 'Last Name')]"));
	
	public static final Target CAMPO_EMAIL = Target.the("Campo de texto Email")
			.located(By.xpath("//input [ contains (@ng-model, 'EmailAdress')]"));
	
	public static final Target CAMPO_TELEFONO = Target.the("Campo de texto Telefono")
			.located(By.xpath("//input [ contains (@ng-model, 'Phone')]"));
	
	public static final Target RADIOBUTTON_MASCULINO = Target.the("RadioButton genero masculino")
			.located(By.xpath("(//INPUT[@type='radio'])[1]"));
	
	public static final Target CAMPO_PAIS = Target.the("Lista desplegable Pais")
			.located(By.id("countries"));
	
	public static final Target CAMPO_AÑO = Target.the("Lista desplegable Año")
			.located(By.id("yearbox"));
	
	public static final Target CAMPO_MES = Target.the("Lista desplegable Año")
			.located(By.xpath("//* [ contains (@placeholder, 'Month')]"));
	
	public static final Target CAMPO_DIA = Target.the("Lista desplegable Año")
			.located(By.id("daybox"));
	
	public static final Target CAMPO_CONTRASENA = Target.the("Campo de texto Contraseña")
			.located(By.id("firstpassword"));
	
	public static final Target CAMPO_REPETIR_CONTRASENA = Target.the("Campo de texto Contraseña")
			.located(By.id("secondpassword"));
	
	public static final Target BOTON_ENVIAR = Target.the("Boton enviar formulario")
			.located(By.id("submitbtn"));
	
}
