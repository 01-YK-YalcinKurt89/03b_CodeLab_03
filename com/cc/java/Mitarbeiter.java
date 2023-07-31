package com.cc.java;
import java.time.*;
import java.util.Calendar;




public class Mitarbeiter {
    private String familyName;
    private String firstName;
    private int birthYear;

    protected String workID;
    protected String department;
    protected String role;
    protected int hiredYear;


    public String getFamilyName() {
        return familyName;
    }


    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }


    public String getFirstName() {
        return firstName;
    }


    public int getBirthYear() {
        return birthYear;
    }




    protected void hasLunch() {
        System.out.println("Hi, I'm Yalcin and I'm having lunch!");
    }

    protected void startsWork() {
        System.out.println("Hi, I'm *XY* and I'm starting my work at the *accouting* department!");
    }

    protected String getEmployedTime() {
        Calendar rightNow = Calendar.getInstance();
        return "Hi, I'm *XY* and I've been working here since " + rightNow + " years.";

    }

}
