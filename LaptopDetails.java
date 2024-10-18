public class LaptopDetails {

    // Array to store details of multiple Laptop objects
    static Laptop[] laptopsDetails = new Laptop[8];  // Assuming we want to store details of 8 laptops

    public static void main(String[] args) {

        // Creating Laptop objects with brand, model, RAM size, and price
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 16, 120000);
        Laptop laptop2 = new Laptop("HP", "Spectre x360", 16, 135000);
        Laptop laptop3 = new Laptop("Apple", "MacBook Air", 8, 95000);
        Laptop laptop4 = new Laptop("Lenovo", "ThinkPad X1", 16, 140000);
        Laptop laptop5 = new Laptop("Asus", "ZenBook 14", 16, 110000);
        Laptop laptop6 = new Laptop("Acer", "Swift 5", 8, 80000);
        Laptop laptop7 = new Laptop("MSI", "Prestige 14", 32, 160000);
        Laptop laptop8 = new Laptop("Razer", "Blade Stealth", 16, 180000);

        // Saving the data into the laptopsDetails array
        savedData(laptop1);
        savedData(laptop2);
        savedData(laptop3);
        savedData(laptop4);
        savedData(laptop5);
        savedData(laptop6);
        savedData(laptop7);
        savedData(laptop8);

        // Displaying the details of all laptops
        for (int i = 0; i < laptopsDetails.length; i++) {
            if (laptopsDetails[i] != null) {
                laptopsDetails[i].displayDetails();  // Calling displayDetails() to print laptop info
            }
        }
    }

    // Method to save Laptop data into the array
    public static boolean savedData(Laptop laptop) {
        // Looping through the array to find an empty (null) spot
        for (int i = 0; i < laptopsDetails.length; i++) {
            if (laptopsDetails[i] == null) {
                // Inserting the laptop into the first available null position
                laptopsDetails[i] = laptop;
                return true;  // Successfully saved
            }
        }
        // If the array is full, print a message and return false
        System.out.println("Sorry, data could not be inserted! Array is full.");
        return false;
    }
}
