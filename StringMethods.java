/*
1. Go through String class and use the methods done in class

2. Palindrome , secondSmallest

*/

public class StringMethods{

	public static void main(String[] args){

		//concatenation

		String anime = "One";
		String japaneseAnime = anime.concat(" Piece");
		System.out.println("****************Concatenation Operation************");
		System.out.println(japaneseAnime);
		System.out.println("-------------------------------------------------------");

		//upper case

		String novel = "god of wrath";
		String upperNovel = novel.toUpperCase();
		System.out.println("************Upper Case************");
		System.out.println(upperNovel);
		System.out.println("-------------------------------------------------------");

		//lower case

		String name = "JEREMY VOLKOV";
		String nameInLower = name.toLowerCase();
		System.out.println("**************Lower case ***********");
		System.out.println(nameInLower);
		System.out.println("--------------------------------------------------------");


		//trim

		String show = "                  Suits                  ";
		String trimShow = show.trim();
		System.out.println("*************Trim************");
		System.out.println(trimShow);
		System.out.println("--------------------------------------------------------");



		//is empty

		String language = "";
		boolean emptyLanguage = language.isEmpty();
		System.out.println("*************Is Empty**********");
		System.out.println(emptyLanguage);
		System.out.println("--------------------------------------------------------");


		//length

		String sport = "Basketball";
		int lengthOfSport = sport.length();
		System.out.println("**********length*************");
		System.out.println(lengthOfSport);
		System.out.println("--------------------------------------------------------");



		//split(string regex)

		String username = "Adrian Volkov";
		String[] splitUsername = username.split(" ");
		System.out.println("*********split**********");
		System.out.println(splitUsername[0]);
		System.out.println(splitUsername[1]);
		System.out.println("--------------------------------------------------------");



		//starts with

		String car = "Porsche";
		boolean carResult = car.startsWith("P");
		System.out.println("*************Starts With************");
		System.out.println(carResult);
		System.out.println("----------------------------------------------------------");

		//ends with

		String flower = "Rose";
		boolean flowerResult = flower.endsWith("e");
		System.out.println("*************Ends With************");
		System.out.println(flowerResult);
		System.out.println("----------------------------------------------------------");


		//charAt

		String location = "Paris";
		char charIndex = location.charAt(2);
		System.out.println("**************Char At***************");
		System.out.println(charIndex);
		System.out.println("----------------------------------------------------------");


		//palindrome

		String palindrome = "level";  // original string
        char[] palindromeArr = palindrome.toCharArray();  // converting to char array
        String reversedValue = "";  // for storing reversed string

        // Reversing the string
        for (int i = palindromeArr.length - 1; i >= 0; i--) {
            reversedValue = reversedValue + palindromeArr[i];  // building reversed string
        }

        // Checking if the reversed string is equal to the original string
        if (reversedValue.equals(palindrome)) {
            System.out.println(reversedValue);
            System.out.println("The string is a palindrome");
        } else {
            System.out.println(reversedValue);
            System.out.println("The string is not a palindrome");
        }


	}
	

}