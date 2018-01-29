package ro.siit.homework;

public class App {
    public static void main(String[] args) {

        Dryer dr1 = new Dryer("Philips");
        System.out.println(dr1.consumption());

        dr1.decreaseAirPower();
        dr1.stop();


    }
}
