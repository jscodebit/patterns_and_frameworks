/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.*;

/**
 * Class AStack
 *
 * @author Sindhuja Valeti
 * @param <E>
 */
public class AStack<E> {

    private ArrayDeque<E> myStack;

    /**
     * No argument constructor that initializes myStack
     */
    public AStack() {
        myStack = new ArrayDeque<E>();
    }

    /**
     * method to push elements to Stack
     *
     * @param element parameter of type E
     */
    public void push(E element) {
        myStack.push(element);
    }

    /**
     * method to pop elements from stack
     *
     * @return returns elements of type E
     */
    public E pop() {
        return myStack.pop();
    }

    /**
     * method that retrieves the top element in stack
     *
     * @return element of type E
     */
    public E peek() {
        return myStack.peek();
    }

    /**
     * method that gives stack size
     *
     * @return size of type int
     */
    public int size() {
        return myStack.size();
    }

    /**
     * method to know if stack is empty or not
     *
     * @return Boolean value
     */
    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    /**
     * Iterator method on stack
     * @return elements of type iterator
     */
    public Iterator<E> iterator() {
        return myStack.iterator();
    }
}
