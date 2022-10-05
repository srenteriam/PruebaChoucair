package com.choucair.stepdefinitions;

import com.choucair.tasks.SingIn;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BusinessUnitStepdefinitions {
    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} Desea navegar a la pagina {string}")
    public void deseaNavegarAlaPagina(String actor, String url){theActorCalled(actor).attemptsTo(Open.url(url));}

    @Given("Se logea con usuario {string} y password {string}")
    public void seLogeaConUsuarioYPassword(String user, String password) {
        theActorInTheSpotlight().attemptsTo(SingIn.with(user, password));
    }
}



