package co.com.proyectobase.screenplay.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.util.ExcelReader;

import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.questions.ElMensaje;
import co.com.proyectobase.screenplay.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class WebDemoStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor Carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial()
	{
		Carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void queCarlosQuiereAccederALaWebAutomationDemoSite() throws Exception 
	{
		Carlos.wasAbleTo(Abrir.LaPaginaDemo());
	}


	@When("^el realiza el registro en la pagina$")
	public void elRealizaElRegistroEnLaPGina() throws Exception {
		
		//String Path = "D:\\Backup\\eclipse-workspace\\Reto1SPlay\\src\\test\\resources\\datadriven\\Libro1.xlsx";
		String Path = "src\\test\\resources\\datadriven\\Libro1.xlsx";
		String SheetName = "Hoja1";
		
		ExcelReader.setExcelFile(Path, SheetName);
		
		int numFilas = ExcelReader.ContarFilas();
		for(int i=1;i<=numFilas;i++)
		{
			Carlos.attemptsTo(Registrar.ConLosSiguientesDatos(i));
		}
		ExcelReader.CerrarBook();

	}

	@Then("^el verifica que se carga la pantalla con texto (.*)$")
	public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(String mensaje) throws Exception {
		Carlos.should(seeThat(ElMensaje.es(), equalTo(mensaje)));
	}

}
