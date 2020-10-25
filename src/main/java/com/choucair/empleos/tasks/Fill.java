package com.choucair.empleos.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Map;

import com.choucair.empleos.userinterfaces.ApplyForJobPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Fill implements Task {
	
	Map<String, String> data;
	
	public Fill(Map<String, String> data) {
		this.data = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		scrollDown(2);
		actor.attemptsTo(
				Click.on(ApplyForJobPage.BTN_APPLY_FOR_JOB),
				Enter.theValue(data.get("Name")).into(ApplyForJobPage.INP_NAME),
				Enter.theValue(data.get("Email")).into(ApplyForJobPage.INP_EMAIL),
				Enter.theValue(data.get("Phone")).into(ApplyForJobPage.INP_PHONE),
				Enter.theValue(data.get("Formal studies")).into(ApplyForJobPage.INP_FORMAL_STUDIES),
				Enter.theValue(data.get("Testing experience")).into(ApplyForJobPage.INP_TESTING_EXPERIENCE),
				Enter.theValue(data.get("Knowledge in automation")).into(ApplyForJobPage.INP_KNOWLEDGE_IN_AUTOMATION),
				Enter.theValue(data.get("Wage aspiration")).into(ApplyForJobPage.INP_WAGE_ASPIRATION),
				SelectFromOptions.byVisibleText(data.get("Time aviability")).from(ApplyForJobPage.SEL_TIME_AVIABILITY),
				Enter.theValue(data.get("Aditional message")).into(ApplyForJobPage.INP_ADITIONAL_MESSAGE)
				
				);
		
		scrollDown(1);
		actor.attemptsTo(Click.on(ApplyForJobPage.BTN_SEND));

	}
	
	public static Fill theForm(Map<String, String> data) {
		return new Fill(data);
	}
	
	private void scrollDown(int v) {
		Robot robot;
		try {
			robot = new Robot();
			
			for (int i = 0; i < v; i++) {
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			}
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		
	}

}
