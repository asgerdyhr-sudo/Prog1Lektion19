package opgave04.model;

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

    public ArrayList<Swimmer> getSwimmers(){
        return new ArrayList<Swimmer>(swimmers);
    }

    public Swimmer createSwimmer (String swimmerName){
        Swimmer swimmer = new Swimmer(swimmerName,1994,"FF",this);
        swimmers.add(swimmer);
        return swimmer;
    }

    public void removeSwimmer(Swimmer swimmer){
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
