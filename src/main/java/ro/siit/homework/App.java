package ro.siit.homework;

public class App {
    public static void main(String[] args) {

        DishWasher dw1 = new DishWasher("LG");
        System.out.println(dw1.consumption());
        dw1.start();
        System.out.println(dw1.consumption());
        dw1.stop();
        System.out.println(dw1.consumption());
        dw1.stop();
        System.out.println(dw1.consumption());







    }
}
