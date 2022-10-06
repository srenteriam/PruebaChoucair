package com.choucair.tasks;


import com.choucair.models.Meeting;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.Map;

import static com.choucair.userinterfaces.MeetingPage.*;

public class CreateMeeting implements Task {

    private DataTable data;
    private Map<String, String> information;
    private Meeting meeting;

    public CreateMeeting(DataTable data) {
        this.data = data;
        information = this.data.asMap(String.class, String.class);
        meeting = new Meeting(information.get("meeting_name"), information.get("meeting_type"), information.get("meeting_number"),
                information.get("start_date"), information.get("end_date"), information.get("location"),
                information.get("unit"),information.get("organized"),information.get("reporter")
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                new net.serenitybdd.screenplay.Performable[]{Click.on(MEETING_LIST), Click.on(MEETING_OPTION), Click.on(BTN_NEW_MEETING), Enter.theValue(meeting.getMeetingName()).into(INPUT_NAME), Click.on(LIST_TYPE), Enter.theValue(meeting.getMeetingType()).into(INPUT_TYPE), Click.on(TYPE), Enter.theValue(meeting.getMeetingNumber()).into(INPUT_NUMBER), Enter.theValue(meeting.getStartDate()).into(INPUT_STAR_DATE), Enter.theValue(meeting.getEndDate()).into(INPUT_END_DATE), Click.on(INPUT_LOCATION), Enter.theValue(meeting.getLocation()).into(LOCATION_TYPE).thenHit(Keys.TAB), Click.on(LIST_UNIT), Enter.theValue(meeting.getUnit()).into(UNIT).thenHit(Keys.TAB), Click.on(LIST_USER_ORGANIZED), Enter.theValue(meeting.getOrganized()).into(USER_ORGANIZED).thenHit(Keys.TAB), Click.on(LIST_REPORTERS), Enter.theValue(meeting.getReporter()).into(REPORTER).thenHit(Keys.TAB), Click.on(SAVE_MEETING)});
    }

    public static CreateMeeting with(DataTable data) {
        return Tasks.instrumented(CreateMeeting.class, data);
    }

}

