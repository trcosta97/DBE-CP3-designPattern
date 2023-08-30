package designPattern.facade;

import domain.Book;
import domain.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoanFacade {
    private Book book;
    private Student student;

    public LoanFacade(){
        this.book = new Book("Cabeça Fria, Coração Quente", 4);
        this.student = new Student("Deyverson", true, 0);
    }

    public void LoanBook(){
        student.lendBook(book.getTitle());
        book.removeBook();
        System.out.println("Emprestimo realizado.");
    }



}
