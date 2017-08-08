package com.neelima.services;

import java.util.List;

import com.neelima.model.BookModel;

public interface IBookService {

	public List<BookModel> getBookDetails();

	public BookModel insertBookDetails(BookModel bookModel);

	public BookModel updateBookDetails(BookModel bookModel);

	public BookModel deleteBookDetails(String title);

}
