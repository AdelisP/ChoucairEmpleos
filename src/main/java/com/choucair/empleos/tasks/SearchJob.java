package com.choucair.empleos.tasks;

import com.choucair.empleos.userinterfaces.EmployPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchJob implements Task{
	
	private String keyword;
	private String location;

	public SearchJob(String keyword, String location) {
		this.keyword = keyword;
		this.location = location;
	}



	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(keyword).into(EmployPage.INP_KEYWORD),
				Enter.theValue(location).into(EmployPage.INP_LOCATION),
				Click.on(EmployPage.BTN_SEARCH_JOB),
				Click.on(EmployPage.SELECTED_JOB)
				);
		
	}
	
	public static SearchJob inChoucair(String keyword, String location) {
		return new SearchJob(keyword, location);
	}
	
	

}
