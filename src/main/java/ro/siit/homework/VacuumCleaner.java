package ro.siit.homework;

public class VacuumCleaner extends Appliance {

    private int vacuumLevel;

    public VacuumCleaner(String brandName) {
        this.brandName = brandName;
        //this.vacuumLevel = 0;
        //this.consumptionPerHour = 0;
    }

    @Override
    public String toString() {
        if (this.consumptionPerHour != 100) {
            return this.brandName + " Vacuum Cleaner, being set to vacuum level " + vacuumLevel + " will have the electricity consumption/hour: " + this.consumptionPerHour + "w";
        } else
            return this.brandName + " Vacuum Cleaner, having the Baby Nose Vacuum feature activated will have the electricity consumption/hour: " + this.consumptionPerHour + "w";
    }

    public void start() {
        if (this.consumptionPerHour == 100) {
            System.out.println("Please turn OFF the Baby Nose Vacuum feature first.");
        } else
            this.consumptionPerHour = 500;
            this.vacuumLevel = 1;

    }

    public void stop() {
        this.consumptionPerHour = 0;
        this.vacuumLevel = 0;
    }

    public void increaseLevel() {
        if (this.vacuumLevel >= 1 && this.consumptionPerHour != 100) {
            this.vacuumLevel = this.vacuumLevel + 1;
            this.consumptionPerHour = this.consumptionPerHour + 500;
        } else if (this.vacuumLevel < 1 && this.consumptionPerHour == 100) {
            this.vacuumLevel = 0;
            this.consumptionPerHour = 100;
            System.out.println("The Baby Nose Vacuum is ON. No  vacuum level increase can be made");
        } else if (this.vacuumLevel >= 3) {
            this.vacuumLevel = 3;
            this.consumptionPerHour = 1500;
        }
    }

    public void decreaseLevel() {
        if (this.vacuumLevel >= 1 && this.vacuumLevel <= 3) {
            this.vacuumLevel = this.vacuumLevel - 1;
            this.consumptionPerHour = this.consumptionPerHour - 500;
        } else if (this.vacuumLevel < 1 && this.consumptionPerHour == 100) {
            this.vacuumLevel = 0;
            this.consumptionPerHour = 100;
            System.out.println("The Baby Nose Vacuum is ON. No  vacuum level decrease can be made");
        } else if (this.vacuumLevel < 1 && this.consumptionPerHour == 0) {
            stop();
        }
    }

    public void startBabyNoseVacuum() {
        if (this.vacuumLevel == 0 && this.consumptionPerHour == 0) {
            this.vacuumLevel = 0;
            this.consumptionPerHour = 100;
        } else if (this.consumptionPerHour > 100) {
            System.out.println("Please turn OFF the vacuum cleaner before activating this feature");
        } else if (this.consumptionPerHour == 100) {
            System.out.println("The Baby Nose Vacuum feature is already ON");
        }
    }

    public void stopBabyNoseVacuum() {
        if (this.vacuumLevel == 0 && this.consumptionPerHour == 100) {
            this.consumptionPerHour = 0;
        } else
            System.out.println("The Baby Nose Vacuum feature is already OFF");
    }

    public String consumption() {
        return this.brandName + " Vacuum Cleaner: " + this.consumptionPerHour + "Wh";
    }
}
