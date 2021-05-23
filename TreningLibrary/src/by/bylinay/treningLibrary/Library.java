package by.bylinay.treningLibrary;


import java.util.List;
import java.util.stream.Collectors;

/**
 * This class describes the Library
 * Library can receive objects of the book type
 *  and give from
 * 
 * @author AlexBylinay
 *
 */



import java.util.ArrayList;

public class Library {
	
	private List<Book> allBooks;
	
	public Library() {
		this.allBooks =  new ArrayList<>();
	}
	
	
	
	public List<Book> addBooks (Book book){
		allBooks.add(book);
		return allBooks; 
	}
	
	/**
	 * 
	 * @param author
	 * @return List<Book>
	 * get books by one author
	 */
	public List<Book> searchByAuthor(String author) {
		return allBooks.stream().filter(b -> b.getAuthor() == (author)) .collect(Collectors. toList()); 	
	}
	
	/**
	 * 
	 * @param ibn
	 * @return List<Book>
	 * get books by one ibn
	 */
	
	public List<Book> searchByIbn(int ibn) {
		return allBooks.stream().filter(b -> b.getIbn() == (ibn)) .collect(Collectors. toList()); 	
	}
	
	/**
	 * 
	 * @param year
	 * @return  List<Book>
	 *  get books by one year
	 */
	
	public List<Book> searchByYear(int year) {
		return allBooks.stream().filter(b -> b.getYear() == (year)) .collect(Collectors. toList()); 	
	}
	
	
	public void printSelectedBooks () { 
		allBooks.forEach(b -> System.out.println(b.fomatToPrint()));
}



}