package by.htp.lsn.classexmpl.runner;

public class Library {

	private Book[] books;
	private int booksCounter;

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public void addBook(Book book) {
		if (this.books != null) {
			if (booksCounter < books.length) {
				books[booksCounter] = book;
				booksCounter++;
			} else {
				Book[] books = new Book[this.booksCounter + 1];
				for (int i = 0; i < this.books.length; i++) {
					books[i] = this.books[i];
				}
				this.books = books;
				this.books[booksCounter] = book;
				booksCounter++;
			}
		} else {
			this.books = new Book[5];
			this.books[0] = book;
			booksCounter++;
		}
	}

}
