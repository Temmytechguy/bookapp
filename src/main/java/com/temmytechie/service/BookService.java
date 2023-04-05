package com.temmytechie.service;

import com.temmytechie.entity.Book;
import com.temmytechie.interfaceImpl.NumberGenerator;

/**
 * @author TemmyTechie
 */

public class BookService {

    private NumberGenerator generator;

    public BookService(NumberGenerator generator) {
        this.generator = generator;
    }

    public Book createBook(String title)
    {
        return new Book(title, generator.generateNumber());
    }
}
