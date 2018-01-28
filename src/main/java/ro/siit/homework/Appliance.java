package ro.siit.homework;

public abstract class Appliance implements ApplianceOnOff {

    protected double consumptionPerHour;
    protected String name;

    protected abstract double consumption();

    protected void increaseV() {
    }

    protected void decreaseV() {
    }

    protected void increaseB(){
    }

    protected void decreaseB(){
    }
}
