package opgave02;

import opgave02.model.Swimmer;
import opgave02.model.TraningPlan;

import java.util.ArrayList;

public class SwimmerApp {
    public static void main(String[] args) {
        TraningPlan traningPlanA = new TraningPlan('A', 16, 10);

        ArrayList<Double> lapTime = new ArrayList<>();
        lapTime.add(1.00);
        lapTime.add(0.98);
        lapTime.add(1.05);
        lapTime.add(1.02);
        Swimmer swimmer1 = new Swimmer("Jan", 1994, lapTime, "AGF");

        lapTime = new ArrayList<>();
        lapTime.add(1.00);
        lapTime.add(0.88);
        lapTime.add(1.33);
        lapTime.add(1.53);
        Swimmer swimmer2 = new Swimmer("Bent", 1990, lapTime, "Lyseng");

        traningPlanA.addSwimmer(swimmer2);
        traningPlanA.addSwimmer(swimmer1);

        traningPlanA.printSwimmers();
    }
}

