package com.learning.core.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private Date publicationDate;
    private String author;

    public Book(int bookId, String title, double price, String publicationDate, String author) throws ParseException {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publicationDate = new SimpleDateFormat("dd/MM/yyyy").parse(publicationDate);
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%d %s\n%.2f %s\n%s\n", bookId, title, price, author, new SimpleDateFormat("dd/MM/yyyy").format(publicationDate));
    }

    @Override
    public int hashCode() {
        return bookId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return bookId == book.bookId;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.author.compareTo(otherBook.author);
    }
}

public class D06P04 {
    public static void main(String[] args) throws ParseException {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1003, "Java Programming", 523.0, "23/11/1984", "Gilad Bracha"));
        books.add(new Book(1004, "Read C++", 0.0, "6/3/1984", "Mark J. Price"));
        books.add(new Book(1005, "Net Platform", 0.0, "19/11/1984", "Henry Harvin"));
        books.add(new Book(1001, "Python Learning", 715.0, "2/2/2020", "Martic C. Brown"));
        books.add(new Book(1002, "Modern Mainframe", 295.0, "19/5/1997", "Sharad"));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
