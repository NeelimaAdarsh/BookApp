package com.neelima.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.neelima.model.BookModel;
import com.neelima.services.CBookService;

@RestController
public class BookController {
	
	@Autowired
	CBookService bookService;

	@RequestMapping(value = "/books", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BookModel> getBookDetails() {
		List<BookModel> bookModel = bookService.getBookDetails();
		return bookModel;

	}
	@RequestMapping(value = "/books/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public BookModel insertBookDetails(BookModel bookModel) {
		BookModel bookDetails = null;
		bookDetails = bookService.insertBookDetails(bookDetails);
		return bookModel;
	}
	
	@RequestMapping(value = "/books/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public BookModel updateBookDetails(BookModel bookModel) {
		BookModel updatemodel = bookService.updateBookDetails(bookModel);
		return updatemodel;

	}
	@RequestMapping(value = "/books/delete/{title}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	public BookModel deleteBookDetails(@PathVariable String title) {
		BookModel bookModel = bookService.deleteBookDetails(title);
		return bookModel;
	}

}
