/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2movies;

/**
 *
 * @author cbadami
 */
import java.io.*;
import java.util.*;

public class Week2Movies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("Movie data.txt");
        Scanner scan = new Scanner(inFile);
        ArrayList<String> movieNames = new ArrayList<>();
        String line;
        String name;
       
        while (scan.hasNext()){
            line = scan.nextLine();
            //System.out.println(line.indexOf(" ") + " " + line.indexOf("("));
            movieNames.add(extractName(line));
            //movieNames.add(line);
        }
        
        LinkedList<String> links = new LinkedList<>();
        
        links.addAll(movieNames);
        System.out.println("Linked List from toString Method:");
        System.out.println(links);
        for (String s : links){
            System.out.println(s);
        }
        
        System.out.println("\nLinked List in outer pair order (1,100,2,99...)");
        for (int i=0; i<50; i++){
            System.out.println(links.removeFirst());
            System.out.println(links.removeLast());
        }
        
    }
    
    public static String extractName(String line){
        String name = line.substring(line.indexOf(" "),line.indexOf("("));
        return name;
    }
    
}
