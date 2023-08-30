package domain;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private Student student;
    private LocalDate checkoutDate;
    private LocalDate returnDate;

    public Loan(Book book, Student student) {
        this.book = book;
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public Student getStudent() {
        return student;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
