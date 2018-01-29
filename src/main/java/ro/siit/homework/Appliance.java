package ro.siit.homework;

public abstract class Appliance implements ApplianceOnOff {

    protected double consumptionPerHour;
    protected String brandName;

    protected abstract String consumption();
}
