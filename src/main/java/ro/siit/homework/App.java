package ro.siit.homework;

public class App {
    public static void main(String[] args) {


        VacuumCleaner vc2 = new VacuumCleaner("LG");
        System.out.println(vc2.consumptionPerHour);

        vc2.decreaseLevel();
        System.out.println(vc2);


        vc2.start();
        System.out.println(vc2.consumptionPerHour);
        vc2.increaseLevel();
        System.out.println(vc2.consumptionPerHour);
        vc2.increaseLevel();
        System.out.println(vc2.consumptionPerHour);
        vc2.increaseLevel();
        System.out.println(vc2.consumptionPerHour);

        vc2.decreaseLevel();
        System.out.println(vc2.consumptionPerHour);
        vc2.decreaseLevel();
        System.out.println(vc2.consumptionPerHour);
        vc2.decreaseLevel();
        System.out.println(vc2.consumptionPerHour);
        vc2.decreaseLevel();
        System.out.println(vc2.consumptionPerHour);

    }
}
