package com.neelima.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.neelima.model.BookModel;

@Component
public class CBookService implements IBookService {

	public List<BookModel> getBookDetails() {

		List<BookModel> bookList = new ArrayList<BookModel>();

		BookModel bookmodel = new BookModel();
		bookmodel.setTitle("HopeLess");
		bookmodel.setAuthor("Colleen Hoover");
		bookmodel.setPublisher("Simon & Schuster ");
		bookmodel.setCost(10.99);
		bookList.add(bookmodel);

		BookModel bookmodel2 = new BookModel();
		bookmodel2.setTitle("Losing Hope");
		bookmodel2.setAuthor("Colleen Hoover");
		bookmodel2.setPublisher("Simon & Schuster ");
		bookmodel2.setCost(9.99);

		bookList.add(bookmodel2);

		BookModel bookmodel3 = new BookModel();
		bookmodel3.setTitle("Beautiful Disaster");
		bookmodel3.setAuthor("Jamie McGuire");
		bookmodel3.setPublisher("Pearson Education");
		bookmodel3.setCost(12.99);

		bookList.add(bookmodel3);

		BookModel bookmodel4 = new BookModel();
		bookmodel4.setTitle("Lost Girl");
		bookmodel4.setAuthor("Chanda Hahn");
		bookmodel4.setPublisher("Bloomsbury ");
		bookmodel4.setCost(7.99);

		bookList.add(bookmodel4);

		BookModel bookmodel5 = new BookModel();
		bookmodel5.setTitle("The Girls");
		bookmodel5.setAuthor("Emma Cline");
		bookmodel5.setPublisher("Bloomsbury ");
		bookmodel5.setCost(7.99);

		bookList.add(bookmodel5);

		BookModel bookmodel6 = new BookModel();
		bookmodel6.setTitle("Walking Disaster");
		bookmodel6.setAuthor("Jamie McGuire");
		bookmodel6.setPublisher("HarperCollins");
		bookmodel6.setCost(15.99);

		bookList.add(bookmodel6);

		return bookList;
	}

	public BookModel insertBookDetails(BookModel bookModel) {
		List<BookModel> booksList = getBookDetails();
		booksList.add(bookModel);
		return bookModel;
	}

	public BookModel updateBookDetails(BookModel bookModel) {
		return null;
	}

	public BookModel deleteBookDetails(String title) {
		List<BookModel> bookList = new ArrayList<BookModel>();
		for (BookModel book : bookList) {
			if (book.getTitle().equals(title)) {
			}
		}
		return null;
	}

}
