/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



/**
 *
 * @author cbadami
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Ernie");
        System.out.println(myList);
        System.out.println(myList.add("Bert"));
        System.out.println(myList);
        ArrayList<String> s = new ArrayList<>();
        s.add("BigBird");
        s.add("Kermit");
        s.add("Oscar");
        myList.addAll(s);
        System.out.println(myList);
        System.out.println(myList.remove());
        System.out.println(myList);
        
        Iterator<String> itr = myList.iterator();
        
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //Will throw exception
//        while (true){
//            System.out.println(itr.next());
//        }

    }
    
}
