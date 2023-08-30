package domain;

public class Student {
    private String name;
    private Boolean trustworthy ;
    private int borrowedBooks;

    public boolean isTrustworthy(){
        return trustworthy;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public Student(String name, Boolean trustworthy, int borrowedBooks) {
        this.name = name;
        this.trustworthy = trustworthy;
        this.borrowedBooks = borrowedBooks;
    }

    public void lendBook(String bookTitle){
        System.out.println("O aluno alugou um livro.");
    }
}
