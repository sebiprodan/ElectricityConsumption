package ro.siit.homework;

public class TV extends Appliance {

    private int brightnessLevel;
    private int volumeLevel;

    public TV(String brandName) {
        this.brandName = brandName;
        this.brightnessLevel = 0;
        this.volumeLevel = 0;
        this.consumptionPerHour = 0;

    }

    @Override
    public String toString() {
        return this.brandName + "TV" + " with the brightness level: " + this.brightnessLevel + " & " + "the volume level: " + this.volumeLevel + " will have the electricity consumption/hour: " + this.consumptionPerHour + "w";
    }

    public void stop() {

        this.brightnessLevel = 0;
        this.volumeLevel = 0;
        this.consumptionPerHour = 0;


    }

    public void start() {

        this.consumptionPerHour = 40;
        this.brightnessLevel = 50;
        this.volumeLevel = 10;
    }

    public void increaseV() {
        if (this.volumeLevel <= 99 && this.consumptionPerHour > 0) {
            this.volumeLevel = this.volumeLevel + 1;
            this.consumptionPerHour = this.consumptionPerHour + 0.25;
        } else if (this.volumeLevel > 99) {
            this.volumeLevel = 100;
        } else if (this.consumptionPerHour <= 0) {
            this.consumptionPerHour = 0;
        }

    }

    public void decreaseV() {
        if (this.volumeLevel <= 100 && this.consumptionPerHour > 0) {
            this.volumeLevel = this.volumeLevel - 1;
            this.consumptionPerHour = this.consumptionPerHour - 0.25;
        } else if (this.volumeLevel <= 0) {
            this.volumeLevel = 0;
        } else if (this.consumptionPerHour <= 0) {
            this.consumptionPerHour = 0;
        }
    }


    public void increaseB() {
        if (this.brightnessLevel <= 90 && this.consumptionPerHour > 0) {
            this.brightnessLevel = this.brightnessLevel + 10;
            this.consumptionPerHour = this.consumptionPerHour + 0.5;
        } else if (this.brightnessLevel >= 100) {
            this.brightnessLevel = 100;
        }else if (this.consumptionPerHour <= 0){
            this.consumptionPerHour = 0;
        }
    }

    public void decreaseB() {
        if (this.brightnessLevel <= 100 && this.consumptionPerHour > 0) {
            this.brightnessLevel = this.brightnessLevel - 10;
            this.consumptionPerHour = this.consumptionPerHour - 0.5;
        } else if (this.brightnessLevel < 10) {
            this.brightnessLevel = 0;
        } else if (this.consumptionPerHour <= 0) {
            this.consumptionPerHour = 0;
        }
    }

    public String consumption() {
        return this.brandName + " TV: " + this.consumptionPerHour + "Wh";
    }

}

