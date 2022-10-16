/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author spetu
 */
public class Book {
    
    private String title;
    private Author[] authors;
    private int releaseYear;
    
    public Book() {
    }

    public Book(String title, Author[] authors, int releaseYear) {
        this.title = title;
        this.authors = authors;
        this.releaseYear = releaseYear;
    }
   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }
    
//    public Author getAuthor(int index) {
//        return authors[index];
//    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public void addAuthor(Author author) {
        // создаём копию authors с доплнительной ячейкой
        // в доп ячейку помещаем author
        // в authors кладём ссылку на новый массив.
        
        Author[] newAuthors = Arrays.copyOf(authors, authors.length + 1);
        newAuthors[newAuthors.length-1] = author;
        authors = newAuthors;
    }
    
    @Override
    public String toString() {
        
        return "#Book {\n" 
                + "\t\tTitle: " + title 
                + "\n\t\tReleaseYear: " + releaseYear
                + "\n\t\tAuthors:" + Arrays.toString(authors)
                + "\n}";
    }
    
    
}
