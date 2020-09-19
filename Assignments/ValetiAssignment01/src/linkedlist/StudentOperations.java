/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.*;
import java.io.*;

/**
 * StudentOperations class
 * @author Sindhuja Valeti
 */
public class StudentOperations {

    private LinkedList<Student> studentList;
    /**
     * no argument constructor
     */
    public StudentOperations() {
        studentList = new LinkedList<Student>();
    }
     /**
      * getter method for student list
      * @return returns student list of type LinkedList
      */
    public LinkedList<Student> getStudentList() {
        return studentList;
    }
    /**
     * Method to add students to student list
     * @throws Exception throws exception if file is not found
     */
    public void addStudents() throws Exception {

        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNext()) {
            String a = sc.nextLine();
            int c = sc.nextInt();
            String b = sc.nextLine();
            Student stuobject = new Student(a, c);
            studentList.add(stuobject);
        }

    }
    /**
     * method to remove duplicates in the list
     */
    public void removeDuplicates() {

        for (int i = 0; i < studentList.size(); i++) {
            Student s1 = studentList.get(i);
            ListIterator<Student> itr = studentList.listIterator(i + 1);
            while (itr.hasNext()) {
                Student s2 = itr.next();
                if (s1.equals(s2)) {
                    itr.remove();
                }
            }

        }

    }
    /**
     * method to display duplicate names
     * @param i parameter of type iterator
     * @return string that contains duplicate names
     */
    public String displayDuplicatesNamesByRecursion(Iterator<Student> i) {
        Set<Student> studentSet = new HashSet();

        Set<Student> duplicateSet = new HashSet();

        StringBuilder names = new StringBuilder();

        while (i.hasNext()) {
            Student st =  i.next();
            if (studentSet.contains(st)) {
                duplicateSet.add(st);
            } else {
                studentSet.add(st);
            }
        }

        for (Student s : duplicateSet) {
            names.append(s.getName()).append(", ");
        }

        return names.toString();

    }
}
