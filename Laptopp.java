public class Laptopp {

    // Attributes of the Laptop class
    String brandName;
    String modelName;
    int ramSize; // in GB
    int price;   // in currency units

    // Non-parameterized constructor
    public Laptopp() {
        System.out.println("Non-parameterized Constructor");
    }

    // Parameterized constructor
    public Laptopp(String brandName, String modelName, int ramSize, int price) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.ramSize = ramSize;
        this.price = price;
    }

    // Method to display the details of the laptop
    public void displayDetails() {
        System.out.println("****************************");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Laptop Price: " + price);
    }
}
