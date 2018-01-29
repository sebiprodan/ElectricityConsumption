package ro.siit.homework;

public class App {
    public static void main(String[] args) {

        TV tv1 = new TV("Samsung");
        System.out.println(tv1.consumption());
        tv1.start();
        System.out.println(tv1.consumption());
        tv1.increaseB();
        System.out.println(tv1.consumption());
        tv1.stop();
        System.out.println(tv1.consumption());

        VacuumCleaner vc1 = new VacuumCleaner("LG");
        System.out.println(vc1.consumption());
        vc1.start();
        System.out.println(vc1.consumption());
        vc1.increaseLevel();
        System.out.println(vc1.consumption());
        vc1.stop();
        vc1.startBabyNoseVacuum();
        System.out.println(vc1.consumption());
        vc1.stopBabyNoseVacuum();
        System.out.println(vc1.consumption());

        DishWasher dw1 = new DishWasher("Philips");
        System.out.println(dw1.consumption());
        dw1.start();
        System.out.println(dw1.consumption());
        dw1.startHalfLoad(2);
        System.out.println(dw1.consumption());
        dw1.startFullLoad(1);
        System.out.println(dw1.consumption());
        dw1.stop();
        System.out.println(dw1.consumption());

        Dryer dr1 = new Dryer("Sony");
        System.out.println(dr1.consumption());
        dr1.start();
        System.out.println(dr1.consumption());
        dr1.changeAirPower(3);
        System.out.println(dr1.consumption());
        dr1.changeAirPower(1);
        System.out.println(dr1.consumption());
        dr1.stop();
        System.out.println(dr1.consumption());


    }
}
