package ro.siit.homework;

public class VacuumCleaner extends Appliance {

    private int vacuumLevel;

    public VacuumCleaner(String brandName) {
        this.brandName = brandName;
        this.vacuumLevel = 0;
        this.consumptionPerHour = 0;
    }

    @Override
    public String toString() {
        return this.brandName + " Vacuum Cleaner, beeing set to vacuum level " + vacuumLevel + " will have the electricity consumption/hour: " + this.consumptionPerHour + "w";
    }

    public void start() {
        this.consumptionPerHour = 500;
        this.vacuumLevel = 1;

    }

    public void stop() {
        this.consumptionPerHour = 0;
        this.vacuumLevel = 0;
    }

    public void increaseLevel() {
        if (this.vacuumLevel >= 1 && this.vacuumLevel <= 2) {
            this.vacuumLevel = this.vacuumLevel + 1;
            this.consumptionPerHour = this.consumptionPerHour + 500;
        } else if (this.vacuumLevel < 1) {
            this.vacuumLevel = 0;
            this.consumptionPerHour = 0;
        } else if (this.vacuumLevel >= 3) {
            this.vacuumLevel = 3;
            this.consumptionPerHour = 1500;
        }
    }

    public void decreaseLevel() {
        if (this.vacuumLevel <= 3 && this.consumptionPerHour > 0) {
            this.vacuumLevel = this.vacuumLevel - 1;
            this.consumptionPerHour = this.consumptionPerHour - 500;
        } else if (this.vacuumLevel < 1) {
            this.vacuumLevel = 0;
            this.consumptionPerHour = 0;
        }
    }

    public double consumption() {
        return this.consumptionPerHour;
    }
}
