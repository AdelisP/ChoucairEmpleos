package com.choucair.empleos.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ApplyForJobPage {

	public static final Target BTN_APPLY_FOR_JOB = Target.the("the button for fill the form").locatedBy("//input[@class='application_button button']");
	public static final Target INP_NAME = Target.the("the input for user name").locatedBy("//form/p[1]/label/span/input[@name='your-name']");
	public static final Target INP_EMAIL = Target.the("the input for user mail").locatedBy("//form/p[2]/label/span/input[@name='your-email']");
	public static final Target INP_PHONE = Target.the("the input for user phone").locatedBy("//form/p[3]/label/span/input[@name='tel']");
	public static final Target INP_FORMAL_STUDIES = Target.the("the input for user formal studies").locatedBy("//form/p[4]/label/span/textarea[@name='estudios']");
	public static final Target INP_TESTING_EXPERIENCE = Target.the("the input for time of experience in testing").locatedBy("//form/p[5]/label/span/textarea[@name='exp']");
	public static final Target INP_KNOWLEDGE_IN_AUTOMATION = Target.the("the input for knowledge in automation").locatedBy("//form/p[6]/label/span/textarea[@name='auto']");
	public static final Target INP_WAGE_ASPIRATION = Target.the("the input for user wage aspiration").locatedBy("//form/p[7]/label/span/input[@name='salario']");
	public static final Target SEL_TIME_AVIABILITY = Target.the("the selecctor for time aviavility").locatedBy("//form/p[8]/label/span/select[@name='curso']");
	public static final Target INP_ADITIONAL_MESSAGE = Target.the("the input for additional message").locatedBy("//form/p[9]/label/span/textarea[@name='your-message']");
	public static final Target BTN_SEND = Target.the("the button for send the form").locatedBy("//form/p[13]/input[@type='submit']");
	public static final Target TXT_VALIDATION_EMAIL = Target.the("the text of the validation in the form").locatedBy("//form//label/span[@class='wpcf7-form-control-wrap your-email']/span[@class='wpcf7-not-valid-tip']");
	
}
