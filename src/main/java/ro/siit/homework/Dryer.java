package ro.siit.homework;

public class Dryer extends Appliance {

    public void stop() {

    }

    public void start() {

    }

    public String consumption() {
        return this.brandName + " Dryer: " + this.consumptionPerHour;
    }
}
