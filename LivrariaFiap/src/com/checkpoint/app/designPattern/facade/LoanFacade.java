package com.checkpoint.app.designPattern.facade;

import com.checkpoint.app.domain.Book;
import com.checkpoint.app.domain.Student;

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
