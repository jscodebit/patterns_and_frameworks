/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.*;
/**
 * class StudentDriver
 * @author Sindhuja Valeti
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        StudentOperations stuOperationsOne = new StudentOperations();
        StudentOperations stuOperationsTwo = new StudentOperations();
        stuOperationsOne.addStudents();
        stuOperationsTwo.addStudents();
        System.out.println("List one: ");
        displayData(stuOperationsOne.getStudentList());
        stuOperationsOne.removeDuplicates();
        System.out.println("List one without duplicates: ");
        displayData(stuOperationsOne.getStudentList());
        System.out.println("List two: ");
        displayData(stuOperationsTwo.getStudentList());
        System.out.println("List two duplicate names: ");
        System.out.println(stuOperationsTwo.
         displayDuplicatesNamesByRecursion(
        stuOperationsTwo.getStudentList().iterator()));
    }
    /**
     * method to display student list
     * @param studentList argument of type linked list
     */
    public static void displayData(LinkedList<Student> studentList) {
        System.out.print("{");
        for (Student eachStudent : studentList) {
            System.out.println(eachStudent.getId() + ", " + eachStudent.getName());
        }
        System.out.println("}");
    }

}
