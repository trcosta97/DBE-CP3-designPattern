package designPattern.observer;

public class EmailAlertBookObserver implements BookObserver {
    @Override
    public void update() {
        System.out.println("Livro disponível");
    }
}
