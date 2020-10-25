package com.choucair.empleos.questions;

import com.choucair.empleos.userinterfaces.ApplyForJobPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateEmailInput implements Question<String> {
	


	@Override
	public String answeredBy(Actor actor) {
		return Text.of(ApplyForJobPage.TXT_VALIDATION_EMAIL).viewedBy(actor).asString();
	}
	
	public static ValidateEmailInput inTheForm() {
		return new ValidateEmailInput();
	}

}
