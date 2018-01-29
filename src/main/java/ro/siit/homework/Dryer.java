package ro.siit.homework;

public class Dryer extends Appliance {

    protected int airHeatLevel;
    protected int airPower;

    public Dryer(String brandName) {
        this.brandName = brandName;
        this.consumptionPerHour = 0;
        this.airPower = 0;
        this.airHeatLevel = 0;
    }

    public void start() {
        if (this.consumptionPerHour > 0) {
            System.out.println("The Dryer is already ON");
        } else {
            this.consumptionPerHour = 250;
            this.airHeatLevel = 1;
            this.airPower = 1;
        }
    }

    public void changeAirPower(int airPower) {
        this.airPower = airPower;
        if (this.consumptionPerHour == 0) {
            System.out.println("The Dryer is OFF. Please turn it ON");
        } else if (this.airPower > 3 || this.airPower < 0) {
            System.out.println("This Dryer has only 3 air power levels. Please use one of these 3");
        } else switch (airPower) {
            case 1:
                this.consumptionPerHour = 250;
                break;
            case 2:
                this.consumptionPerHour = 500;
                break;
            case 3:
                this.consumptionPerHour = 750;
                break;
        }
    }

    public void stop() {
        if (this.consumptionPerHour == 0) {
            System.out.println("The Dryer is already OFF");
        } else {
            this.consumptionPerHour = 0;
            this.airHeatLevel = 0;
            this.airPower = 0;
        }
    }

    public String consumption() {
        return this.brandName + " Dryer: " + this.consumptionPerHour + "Wh";
    }
}
