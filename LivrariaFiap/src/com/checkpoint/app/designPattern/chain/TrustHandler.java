package com.checkpoint.app.designPattern.chain;

import com.checkpoint.app.domain.Loan;

public class TrustHandler extends LoanHandler{
    @Override
    public void handleLoan(Loan loan) {
        if (!loan.getStudent().isTrustworthy()) {
            System.out.println("Aluno não é confiável");
        } else if (sucessor != null) {
            sucessor.handleLoan(loan);
        }
    }
}
