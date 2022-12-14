package com.choucair.tasks;

import com.choucair.userinterfaces.BusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class CreateNewBusiness implements Task {

    private String name;

    public CreateNewBusiness(String name) {
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BusinessUnitPage.OPTION_ORGANIZATION),
                Click.on(BusinessUnitPage.OPTION_BUSINESS),
                Click.on(BusinessUnitPage.BTN_NEW_BUSINESS),
                Enter.theValue(name).into(BusinessUnitPage.INPUT_NAME),
                Click.on(BusinessUnitPage.BTN_APPLY_CHANGES),
                Scroll.to(BusinessUnitPage.NAME_SCROLL)
        );
    }

    public static CreateNewBusiness with(String name){
        return Tasks.instrumented(CreateNewBusiness.class, name);
    }
}
