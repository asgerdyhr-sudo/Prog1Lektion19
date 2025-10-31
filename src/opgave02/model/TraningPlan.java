package opgave02.model;

import java.util.ArrayList;

public class TraningPlan {
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrenghtHours;
    private final ArrayList<Swimmer> swimmers = new ArrayList<>();

    public TraningPlan(char level, int weeklyWaterHours, int weeklyStrenghtHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrenghtHours = weeklyStrenghtHours;
    }

    public void printSwimmers (){
        for (Swimmer swimmer : swimmers) {
            System.out.println(swimmer.getName() + "'s bedste tid: " + swimmer.bestLaptime());
        }
    }

    public ArrayList<Swimmer> getSwimmers() {
        return new ArrayList<Swimmer>(swimmers);
    }

    public void addSwimmer (Swimmer swimmer){
        if (!swimmers.contains(swimmer)){
            swimmers.add(swimmer);
        }
    }

    public void removeSwimmer (Swimmer swimmer){
        if (swimmers.contains(swimmer)){
            swimmers.remove(swimmer);
        }
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public int getWeeklyWaterHours() {
        return weeklyWaterHours;
    }

    public void setWeeklyWaterHours(int weeklyWaterHours) {
        this.weeklyWaterHours = weeklyWaterHours;
    }

    public int getWeeklyStrenghtHours() {
        return weeklyStrenghtHours;
    }

    public void setWeeklyStrenghtHours(int weeklyStrenghtHours) {
        this.weeklyStrenghtHours = weeklyStrenghtHours;
    }
}
