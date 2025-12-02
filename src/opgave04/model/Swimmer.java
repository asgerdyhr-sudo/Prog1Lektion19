package opgave04.model;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private String club;
    private int yearGroup;
    private TraningPlan traningPlan;

    public Swimmer(String name, int yearGroup, String club, TraningPlan traningPlan) {
        this.name = name;
        this.yearGroup = yearGroup;
        this.club = club;
        this.traningPlan = traningPlan;
    }

    public TraningPlan getTraningPlan(){
        return traningPlan;
    }

    public String getName() {
        return name;
    }

    public int getYearGroup() {
        return yearGroup;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
