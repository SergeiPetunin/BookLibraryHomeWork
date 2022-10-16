/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
/**
 *
 * @author spetu
 */
public class History {
    private Book book;
    private Reader reader;
    private Date givenBook;
    private Date returnBook;

    public History() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getGivenBook() {
        return givenBook;
    }

    public void setGivenBook(Date givenBook) {
        this.givenBook = givenBook;
    }

    public Date getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(Date returnBook) {
        this.returnBook = returnBook;
    }

    @Override
    public String toString() {
        return "History{" 
                + "book=" + book 
                + ", reader=" + reader 
                + ", givenBook=" + givenBook 
                + ", returnBook=" + returnBook 
                + '}';
    }
    
    
}
