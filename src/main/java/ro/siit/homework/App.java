package ro.siit.homework;

public class App {
    public static void main(String[] args) {

        TV tv2 = new TV("Samsung");
        System.out.println(tv2.consumption());
        tv2.start();
        tv2.increaseB();
        System.out.println(tv2.consumption());

    }
}
