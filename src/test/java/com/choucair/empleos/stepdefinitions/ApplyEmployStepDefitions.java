package com.choucair.empleos.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.choucair.empleos.questions.ValidateEmailInput;
import com.choucair.empleos.tasks.Fill;
import com.choucair.empleos.tasks.ScrollUp;
import com.choucair.empleos.tasks.SearchJob;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class ApplyEmployStepDefitions {
	
    Actor user = Actor.named("Fermin");
	
	@Managed(driver= "chrome")
	WebDriver driver;
	
	@Before
	public void config() {
		user.can(BrowseTheWeb.with(driver));
	}
	
	
	@Given("^The user starts the navigator$")
	public void theUserStartsTheNavigator() {
		user.wasAbleTo(Open.url("https://www.choucairtesting.com/empleos-testing/"));
	}


	@Given("^The user search a job with the keyword \"([^\"]*)\" in the location \"([^\"]*)\"$")
	public void theUserSearchAJobWithTheKeywordInTheLocation(String keyword, String location) {
	    user.attemptsTo(SearchJob.inChoucair(keyword, location));
	}

	@When("^he select a job offer and fill the form$")
	public void heSelectAJobOfferAndFillTheForm(DataTable personalData) {
		List<Map<String, String>> rows = personalData.asMaps(String.class, String.class);
		Map<String, String> data = rows.get(0);
		user.attemptsTo(Fill.theForm(data));
	}

	@Then("^he verify the entered data in email input and see the message \"([^\"]*)\"$")
	public void heVerifyTheEnteredDataInEmailInputAndSeeTheMessage(String message) {
	    user.attemptsTo(ScrollUp.inThePage());
	    user.should(seeThat(ValidateEmailInput.inTheForm() , Matchers.is(message)));
	}
}
