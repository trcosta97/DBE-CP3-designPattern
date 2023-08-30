package designPattern.observer;

import domain.Book;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class BookAvailabilityChecker {
    private List<Student> observers = new ArrayList<>();

    private Book book;
    public void addObserver(Student student) {
        this.observers.add(student);
    }

    public void removeObserver(Student student) {
        this.observers.remove(student);
    }

    public void generateTemperate() {

        availability = book.getBookAvailability() > 0;
        System.out.println("");

        notifyObservers();
    }



    private void notifyObservers() {
        for( o : observers){
            if(this.book.getBookAvailability() > )
        };
    }
}