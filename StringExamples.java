/*
"Create 10 string using literals and 10 strings using new keyword, compare string values using .equals 
Try to reverse a string"

*/


public class StringExamples{
	

	public static void main(String[] args){

		//strings using literals

		String anime = "One piece";
		String name = "Jeremy";
		String show = "Suits";
		String book = "God of Wrath";
		String flower = "Rose";
		String city = "Paris";
		String language = "Python";
		String movie = "Clueless";
		String car = "Porsche";
		String sport = "Basketball";


		//Strings using "new" keyword

		String japaneseAnime = new String("One piece");
		String userName = new String("Jeremy");
		String tvShow = new String("Suits");
		String novel = new String("God of Wrath");
		String blossom = new String("Rose");
		String location = new String("Paris");
		String programmingLanguage = new String("Python");
		String film = new String("Clueless");
		String vehicle = new String("Porsche");
		String game = new String("Basketball");

		//Comparing string values using "equals" 

		System.out.println(anime.equals(japaneseAnime));
		System.out.println(name.equals(userName));
		System.out.println(show.equals(tvShow));
		System.out.println(book.equals(novel));
		System.out.println(flower.equals(blossom));
		System.out.println(city.equals(location));
		System.out.println(language.equals(programmingLanguage));
		System.out.println(movie.equals(film));
		System.out.println(car.equals(vehicle));
		System.out.println(sport.equals(game));


		System.out.println("----------------------------------------------------------");

		//reversing a string

		char[] reverseString = anime.toCharArray();

		//string as it is

		for (int i = 0; i < reverseString.length - 1; i++){

			System.out.println(reverseString[i]);

		}
			System.out.println("----------------------------------------------------------");

		//reverse

		for (int i = reverseString.length - 1; i >= 0; i--) {

			System.out.println(reverseString[i]);
			
		}
			System.out.println("----------------------------------------------------------");


	}

}