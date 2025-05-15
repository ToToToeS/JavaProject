package UpgradeJava;

import javax.swing.*;
import java.util.Arrays;

public class EnumEx {
    public static void main(String[] args) {
        Today day = new Today(week.MONDAY);
        day.daysInfo();
        week[] w = week.values();
        System.out.println(week.MONDAY);
    }
}

enum week {
    MONDAY("Bad"),
    TUESDAY("Bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("great");

    private String mood;

    private week(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today{
    week weekDays;

    public Today(week weekDay) {
        this.weekDays = weekDay;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Idi rabotay");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Otdoxni");
        }
    }
}