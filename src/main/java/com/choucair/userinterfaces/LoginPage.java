package com.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static final Target USER = Target.the("Usuario Sign IN")
            .locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_Username']");

    public static final Target PASSWORD = Target.the("Password")
            .locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_Password']");

    public static final Target BTN_LOGIN = Target.the("Boton Sign IN")
            .locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_LoginButton']");
}
