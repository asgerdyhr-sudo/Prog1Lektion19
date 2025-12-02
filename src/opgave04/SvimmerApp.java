package opgave04;

import opgave04.model.Swimmer;
import opgave04.model.TraningPlan;

public class SvimmerApp {
    public static void main(String[] args) {
// Create a new training plan
        TraningPlan planA = new TraningPlan('A', 16, 10);

        // Create and add swimmers to the plan
        planA.createSwimmer("Jan");
        Swimmer bo = planA.createSwimmer("Bo");
        planA.createSwimmer("Lene");

        // Print the names of the swimmers on the plan
        System.out.println("Svømmere på Plan " + planA.getLevel() + ":");
        for (Swimmer swimmer : planA.getSwimmers()) {
            System.out.println(swimmer.getName());
        }

        System.out.println();

        planA.removeSwimmer(bo);

        System.out.println("Svømmere på Plan " + planA.getLevel() + ":");
        for (Swimmer swimmer : planA.getSwimmers()) {
            System.out.println(swimmer.getName());
        }
    }
}
