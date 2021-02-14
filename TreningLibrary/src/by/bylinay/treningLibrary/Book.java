package by.bylinay.treningLibrary;

public class Book {
	private static final String FORMAT_FOR_PRINT = " book [ %s | %d | %d ]";
	private String author;
	private int ibn;
	private int year;

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

	public String fomatToPrint() {
		return String.format(FORMAT_FOR_PRINT, author, ibn, year);
	}
}
