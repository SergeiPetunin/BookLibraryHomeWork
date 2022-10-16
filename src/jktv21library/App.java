/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21library;

import entity.Author;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Scanner;
import managers.BookManager;

/**
 *
 * @author pupil
 */
public class App {
    
    boolean repeat = true;
    public void run() {
        BookManager bm = new BookManager();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("0. Выход");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Поиск по номеру" );
            System.out.println("3. Изменить книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Список книг");
            System.out.println("6. Список авторов");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    bm.createBook();
                    break;
                case 2:
                    System.out.println("2. Поиск по номеру");
                    bm.searchBook();
                    break;
                case 3:
                    System.out.println("3. Изменить книгу");
                    bm.editBook();
                    break;
                case 4:
                    System.out.println("4. Вернуть книгу");
                    break;
                case 5:
                    System.out.println("5. Список книг");
                    bm.infoBook();
                    
                    System.out.println();
                    
                    break;
                case 6:
                    System.out.println("6. Список авторов");
                    break;
                default:
                    System.out.println("Выберете номер функции из списка");
            }
        }while(repeat);
        System.out.println("Пока");
        
    }
    
}
