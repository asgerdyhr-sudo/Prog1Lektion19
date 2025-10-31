package opgave01;

import opgave01.model.Swimmer;
import opgave01.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {

    public static void main(String[] args) {

        TrainingPlan trainingPlanA = new TrainingPlan('A',16,10);
        TrainingPlan trainingPlanB = new TrainingPlan('B',10,6);

        ArrayList<Double> lapTimes = new ArrayList<>();
        Swimmer s1 = new Swimmer("Jan", 1994, lapTimes, "AGF");
        s1.setTrainingPlan(trainingPlanA);


        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer s2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng");
        s2.setTrainingPlan(trainingPlanB);

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.00);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer s3 = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");
        s3.setTrainingPlan(trainingPlanA);

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(s1);
        swimmers.add(s2);
        swimmers.add(s3);


        for (Swimmer s : swimmers) {
            System.out.println(s.getName() + "'s bedste tid: " + s.bestLapTime() + " | Årgang: " + s.getYearGroup() +
                    " | Klub: " + s.getClub() + " | Træningsplan: " + s.getTrainingPlan().getLevel() +
                    " | Vand træning: " + s.getTrainingPlan().getWeeklyWaterHours() +
                    " Timer | Styrketræning: " + s.getTrainingPlan().getWeeklyStrengthHours() + " Timer" +
                    " | Ugentlige trænings timer: " + s.allTraningHours() + " Timer");
        }
    }
}
