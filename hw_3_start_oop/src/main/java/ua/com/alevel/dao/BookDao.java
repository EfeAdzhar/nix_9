package ua.com.alevel.dao;

import ua.com.alevel.db.BookDB;
import ua.com.alevel.entity.Book;

public class BookDao {

    public void create(Book book) {
        BookDB.getInstance().create(book);
    }

    public void update(Book book) {
        BookDB.getInstance().update(book);
    }

    public void delete(int id) {
        BookDB.getInstance().delete(id);
    }

    public static int sizeOf() {
        return BookDB.sizeOf();
    }

    public Book findById(int id) {
        return BookDB.getInstance().findById(id);
    }

    public Book[] findAll() {
        return BookDB.getInstance().findAll();
    }
}
