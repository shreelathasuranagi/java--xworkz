/*"Create a class with 4 states and 3 behaviours
Declare No param constructor and Params constructor to initialize values
Create 3 objects using no params
Create 7 objects using params " */


public class Appliance {

    String brandName;
    String applianceType;
    String modelNo;
    int powerConsumption; // in watts
    String energyRating;  // e.g., 5-star, 4-star

    // No parameterized constructor
    public Appliance() {

        System.out.println("****************************");

        System.out.println("No parameterized Constructor");

        System.out.println("****************************");
    }

    // Parameterized constructor
    public Appliance(String brandName, String applianceType, String modelNo, int powerConsumption, String energyRating) {

        this.brandName = brandName;
        this.applianceType = applianceType;
        this.modelNo = modelNo;
        this.powerConsumption = powerConsumption;
        this.energyRating = energyRating;
    }

    // Static methods
    public static void turnOn() {
        System.out.println("Appliance turned on.");
    }

    public static void turnOff() {
        System.out.println("Appliance turned off.");
    }

    public static void powerSaveMode() {
        System.out.println("Power saving mode activated.");
    }

    // Method to display appliance details
    public void applianceDetails() {

        System.out.println("Brand name: " + brandName);
        System.out.println("Appliance Type: " + applianceType);
        System.out.println("Model No: " + modelNo);
        System.out.println("Power Consumption: " + powerConsumption + " watts");
        System.out.println("Energy Rating: " + energyRating);
    }

}
