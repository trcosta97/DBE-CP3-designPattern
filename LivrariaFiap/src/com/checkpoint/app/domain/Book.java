package com.checkpoint.app.domain;

import com.checkpoint.app.designPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Book implements Observer {
    private String title;
    private String author;
    private int availability;
    private String isbn;
    private List<Student> subscribers = new ArrayList<>();

    public Book(String title, int availability) {
        this.title = title;
        this.availability = availability;
        subscriberNotify();
    }

    public String getTitle() {
        return title;
    }

    public int getAvailability() {
        return availability;
    }


    public void removeBook(){
        this.availability =- 1;
        System.out.println("Livro retirado do acervo");
        subscriberNotify();
    }

    public void addBook(){
        this.availability =+ 1;
        System.out.println("Livro adicionado do acervo");
        subscriberNotify();
    }

    @Override
    public void subscriberNotify() {
        if (this.availability > 0){
                for(Student subscriber : subscribers){
                    System.out.println("Email: livro" + this.title + " disponível!");
                }

            }
        }


    @Override
    public void addSubscriber(Student student) {
        this.subscribers.add(student);
    }

    @Override
    public void removeSubscriber(Student student) {
        this.subscribers.remove(student);
    }

}

