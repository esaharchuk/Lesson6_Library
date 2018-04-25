package runner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import by.htp.lsn.classexmpl.runner.Author;
import by.htp.lsn.classexmpl.runner.Book;
import by.htp.lsn.classexmpl.runner.Library;

public class MainApp {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = df.parse("13-01-2001");
		Date date2 = df.parse("06-06-1903");
		Date date3 = df.parse("06-06-1903");
		Date date4 = df.parse("06-06-1903");
		Date date5 = df.parse("06-06-1903");

		Author auth1 = new Author("NameAuthor1", "SurnameAutor1", date1);
		Author auth2 = new Author("NameAuthor2", "SurnameAutor2", date1);
		Author auth3 = new Author("NameAuthor3", "SurnameAutor3", date1);
		Author auth4 = new Author("NameAuthor4", "SurnameAutor4", date1);
		Author auth5 = new Author("NameAuthor5", "SurnameAutor5", date1);

		Book book1 = new Book("Book1", 2006);
		Book book2 = new Book("Book2", 2950);
		Book book3 = new Book("Book3", 2017);

		Book book12 = book1;
		// book1.author = new Author[] {auth1, auth2};

		Author[] authors = new Author[] { auth1, auth2 };
		book1.setAuthors(authors);

		book2.addAuthor(auth5);
		book2.addAuthor(auth4);
		book2.addAuthor(auth3);
		book2.addAuthor(auth4);
		book2.addAuthor(auth5);
		book2.addAuthor(auth3);
		book2.addAuthor(auth4);
		book2.addAuthor(auth5);
		book2.addAuthor(auth3);
		book2.addAuthor(auth4);
		book2.addAuthor(auth5);
		book2.addAuthor(auth3);
		book2.addAuthor(auth4);
		book2.addAuthor(auth5);
		book2.addAuthor(auth3);
		book2.addAuthor(auth4);
		book2.addAuthor(auth5);
		book2.addAuthor(auth3);

		Library library = new Library();
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);
		library.addBook(book2);

		System.out.println();

	}

}
