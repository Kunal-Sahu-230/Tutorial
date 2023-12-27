package com.example.goodreads;

import java.util.*;
import com.example.goodreads.BookRepository;
import com.example.goodreads.Book;

public class BookService implements BookRepository {
    private HashMap<Integer, Book> hmap = new HashMap<>();

    public BookService() {
        Book b1 = new Book(1, "Harry Potter", "harry_potter.jpg");
        Book b2 = new Book(1, "Rise", "rise.jpeg");
        hmap.put(b1.getId(), b1);
        hmap.put(b2.getId(), b2);
    }

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> booksCollection = hmap.values();
        ArrayList<Book> books = new ArrayList<>(booksCollection);
        return books;
    }
}