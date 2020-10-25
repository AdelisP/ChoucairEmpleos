package com.choucair.empleos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EmployPage {

	public static final Target INP_KEYWORD = Target.the("input keyword for job").locatedBy("//input[@id=\"search_keywords\"]");
	public static final Target INP_LOCATION = Target.the("input for job location").locatedBy("//input[@id='search_location']");
	public static final Target BTN_SEARCH_JOB = Target.the("button for search job").locatedBy("//div[@class='search_submit']/input[@type='submit']");
	public static final Target SELECTED_JOB = Target.the("selected job").locatedBy("//div[3]/div/div/div/ul/li[2]/a");
}
