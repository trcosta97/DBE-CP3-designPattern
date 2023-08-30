package designPattern.chain;

import domain.Loan;

public class AvailabilityHandler extends LoanHandler {
    @Override
    public void handleLoan(Loan loan) {
        if(loan.getBook().getAvailability() < 0){
            System.out.println("Livro indisponível");
        }else if(sucessor != null){
            sucessor.handleLoan(loan);
        }
    }
}
