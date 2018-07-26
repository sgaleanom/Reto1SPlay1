package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.WebDemoTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElMensaje implements Question<String>{

	public static ElMensaje es() {
		// TODO Auto-generated method stub
		return new ElMensaje();
	}

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(WebDemoTablePage.LABEL_MENSAJE_INICIAL).viewedBy(actor).asString();
	}

}
