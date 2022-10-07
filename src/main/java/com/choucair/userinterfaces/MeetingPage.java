package com.choucair.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage extends PageObject {

    public static final Target MEETING_LIST = Target.the("Lista de opciones Meeting")
            .locatedBy("//*[@class='s-sidebar-icon fa fa-comments premium-feature']");

    public static final Target MEETING_OPTION = Target.the("Opcion Meeting")
            .locatedBy("//span[contains(text(),'Meetings')]");

    public static final Target BTN_NEW_MEETING = Target.the("Boton para crear nueva reunion")
            .locatedBy("//i[@class='fa fa-plus-circle text-green']");

    public static final Target INPUT_NAME = Target.the("Campo para nombre de la reunion")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");

    public static final Target INPUT_NUMBER = Target.the("Campo para numero de la reunion")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']");

    public static final Target LIST_TYPE = Target.the("lista para tipo de la reunion")
            .locatedBy("//*[@id='select2-chosen-6']");

    public static final Target INPUT_TYPE = Target.the("Campo para tipo de la reunion")
            .locatedBy("//*[@id='s2id_autogen6_search']");

    public static final Target TYPE = Target.the("Tipo de la reunion")
            .locatedBy("//span[contains(@class,'select2-match')]");

    public static final Target INPUT_STAR_DATE = Target.the("Campo para fecha de inicio de la reunion")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_StartDate']");

    public static final Target INPUT_END_DATE = Target.the("Campo para fecha de fin de la reunion")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_EndDate']");

    public static final Target INPUT_LOCATION = Target.the("Nueva locacion")
            .locatedBy("//*[@id='select2-chosen-7']");

    public static final Target LOCATION_TYPE = Target.the("Tipo Locacion")
            .locatedBy("//*[@id='s2id_autogen7_search']");

    public static final Target LIST_USER_ORGANIZED = Target.the("Lista para escoger usuario")
            .locatedBy("//*[@id='select2-chosen-9']");

    public static final Target USER_ORGANIZED = Target.the("Escoger usuario")
            .locatedBy("//*[@id='s2id_autogen9_search']");

    public static final Target LIST_REPORTERS = Target.the("Listado de reportes")
            .locatedBy("//*[@id='select2-chosen-10']");
    public static final Target REPORTER = Target.the("Opcion de reporter")
            .locatedBy("//*[@id='s2id_autogen10_search']");

    public static final Target ATTENDEE_LIST = Target.the("Opciones de asistentes")
            .locatedBy("//*[@id='s2id_autogen11']");

    public static final Target ATTENDEE = Target.the("Agregar asistentes")
            .locatedBy("//*[@id='s2id_autogen12_search']");

    public static final Target LIST_UNIT = Target.the("Listado de unidades de negocio")
            .locatedBy("//*[@class='field UnitId col-sm-6']//*[@class='select2-chosen']");

    public static final Target UNIT = Target.the("Opcion de unidades de negocio")
            .locatedBy("//*[@id='s2id_autogen8_search']");

    public static final Target NAME_MEETING = Target.the("Nombre de la reunion")
            .locatedBy("//*[contains(text(), '{0}')]");

    public static final Target SAVE_MEETING = Target.the("Opcion de unidades de negocio")
            .locatedBy("//i[@class='fa fa-check-circle text-purple']");

}

