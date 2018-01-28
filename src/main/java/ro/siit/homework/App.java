package ro.siit.homework;

/**
 * HOMEWORK_JavaOOPConcepts_II
 * Compute electricity consumption / hour for household appliances.
 * <p>
 * <p>
 * All appliances can be turned on and off, and the consumption / hour value can be checked.
 * <p>
 * Every appliance has specific behaviors and features which when turned on can consume more electricity.
 * <p>
 * <p>
 * <p>
 * The following code should be similar to the one in your application:
 * <p>
 * <p>
 * <p>
 * Appliance a = new Appliance(); // This must NOT compile
 * <p>
 * Appliance fridge = new SamsungSmartFridge("SN-SMSG009"); // This must compile - serial number is passed via constructor
 * <p>
 * float consumption = fridge.getConsumptionPerHour();// consumption should be 0
 * <p>
 * fridge.start();
 * <p>
 * float consumption = fridge.getConsumptionPerHour();// consumption should be 10w
 * <p>
 * fridge.turnOnPowerFreezer();
 * <p>
 * float consumption = fridge.getConsumptionPerHour();// consumption should be 20w
 * <p>
 * <p>
 * <p>
 * IRobotVacuum iRobot = new IRobotVacuum600Series();
 * <p>
 * Appliance someVacuum = (Appliance) iRobot; // upcast
 * <p>
 * someVacuum.start(); // starts the irobot
 * <p>
 * iRobot.doQuickClean(); // the robot might have a ThoroughClean function, or CleanPetHair function, etc.
 * <p>
 * iRobot.stop();
 * <p>
 * <p>
 * <p>
 * Task (if not implemented - you receive penalties):
 * <p>
 * Write at least 1 interface.
 * <p>
 * Write at least 1 abstract class.
 * <p>
 * Write at least 4 different appliances that belong to different appliance categories
 * <p>
 * - e.g LG Television, Philips Blender, HP Notebook, Samsung Fridge
 * <p>
 * - don't write LG Television, Sharp Television, Samsung Television
 * <p>
 * Each appliance should have at least one behavior controlled by one or more methods that the other 3 appliances don't have.
 */

public class App {
    public static void main(String[] args) {

    }
}
