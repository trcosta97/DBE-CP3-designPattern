package com.checkpoint.app.domain;


import java.util.ArrayList;
import java.util.List;

public class Library {

    private static Library instance;
    private List<Book> books = new ArrayList<>();

    private Library(){
    }

    public static synchronized Library getInstance(){
        if(instance == null){
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void loanBook(Book book, Student student){

    }
}
