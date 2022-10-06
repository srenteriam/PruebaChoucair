package com.choucair.stepdefinitions;

import com.choucair.questions.ValidateText;
import com.choucair.tasks.CreateMeeting;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.choucair.userinterfaces.MeetingPage.NAME_MEETING;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class MeetingStepdefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @When("Crea una reunion con los datos")
    public void creaUnaReunionConLosDatos(DataTable datosBasicosReunion) {
        theActorInTheSpotlight().attemptsTo(CreateMeeting.with(datosBasicosReunion));
    }

    @Then("Valida que la reunión {string} se haya creado correctamente")
    public void validaQueLaReuniónSeHayaCreadoCorrectamente(String text) {
        theActorInTheSpotlight().should(seeThat(ValidateText.with(NAME_MEETING,text), equalTo(text)));
    }
}
