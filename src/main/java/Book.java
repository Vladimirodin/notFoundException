import ru.netology.notFoundException.Product;

public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price, author);
        this.author = author;
    }
}
