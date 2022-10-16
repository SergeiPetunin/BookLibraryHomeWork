/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Author;
import entity.Book;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BookManager {
    Scanner scanner = new Scanner(System.in);
    Book[] books = new Book[0];
    Author[] authors = new Author[0];
    
    
    public Book createBook(){
        Book book = new Book();
        System.out.println("Введите название: ");
        book.setTitle(scanner.nextLine());
        System.out.println("Год создания: ");
        book.setReleaseYear(scanner.nextInt());
        System.out.println("Введите число авторов: ");
        int countAuthorsInBook = scanner.nextInt();
        scanner.nextLine();
        book.setAuthors(createAuthors(countAuthorsInBook));
        Book[] newBooks = Arrays.copyOf(this.books, this.books.length+1);
        newBooks[newBooks.length-1] = book;
        this.books = newBooks;
        return book;
    }
    
    private Author[] createAuthors(int countAuthorsInBook){
        Author[] authors = new Author[countAuthorsInBook];
        for(int i=0; i< countAuthorsInBook;i++){
            Author author = new Author();
            System.out.println("Имя афтора"+(i+1)+": ");
            author.setFirstname(scanner.nextLine());
            System.out.print("Фамилия афтора"+(i+1)+": ");
            author.setLastname(scanner.nextLine());
            System.out.print("Год рождения: ");
            author.setBirthYear(scanner.nextInt());
            scanner.nextLine();
            authors[i] = author;
            
            
        }
        return authors;
    }
//--------поиск по названию   
//    public void searchBook(String title) {
//        System.out.println("Введите название книги: ");
//        title = scanner.nextLine();
//        for (Book book : books) {
//            //System.out.println(newBooks[i]);
//            if (title.equals(book.getTitle())) {
//                System.out.println(book);
//            }
//        }
//    }
//--------поиск по индексу 
    public void searchBook() {
        System.out.println("Введите номер книги: ");
        int index = scanner.nextInt();
        for (int i = 0; i < books.length; i++) {
            if ((index-1) == i) {
               System.out.println("No: " + index + " | " + books[i]); 
            }
        }
    }
    
    public void editBook() {
        
    System.out.println("Введите номер книги: ");
        int index = scanner.nextInt()-1;
        scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (index == i) {
                String str;
                
                System.out.println("Хотите изменить название книги: y|n? ");
                str = scanner.nextLine();
                if(str.equals("y")) {
                    System.out.println("Введите название книги: ");
                    books[index].setTitle(scanner.nextLine());
                }
                
                System.out.println("Хотите изменить Год создания: y|n? ");
                str = scanner.nextLine();
                if(str.equals("y")) {
                    System.out.println("Год создания: ");
                    books[index].setReleaseYear(scanner.nextInt());
                    scanner.nextLine();
                }
                
                System.out.println("Хотите изменить авторов: y|n? ");
                str = scanner.nextLine();
                if(str.equals("y")){
                    
                    System.out.println("Хотите изменить количество авторов: y|n? ");
                    str = scanner.nextLine();
                    
                    if(str.equals("y")) {   
                            System.out.println("Введите количество авторов: ");
                            int countAuthorsInBook = scanner.nextInt();
                            scanner.nextLine();
                            int authorsCount = books[index].getAuthors().length;
                            if(countAuthorsInBook > authorsCount) {
                                
                                for (int j = authorsCount; j < countAuthorsInBook; j++) {
                                    Author author = new Author();
                                    books[index].addAuthor(author);
                                }
                                
                                Author[] authors2 = Arrays.copyOf(books[index].getAuthors(),countAuthorsInBook);
                                System.out.println(Arrays.toString(authors2));
                                
                                for (int j = 0; j < countAuthorsInBook; j++) {
                                    
                                        System.out.println("Изменить: " + (j+1) + " автора y|n?");
                                        str = scanner.nextLine();
                                        if(str.equals("y")) {
                                            System.out.println("Изменить имя :"+ (j+1)+ " автора y|n?");
                                            str = scanner.nextLine();
                                            if(str.equals("y")) {
                                                System.out.println("Введите имя: ");
                                                authors2[j].setFirstname(scanner.nextLine());
                                            }

                                            System.out.println("Изменить Фамилию:"+ (j+1)+ " автора y|n?");
                                            str = scanner.nextLine();
                                            if(str.equals("y")) {
                                                System.out.println("Введите фамилию: ");
                                                authors2[j].setLastname(scanner.nextLine());
                                            }

                                            System.out.println("Изменить Дату рождения: "+ (j+1)+ " автора y|n?");
                                            str = scanner.nextLine();
                                            if(str.equals("y")) {
                                                System.out.println("Введите Дату: ");
                                                authors2[j].setBirthYear(scanner.nextInt());
                                                scanner.nextLine();
                                            }
                                        }  
                                }
                                books[index].setAuthors(authors2);
                            }
                            if(countAuthorsInBook < authorsCount) {
                                Author[] authors2 = Arrays.copyOf(books[index].getAuthors(),authorsCount);
                                System.out.println("Кого удалить?");
                                for (int j = 0; j < authors2.length; j++) {
                                    System.out.println(Arrays.toString(authors2));
                                    System.out.println("Выберете номер автора: ");
                                    index = scanner.nextInt()-1;
                                    scanner.nextLine(); 
                                    
                                    //authors2[index] = null;
                                }
                                books[index].setAuthors(authors2);   
                            }
                    }else{
                        int authorsCount = books[index].getAuthors().length;
                        for (int j = 0; j < authorsCount; j++) {
                            
                            Author[] authors2 = Arrays.copyOf(books[index].getAuthors(),authorsCount);
                            System.out.println(Arrays.toString(authors2));
                            
                            System.out.println("Изменить: " + (j+1) + " автора y|n?");
                            str = scanner.nextLine();
                            if(str.equals("y")) {
                                System.out.println("Изменить имя :"+ (j+1)+ " автора y|n?");
                                str = scanner.nextLine();
                                if(str.equals("y")) {
                                    System.out.println("Введите имя: ");
                                    authors2[j].setFirstname(scanner.nextLine());
                                }

                                System.out.println("Изменить Фамилию:"+ (j+1)+ " автора y|n?");
                                str = scanner.nextLine();
                                if(str.equals("y")) {
                                    System.out.println("Введите фамилию: ");
                                    authors2[j].setLastname(scanner.nextLine());
                                }

                                System.out.println("Изменить Дату рождения: "+ (j+1)+ " автора y|n?");
                                str = scanner.nextLine();
                                if(str.equals("y")) {
                                    System.out.println("Введите Дату: ");
                                    authors2[j].setBirthYear(scanner.nextInt());
                                    scanner.nextLine();
                                }
                            }
                        books[index].setAuthors(authors2);
                        }
                    }
                }
            }
        }//выбираем указанную книгу for
    }
    
    public void infoBook() {
        
        for (int i = 0; i < books.length; i++) {
            System.out.println("No: " + (i+1) + " | " + books[i] + "\n");
        }
    }
    
    
}
