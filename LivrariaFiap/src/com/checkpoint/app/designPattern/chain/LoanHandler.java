package com.checkpoint.app.designPattern.chain;

import com.checkpoint.app.domain.Loan;

public abstract class LoanHandler {

    protected LoanHandler sucessor;

    public void setSucessor(LoanHandler sucessor){
        this.sucessor = sucessor;
    }

    public abstract void handleLoan(Loan loan);
}
