/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Sindhuja Valeti
 */
public class LinkedblockingQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int capacity = 5;
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(capacity);
        queue.add(1);
        System.out.println("Inserted one element, remaining capacity: " + queue.remainingCapacity());
        queue.add(2);
        System.out.println("Inserted two elements, remaining capacity: " + queue.remainingCapacity());
        queue.add(2);
        System.out.println("Inserted three elements, remaining capacity: " + queue.remainingCapacity());
        queue.add(3);
        System.out.println("Inserted four elements, remaining capacity: " + queue.remainingCapacity());
        queue.add(3);
        System.out.println("Inserted five elements, remaining capacity: " + queue.remainingCapacity());
        System.out.println();
        System.out.println("Trying to insert 6th element using offer() :");
        System.out.println(queue.offer(6, 5, TimeUnit.SECONDS));
        System.out.println();
        System.out.println("Trying to insert 6th element using add()");
        try {
            System.out.println(queue.add(6));
        } catch (Exception e) {
            System.out.println("Exception : " + e);

        }
        System.out.println();
        System.out.println("By using offer method to add 6th element waiting for time interval of"
                + " 5 seconds, a boolean value is returned as False " + "\n"
                + "By using add method, it throws an exception saying Queue is full");
        System.out.println();
        System.out.println("Displaying duplicate elements: ");
        Iterator<Integer> itr = queue.iterator();
        Set<Integer> originalSet = new HashSet();
        Set<Integer> duplicateSet = new HashSet();
        while (itr.hasNext()) {
            Integer i = itr.next();
            if (originalSet.contains(i)) {
                duplicateSet.add(i);
            } else {
                originalSet.add(i);
            }
        }

        for (Integer b : duplicateSet) {
            System.out.println(b);
        }
        System.out.println();
        System.out.println("Invoking poll() and remove() methods :");
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println();
        System.out.println("Making queue object empty :");
        queue.removeAll(queue);
        System.out.println(queue);
        System.out.println();
        System.out.println("Invoking peek() and element() methods :");
        System.out.println(queue.peek());
        try {
            System.out.println(queue.element());
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        System.out.println();
        System.out.println("poll() method retrieved and removed the head of the queue which is '1', it will return null if the queue is empty.");
        System.out.println("remove() method retrieved and removed the head of the queue which is '2' this time.");
        System.out.println();
        System.out.println("We made the queue object empty now. ");
        System.out.println();
        System.out.println("peek() method displayed 'null' because we made the queue object empty, else it will retrieve the head of the queue");
        System.out.println("element() method gave 'NoSuchElementException' because the queue is empty ");

    }

}
