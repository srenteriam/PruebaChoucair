package com.choucair.models;


public class Meeting {

    private String meetingName;
    private String meetingType;
    private String meetingNumber;
    private String startDate;
    private String endDate;
    private String location;
    private  String unit;
    private  String organized;
    private  String reporter;


    public Meeting(String meetingName, String meetingType, String meetingNumber, String startDate,
                   String endDate,  String location, String unit,
                   String organized, String reporter) {
        this.meetingName = meetingName;
        this.meetingType = meetingType;
        this.meetingNumber = meetingNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.unit = unit;
        this.organized = organized;
        this.reporter = reporter;
    }

    public String getMeetingName() {
        return meetingName;
    }
    public String getMeetingType() {
        return meetingType;
    }
    public String getMeetingNumber() {
        return meetingNumber;
    }
    public String getStartDate() {
        return startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public String getLocation() {return location;}
    public String getUnit() {return unit;}
    public String getOrganized() {return organized;}
    public String getReporter() {return reporter;}
}

