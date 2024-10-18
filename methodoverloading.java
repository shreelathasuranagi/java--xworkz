/*"Create 9 methods 
Each way of method overloading -> 3 methods
invoke all the methods
Create 1 using variable arguments"
*/

public class methodoverloading {

    public static void main(String[] args) {

        //type 1

        books("Haunting Adeline", "H D Carlton");
        books("Twisted Love", "Ana Huang", 2021);
        books("God of Wrath", "Rina Kent", 2022, 1000000);

        System.out.println("------------------------------------------------------------------------------------------------------------");

        //type 2
        bill(20, 20000);
        bill(10, 40000);
        bill(30, "Sixty thousand only/-");

        System.out.println("------------------------------------------------------------------------------------------------------------");

        anime("Luffy", 19);
        anime(19, "Luffy");
        
        System.out.println("------------------------------------------------------------------------------------------------------------");


        mafia("Jeremy Volkov", "Adrian Volkov");
    }

    //1. Changing the number of parameters
    //popular books, authors and number of copies sold

    public static void books(String bookName, String bookAuthor) {
        System.out.println("The name of the book is " + bookName + " And the author is " + bookAuthor);
    }

    public static void books(String bookName, String bookAuthor, int yearOfRelease) {
        System.out.println("The book " + bookName + " by " + bookAuthor + " was released in the year " + yearOfRelease);
    }

    public static void books(String bookName, String bookAuthor, int yearOfRelease, int soldCopies){
        System.out.println("The book " + bookName + " by " + bookAuthor + " released in the year " + yearOfRelease + " has sold " + soldCopies+ " copies");
    }


    //2. Changing the data types of the arguments
    //Shopping bill

    public static void bill(int noOfClothes, float finalBill){
        System.out.println("The number of clothes purchased is " + noOfClothes + " and the final bill is " + finalBill);
    }

    public static void bill(int noOfClothes, int finalBill){
        System.out.println("The number of clothes purchased is " + noOfClothes + " and the final bill is " + finalBill);
    }

    public static void bill(int noOfClothes, String finalBill){
        System.out.println("The number of clothes purchased is " + noOfClothes + " and the final bill is " + finalBill);
    }

    //3. Changing the Order of the Parameters of Methods

    public static void anime(String kingOfPirates, int years) {
        System.out.println("One piece main character " + kingOfPirates + " is " + years + " years old!");
    }

    public static void anime(int years, String kingOfPirates ) {
        System.out.println(kingOfPirates + " is " + years + " years old!");
    }

    //variable arguments
    public static void mafia(String... mafiaPrince){
        System.out.println("List of Mafia Princes:");
        for (String prince : mafiaPrince) {
            System.out.println(prince);
        }
    }

}