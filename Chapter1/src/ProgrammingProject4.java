public class ProgrammingProject4 {

    public static final int AMOUNT_TO_KILL_MOUSE = 100; //in mg
    public static final int MOUSE_WEIGHT = 200; //in g
    public static final int STARTING_DIETER_WEIGHT = 100; //in kg
    public static final int DESIRED_DIETER_WEIGHT = 50; //in kg
    public static final double SWEETENER_FRACTION_IN_SODA = 0.001; // eg. 1 kg diet soda has 0.001 mg sweetener
    public static final int WEIGHT_LOSS_RATE = 100; // 1 kg diet soda helps lose 100g

    public static void main(String[] args) {

        double killRate = (double) AMOUNT_TO_KILL_MOUSE / MOUSE_WEIGHT; // mg/g

        double currentDieterWeight = STARTING_DIETER_WEIGHT;
        int sodaConsumption = 0; // in kg

        while (currentDieterWeight > DESIRED_DIETER_WEIGHT) {

            sodaConsumption++;
            System.out.println("Current Soda Consumption: " + sodaConsumption + "kg!");
            double weightLost = ((double) sodaConsumption * WEIGHT_LOSS_RATE) / 1000;
            currentDieterWeight = STARTING_DIETER_WEIGHT - weightLost;
            System.out.println("Current Dieter Weight: " + currentDieterWeight + "kg!");
            double sweetenerConsumption = sodaConsumption * SWEETENER_FRACTION_IN_SODA; // in mg
            System.out.println("Current Sweetener Consumption: " + sweetenerConsumption + "mg!");
            double lethalSweetenerAmount = killRate * currentDieterWeight * 1000; // in mg
            System.out.println("Current Lethal Dosage: " + lethalSweetenerAmount + "mg!");

            if (sweetenerConsumption > lethalSweetenerAmount) {

                sodaConsumption--;
                System.out.println("You can only drink " + sodaConsumption + "kg soda!");
                System.out.println("And lose " + ((double) sodaConsumption * WEIGHT_LOSS_RATE) / 1000 + "kg weight!");
                System.out.println("Otherwise you die!");
                return;

            }
        }

        System.out.println("You can drink " + sodaConsumption + "kg soda!");
        System.out.println("And successfully drop to " + DESIRED_DIETER_WEIGHT + "kg!");
        System.out.println("And YOU WILL NOT DIE!");


    }

}
