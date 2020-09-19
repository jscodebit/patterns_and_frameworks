/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.*;
import java.io.*;

/**
 *
 * @author Sindhuja Valeti
 */
public class BooksStack {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        AStack<Book> books = new AStack<Book>();
        Scanner sc = new Scanner(new File("books.txt"));
        System.out.println("All books in the stack from top to bottom");
        System.out.println("-------------------------------------");
        while (sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            Book b1 = new Book(a, b);
            books.push(b1);
        }

        Iterator<Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()) {
            Book obj = bookIterator.next();
            System.out.println(obj);
            System.out.println("-------------------------------------");
        }
        System.out.println();
        System.out.println();
        System.out.println("Stack after removing book with name Fantastic Beasts: The Crimes of Grindelwald");
        System.out.println("-------------------------------------");

        Iterator<Book> bookIterator1 = books.iterator();
        while (bookIterator1.hasNext()) {
            Book bk1 = bookIterator1.next();
            if (bk1.getTitle().contains("Fantastic Beasts: The Crimes of Grindelwald")) {
                books.pop();
            } else {
                System.out.println(bk1);
                System.out.println("-------------------------------------");
            }
           

        }
        System.out.println();
    }
}
