package ua.com.alevel.db;

import ua.com.alevel.entity.Book;

public class BookDB {

    private final Book[] books;
    private static BookDB instance;
    private static int newBookId = 0;

    public BookDB() {
        books = new Book[100];
    }

    public static BookDB getInstance() {
        if (instance == null) {
            instance = new BookDB();
        }
        return instance;
    }

    public void create(Book book) {
        book.setId(newBookId);
        books[newBookId] = book;
        newBookId++; // ну что же ты ... нельзя индекс использовать в качестве айдишника
    }

    public void update(Book book) {
        Book current = findById(book.getId());
        current.setPrice(book.getPrice());
        current.setBookTitle(book.getBookTitle());
    }

    public void delete(int id) {
        for (int i = id; i < newBookId - 1; i++) {
            books[i] = books[i + 1];
            books[i].setId(books[i].getId() - 1);
        }
        newBookId--;
    }

    public Book findById(int id) {
        return books[id];
    }

    public static int sizeOf() {
        return newBookId;
    }

    public Book[] findAll() {
        return books;
    }
}