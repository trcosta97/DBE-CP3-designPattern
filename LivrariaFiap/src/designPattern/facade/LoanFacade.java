package designPattern.facade;

import domain.Book;
import domain.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoanFacade {
    private Book book;
    private Student student;

    public LoanFacade(){
        this.book = new Book();
        this.student = new Student();
    }

    public void LoanBook(){
        student.lendBook(book.getTitle());
        book.removeBook();
        System.out.println("Emprestimo realizado.");
    }



}
