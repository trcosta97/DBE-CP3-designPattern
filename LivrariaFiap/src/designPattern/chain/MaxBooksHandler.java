package designPattern.chain;

import domain.Loan;

public class MaxBooksHandler extends LoanHandler{
    @Override
    public void handleLoan(Loan loan) {
        if(loan.getStudent().getBorrowedBooks() >= 3){
            System.out.println("Estudante já está com o máximo de livros emprestados");
        }else if(sucessor != null){
            sucessor.handleLoan(loan);
        }
    }
}
