public class Laptop {

    // Declaring instance variables for the Laptop class
    String brandName;
    String modelName;
    int ramSize;  // RAM size in GB
    int price;

    // Default constructor with no parameters
    public Laptop() {
        // This constructor gets invoked when no parameters are passed
        System.out.println("Non-Parameterized Constructor");
    }

    // Parameterized constructor with four parameters
    public Laptop(String brandName, String modelName, int ramSize, int price) {
        // 'this' keyword is used to differentiate instance variables from parameters
        this.brandName = brandName;
        this.modelName = modelName;
        this.ramSize = ramSize;
        this.price = price;
    }

    // Method to display the details of the Laptop object
    public void displayDetails() {
        System.out.println("****************************");
        System.out.println("Brand Name: " + brandName);  // Displaying brand name
        System.out.println("Model Name: " + modelName);  // Displaying model name
        System.out.println("RAM Size: " + ramSize + "GB");  // Displaying RAM size
        System.out.println("Laptop Price: " + price);  // Displaying price
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Laptop myLaptop = new Laptop("Dell", "XPS 13", 16, 120000);

        // Displaying the details of the laptop object
        myLaptop.displayDetails();
    }
}
