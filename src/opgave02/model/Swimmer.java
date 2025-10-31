package opgave02.model;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private String club;
    private int yearGroup;
    private ArrayList<Double> lapTimes;

    public Swimmer(String name, int yearGroup, ArrayList<Double> lapTimes, String club) {
        this.name = name;
        this.yearGroup = yearGroup;
        this.lapTimes = lapTimes;
        this.club = club;
    }

    public String getName() {
        return this.name;
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

    public double bestLaptime() {
        double best = Double.MAX_VALUE;
        for (Double time : lapTimes) {
            if (best > time) {
                best = time;
            }
        }
        return best;
    }
}

