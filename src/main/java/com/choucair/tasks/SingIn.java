package com.choucair.tasks;

import com.choucair.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SingIn implements Task {

    private String user;

    private String password;

    public SingIn(String user, String password){
        this.user= user;
        this.password= password;
    }

    public static SingIn with(String user,String password){
        return Tasks.instrumented(SingIn.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginPage.USER),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }

}
