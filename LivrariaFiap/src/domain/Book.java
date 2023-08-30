package domain;

public class Book {
    private String title;
    private String author;
    private int bookAvailability;

    public String getTitle() {
        return title;
    }

    public int getBookAvailability() {
        return bookAvailability;
    }

    private String isbn;
    private int availability;

    public void removeBook(){
        this.availability =- 1;
        System.out.println("Livro retirado do acervo");
    }
}

