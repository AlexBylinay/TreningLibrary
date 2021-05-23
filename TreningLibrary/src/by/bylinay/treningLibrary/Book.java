package by.bylinay.treningLibrary;

/**
 * This class describes the book object
 * 
 * @author AlexBylinay
 *
 */

public class Book {
	private static final String FORMAT_FOR_PRINT = " book [ %s | %d | %d ]";
	private String author;
	private int ibn;
	private int year;

	 /**
	   * This class fields:
	   * author - author of the book
	   * ibn - identification number of the book
	   * year - year created of the book
	*/
	
	public Book(String author, int ibn, int year) {

		this.author = author;
		this.ibn = ibn;
		this.year = year;

	}

	
	
	public String getAuthor() {
		return author;
	}

	public int getIbn() {
		return ibn;
	}

	public int getYear() {
		return year;
	}
	 
	/**
	 * the method of creating a beautiful
	 *  output to the console
	 * 
	 * @return String for output
	 */
	public String fomatToPrint() {
		return String.format(FORMAT_FOR_PRINT, author, ibn, year);
	}
	

}
