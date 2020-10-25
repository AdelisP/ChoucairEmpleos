package com.choucair.empleos.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ScrollUp implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		scrollUp(2);
	}
	
	
	public static ScrollUp inThePage() {
		return new ScrollUp();
	}
	private void scrollUp(int v) {
		Robot robot;
		try {
			robot = new Robot();
			
			for (int i = 0; i < v; i++) {
				robot.keyPress(KeyEvent.VK_PAGE_UP);
			}
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		
	}

}
