/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

/**
 * Class Book
 * @author Sindhuja Valeti
 */
public class Book {
    private String title; 
    private String author;
    /**
     * Constructor with two arguments
     * @param title
     * @param author 
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    /**
     * getter method for title
     * @return book title of type string
     */
    public String getTitle() {
        return title;
    }
    /**
     * getter method for author
     * @return author of type string
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * overriding toString method
     * @return String of specified format
     */
    @Override
    public String toString()
    {
        return title +"\n"+author;
    }

}
