package Stepdefinitions;

import Utils.Utilidades;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.OpenTask;


public class stepdefinition {


    @Managed
    WebDriver hisdriver;

    @Before
    public void Open() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Luis");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisdriver));

    }

    @Given("^Luis open pages saucelab$")
    public void luisOpenPagesSaucelab() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Utilidades.URL));
    }


    @When("^I write tha credential (.*) and (.*) about the search engine$")
    public void iWriteThaCredentialStandard_userAndSecret_sauceAboutTheSearchEngine(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenTask.ingresar(username, password));

    }
    @Then("^I enter the page correctly$")
    public void iEnterThePageCorrectly() {


    }

}
