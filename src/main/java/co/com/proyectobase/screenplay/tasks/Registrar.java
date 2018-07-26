package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.WebDemoHomePage;
import co.com.proyectobase.screenplay.util.ExcelReader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registrar implements Task{

	
	private int i;
	
	public Registrar(int i) {
		super();
		this.i = i;
	}

	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		try
		{
			actor.attemptsTo(Enter.theValue(ExcelReader.getCellData(i, 0).trim()).into(WebDemoHomePage.CAMPO_NOMBRE));
			actor.attemptsTo(Enter.theValue(ExcelReader.getCellData(i, 1).trim()).into(WebDemoHomePage.CAMPO_APELLIDO));
			actor.attemptsTo(Enter.theValue(ExcelReader.getCellData(i, 2).trim()).into(WebDemoHomePage.CAMPO_EMAIL));
			actor.attemptsTo(Enter.theValue(ExcelReader.getCellData(i, 3).trim()).into(WebDemoHomePage.CAMPO_TELEFONO));
			actor.attemptsTo(Click.on(WebDemoHomePage.RADIOBUTTON_MASCULINO));
			actor.attemptsTo(SelectFromOptions.byVisibleText(ExcelReader.getCellData(i, 4).trim()).from(WebDemoHomePage.CAMPO_PAIS));
			actor.attemptsTo(SelectFromOptions.byVisibleText(ExcelReader.getCellData(i, 5).trim()).from(WebDemoHomePage.CAMPO_AÑO));
			actor.attemptsTo(SelectFromOptions.byVisibleText(ExcelReader.getCellData(i, 6).trim()).from(WebDemoHomePage.CAMPO_MES));
			actor.attemptsTo(SelectFromOptions.byVisibleText(ExcelReader.getCellData(i, 7).trim()).from(WebDemoHomePage.CAMPO_DIA));
			actor.attemptsTo(Enter.theValue(ExcelReader.getCellData(i, 8).trim()).into(WebDemoHomePage.CAMPO_CONTRASENA));
			actor.attemptsTo(Enter.theValue(ExcelReader.getCellData(i, 9).trim()).into(WebDemoHomePage.CAMPO_REPETIR_CONTRASENA));
			actor.attemptsTo(Click.on(WebDemoHomePage.BOTON_ENVIAR));
			}
		catch (Exception e) {
		}
		
	}
	
	public static Registrar ConLosSiguientesDatos(int i) {
	
		return Tasks.instrumented(Registrar.class, i);
	}


}
