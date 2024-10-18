public class LaptopDetailss {

    // Array named laptopsDetails to store multiple Laptop objects
    static Laptop[] laptopsDetails = new Laptop[8];

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

        // Saving laptop data to the laptopsDetails array
        savedData(laptop1);
        savedData(laptop2);
        savedData(laptop3);
        savedData(laptop4);
        savedData(laptop5);
        savedData(laptop6);
        savedData(laptop7);
        savedData(laptop8);

        // Filter by laptop brand name
        laptopBrandName("Apple");

        // Update the price of a laptop
        updateByPrice("HP", 140000);

        // Delete a laptop by brand name
        boolean result = deleteByName("HP");

        // If the laptop is deleted, display the remaining laptops
        if (result) {
            System.out.println("After deletion, remaining laptops:");
            for (int i = 0; i < laptopsDetails.length; i++) {
                if (laptopsDetails[i] != null) {
                    laptopsDetails[i].displayDetails();
                }
            }
        }
    }

    // Filter laptop by brand name
    public static Laptop laptopBrandName(String brandName) {
        for (int i = 0; i < laptopsDetails.length; i++) {
            if (laptopsDetails[i] != null && laptopsDetails[i].brandName.equals(brandName)) {
                System.out.println("****************************");
                System.out.println("Laptop Found:");
                laptopsDetails[i].displayDetails();
                return laptopsDetails[i];
            }
        }
        System.out.println("****************************");
        System.out.println("Laptop not found");
        return null;
    }

    // Update the price of a laptop by brand name
    public static boolean updateByPrice(String brandName, int newPrice) {
        for (int i = 0; i < laptopsDetails.length; i++) {
            if (laptopsDetails[i] != null && laptopsDetails[i].brandName.equals(brandName)) {
                System.out.println("****************************");
                System.out.println("Before Update:");
                laptopsDetails[i].displayDetails();
                
                laptopsDetails[i].price = newPrice; // Updating the price
                System.out.println("****************************");
                System.out.println("After Update:");
                laptopsDetails[i].displayDetails();
                return true;
            }
        }
        System.out.println("Price update failed.");
        return false;
    }

    // Delete a laptop by brand name
    public static boolean deleteByName(String brandName) {
        for (int i = 0; i < laptopsDetails.length; i++) {
            if (laptopsDetails[i] != null && laptopsDetails[i].brandName.equals(brandName)) {
                System.out.println("****************************");
                System.out.println("Deleting laptop...");
                laptopsDetails[i].displayDetails();
                laptopsDetails[i] = null;  // Setting the object to null
                System.out.println("Laptop deleted successfully.");
                return true;
            }
        }
        System.out.println("Delete failed, laptop not found.");
        return false;
    }

    // Method to save Laptop data into the array
    public static boolean savedData(Laptop laptop) {
        for (int i = 0; i < laptopsDetails.length; i++) {
            if (laptopsDetails[i] == null) {
                laptopsDetails[i] = laptop;  // Saving laptop in the first available slot
                return true;
            }
        }
        System.out.println("Sorry, data could not be inserted! Array is full.");
        return false;
    }
}
