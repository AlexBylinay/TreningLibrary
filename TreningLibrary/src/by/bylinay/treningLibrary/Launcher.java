package by.bylinay.treningLibrary;

/**
 * Here, create objects of class and check the 
 * operation of the program in the main() method
 * 
 * @author AlexBylinay
 *
 */

public class Launcher {
	public static void main(String[] arr) {
		
		

		Library alabama = new Library();
		
		/**
		 * create objects of class Book
		 */
		Book var = new Book("Vorobey", 23451, 1986);
		Book blod = new Book("PevicaMaksim", 56775, 1927);
		Book Victory = new Book("Manovar", 23678, 1789);
		Book hollyVar = new Book("Chёrt", 14576, 1997);
		Book sonOfOdin = new Book("Director", 98531, 1970);
		Book valkiriya = new Book("PevicaMaksim", 23980, 1986);

		alabama.addBooks(var);
		alabama.addBooks(blod);
		alabama.addBooks(Victory);
		alabama.addBooks(hollyVar);
		alabama.addBooks(sonOfOdin);
		alabama.addBooks(valkiriya);

		/**
		 * checking the search
		 */
		System.out.println("on author");
		alabama.searchByAuthor("Director").forEach(b -> System.out.println(b.fomatToPrint()));
		System.out.println("on year");
		alabama.searchByYear(1986).forEach(b -> System.out.println(b.fomatToPrint()));
		System.out.println("on IBN");
		alabama.searchByIbn(14576).forEach(b -> System.out.println(b.fomatToPrint()));
	}

}