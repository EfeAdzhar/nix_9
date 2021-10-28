package ua.com.alevel.controller;
import ua.com.alevel.entity.Book;
import ua.com.alevel.service.BookService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class BookController {

        private final BookService bookService = new BookService();

        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("select your option");
            String position;
            try {
                runNavigation();
                while ((position = reader.readLine()) != null) {
                    crud(position, reader);
                    position = reader.readLine();
                    if (position.equals("0")) {
                        System.exit(0);
                    }
                    crud(position, reader);
                }
            } catch (IOException e) {
                System.out.println("problem: = " + e.getMessage());
            }
        }

        private static void runNavigation() {
            System.out.println();
            System.out.println("if you want create book, please enter 1");
            System.out.println("if you want update book, please enter 2");
            System.out.println("if you want delete book, please enter 3");
            System.out.println("if you want findById book, please enter 4");
            System.out.println("if you want findAll books, please enter 5");
            System.out.println("if you want exit, please enter 0");
            System.out.println();
        }

        private void crud(String position, BufferedReader reader) {
            switch (position) {
                case "1":
                    create(reader);
                    break;
                case "2":
                    update(reader);
                    break;
                case "3":
                    delete(reader);
                    break;
                case "4":
                    findById(reader);
                    break;
                case "5":
                    findAll();
                    break;
            }
            runNavigation();
        }

        private void create(BufferedReader reader) {
            try {
                System.out.println("Please, enter your book title");
                String bookTitle = reader.readLine();
                System.out.println("Please, enter your price");
                String ageString = reader.readLine();
                int price = Integer.parseInt(ageString);
                Book book = new Book();
                book.setPrice(price);
                book.setBookTitle(bookTitle);
                bookService.create(book);
            } catch (IOException e) {
                System.out.println("problem: = " + e.getMessage());
            }
        }

        private void update(BufferedReader reader) {
            try {
                System.out.println("Please, enter id");
                String idString = reader.readLine();
                System.out.println("Please, enter your book title");
                String bookTitle = reader.readLine();
                System.out.println("Please, enter your price");
                String ageString = reader.readLine();
                int price = Integer.parseInt(ageString);
                int id = Integer.parseInt(idString);
                Book book = new Book();
                book.setId(id);
                book.setPrice(price);
                bookService.update(book);
            } catch (IOException e) {
                System.out.println("problem: = " + e.getMessage());
            }
        }

        private void delete(BufferedReader reader) {
            try {
                System.out.println("Please, enter id");
                String idString = reader.readLine();
                int id = Integer.parseInt(idString);
                bookService.delete(id);
            } catch (IOException e) {
                System.out.println("problem: = " + e.getMessage());
            }
        }

        private void findById(BufferedReader reader) {
            try {
                System.out.println("Please, enter id");
                String idString = reader.readLine();
                int id = Integer.parseInt(idString);
                Book book = bookService.findById(id);
                System.out.println("user = " + book);
            } catch (IOException e) {
                System.out.println("problem: = " + e.getMessage());
            }
        }

        private void findAll() {
            Book[] books = bookService.findAll();
            boolean arrayIsEmpty = true;
            for (Book book : books) {
                if (book != null) {
                    arrayIsEmpty = false;
                    System.out.println("user = " + book);
                }
            }
            if (arrayIsEmpty) {
                System.out.println("users empty");
            }
        }
    }
