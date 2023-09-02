import com.checkpoint.app.designPattern.facade.LoanFacade;
import com.checkpoint.app.domain.Book;
import com.checkpoint.app.domain.Library;
import com.checkpoint.app.domain.Student;

public class Main {
    public static void main(String[] args) {

        Library library = Library.getInstance();

        Student student = new Student("Thiago", true, 0);
        Student student2 = new Student("Julia", false, 1);
        Student student3 = new Student("Guilherme", true, 3);

        Book book1 = new Book("Caçando Carneiros", 0);
        Book book2 = new Book("1Q84", 1);

        library.addBook(book1);
        library.addBook(book2);

        book1.addSubscriber(student);
        book1.addSubscriber(student2);
        book2.addSubscriber(student3);
        book2.addSubscriber(student);

        book1.addBook();
        book1.addBook();
        book2.removeBook();
        book2.addBook();
    }
}