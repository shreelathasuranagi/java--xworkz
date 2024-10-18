public class ApplianceInfo {
    public static void main(String[] args) {
        
        // No parameterized constructors
        Appliance appliance1 = new Appliance();
        Appliance appliance2 = new Appliance();
        Appliance appliance3 = new Appliance();

        // Parameterized constructors
        Appliance appliance11 = new Appliance("Samsung", "Refrigerator", "RF28K9070SR", 800, "5-star");
        Appliance appliance12 = new Appliance("LG", "Washing Machine", "WM3488HW", 1200, "4-star");
        Appliance appliance13 = new Appliance("Whirlpool", "Microwave", "WMC20005YB", 600, "3-star");
        Appliance appliance14 = new Appliance("Philips", "Air Fryer", "HD9741/99", 1400, "4-star");
        Appliance appliance15 = new Appliance("Bosch", "Dishwasher", "SHEM63W55N", 1200, "5-star");
        Appliance appliance16 = new Appliance("Panasonic", "Air Conditioner", "CS/CU-5RKYF", 2000, "5-star");
        Appliance appliance17 = new Appliance("Godrej", "Chest Freezer", "CF140", 100, "3-star");

        appliance11.applianceDetails();
        System.out.println("****************************");

        appliance12.applianceDetails();
        System.out.println("****************************");

        appliance13.applianceDetails();
        System.out.println("****************************");

        appliance14.applianceDetails();
        System.out.println("****************************");

        appliance15.applianceDetails();
        System.out.println("****************************");

        appliance16.applianceDetails();
        System.out.println("****************************");

        appliance17.applianceDetails();
    }
}
