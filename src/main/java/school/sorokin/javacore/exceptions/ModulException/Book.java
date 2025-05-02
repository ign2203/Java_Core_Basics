package school.sorokin.javacore.exceptions.ModulException;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



public class Book {
    private String title;
    private String author;
    private int availableCopies;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return this.availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
        if (availableCopies < 0) {
            throw new IllegalArgumentException("Количество копий не может быть меньше 0");
        }
    }

    public Book(String title, String author, int availableCopies) {
        this.author = author;
        this.title = title;
        this.availableCopies = availableCopies;
    }

    public String toString() {
        return "Книга с названием: " + this.title + ". Автор: " + this.author + ". Количество копий: " + this.availableCopies;
    }
}
