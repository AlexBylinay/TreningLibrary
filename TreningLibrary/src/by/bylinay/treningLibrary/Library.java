package by.bylinay.treningLibrary;


import java.util.List;
import java.util.stream.Collectors;


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
	public List<Book> searchByAuthor(String author) {
		return allBooks.stream().filter(b -> b.getAuthor() == (author)) .collect(Collectors. toList()); 	
	}
	
	public List<Book> searchByIbn(int ibn) {
		return allBooks.stream().filter(b -> b.getIbn() == (ibn)) .collect(Collectors. toList()); 	
	}
	
	
	public List<Book> searchByYear(int year) {
		return allBooks.stream().filter(b -> b.getYear() == (year)) .collect(Collectors. toList()); 	
	}
	
	
	public void printSelectedBooks () { 
		allBooks.forEach(b -> System.out.println(b.fomatToPrint()));
}


	public void addi(List<Book> allBooks) {
		
		//manowar
	}
}