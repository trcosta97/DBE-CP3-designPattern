package domain;

public class Book {
    private String title;
    private String author;
    private int availability;
    private String isbn;

    public Book(String title, int availability) {
        this.title = title;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailability() {
        return availability;
    }


    public void removeBook(){
        this.availability =- 1;
        System.out.println("Livro retirado do acervo");
    }
}

