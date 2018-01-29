package ro.siit.homework;

public class DishWasher extends Appliance {

    protected int dishWasherLoad;
    protected int waterHeatLevel;

    public DishWasher(String brandName) {
        this.brandName = brandName;
        this.consumptionPerHour = 0;
    }

    public void start() {
        if (this.consumptionPerHour >= 1) {
            System.out.println("The Dish Washer is already ON");
        } else {
            this.consumptionPerHour = 1;
            this.dishWasherLoad = 0;
            this.waterHeatLevel = 0;

        }
    }

    public void startFullLoad(int waterHeatLevel) {
        this.waterHeatLevel = waterHeatLevel;
        if (this.consumptionPerHour == 0) {
            System.out.println("The Dish Washer is OFF. Please start it empty before using it half or full loaded ");
        } else if (this.consumptionPerHour > 1) {
            System.out.println(" The Dish Washer is already ON");
        } else {
            switch (waterHeatLevel) {
                case 1:
                    this.consumptionPerHour = 950;
                    break;
                case 2:
                    this.consumptionPerHour = 1150;
                    break;
                case 3:
                    this.consumptionPerHour = 1500;
                    break;
                default:
                    System.out.println("There are only 3 water heat levels. Please use on of these 3 levels.");
            }
            this.dishWasherLoad = 2;

        }
    }

    public void startHalfLoad(int waterHeatLevel) {
        this.waterHeatLevel = waterHeatLevel;
        if (this.consumptionPerHour > 750) {
            System.out.println("The Dish Washer is already ON and full loaded. Please turn it OFF if you want to use it half loaded.");
        } else if (this.consumptionPerHour == 0) {
            System.out.println("The Dish Washer is OFF. Please start it empty before using it half or full loaded ");
        } else {
            switch (waterHeatLevel) {
                case 1:
                    this.consumptionPerHour = 475;
                    break;
                case 2:
                    this.consumptionPerHour = 575;
                    break;
                case 3:
                    this.consumptionPerHour = 750;
                    break;
                default:
                    System.out.println("There are only 3 water heat levels. Please use one of these 3 levels.");
            }
            this.dishWasherLoad = 1;
        }
    }

    public void stop() {
        if (this.consumptionPerHour == 0) {
            System.out.println(" The Dish Washer is already OFF");
        } else {
            this.consumptionPerHour = 0;
            this.dishWasherLoad = 0;
            this.waterHeatLevel = 0;

        }
    }

    public String consumption() {
        return this.brandName + " Dish Washer: " + this.consumptionPerHour + "Wh";
    }
}
