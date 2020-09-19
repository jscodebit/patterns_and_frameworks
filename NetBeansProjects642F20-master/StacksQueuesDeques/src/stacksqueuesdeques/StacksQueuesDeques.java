/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksqueuesdeques;

import java.util.Stack;

/**
 *
 * @author cbadami
 */
import java.util.*;

public class StacksQueuesDeques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<String> myStack = new ArrayDeque<>();
        myStack.addFirst("Fun");
        myStack.addFirst("Is");
        myStack.addFirst("Science");
        myStack.addFirst("Computer");
        System.out.print(myStack.peekFirst() + " "); 
        myStack.removeFirst();
        System.out.print(myStack.peekFirst() + " "); 
        myStack.removeFirst();
        System.out.print(myStack.peekFirst() + " "); 
        myStack.removeFirst();
        System.out.print(myStack.peekFirst()); 
        myStack.removeFirst();
        System.out.println();
    }
    
}
