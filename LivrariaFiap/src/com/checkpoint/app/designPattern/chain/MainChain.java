package com.checkpoint.app.designPattern.chain;

import com.checkpoint.app.domain.Book;
import com.checkpoint.app.domain.Loan;
import com.checkpoint.app.domain.Student;

public class MainChain {

    public static void main(String[] args) {
        Student student = new Student("Thiago", true, 0);
        Student student2 = new Student("Julia", false, 1);
        Student student3 = new Student("Guilherme", true, 3);

        Book book1 = new Book("Caçando Carneiros", 0);
        Book book2 = new Book("1Q84", 3);

        LoanHandler loanHandler = getLoanHandler();

        Loan loan1 = new Loan(book1, student);
        loanHandler.handleLoan(loan1);
        Loan loan2 = new Loan(book1, student2);
        loanHandler.handleLoan(loan2);
        Loan loan3 = new Loan(book2, student3);
        loanHandler.handleLoan(loan3);
        
    }

    private static LoanHandler getLoanHandler(){
        LoanHandler avaibilityHandler = new AvailabilityHandler();
        LoanHandler maxBooksHandler = new MaxBooksHandler();
        LoanHandler trustHandler = new TrustHandler();
        avaibilityHandler.setSucessor(maxBooksHandler);
        maxBooksHandler.setSucessor(trustHandler);
        return avaibilityHandler;
    }


}
