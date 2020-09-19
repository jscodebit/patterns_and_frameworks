/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Objects;

/**
 * Concrete class with name Student
 *
 * @author Sindhuja Valeti
 *
 */
public class Student {

    String name;
    int id;
/**
 * Constructor with two arguments
 * @param name holds the name of student
 * @param id holds Student id
 */
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
/**
 * getter method for student name
 * @return student name
 */
    public String getName() {
        return name;
    }
/**
 * setter method for student name
 * @param name sets student name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * getter method for student id
 * @return student id
 */
    public int getId() {
        return id;
    }
/**
 * setter method for student id
 * @param id argument for setter method
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * Overriding equals method
 * @param o argument for equals method
 * @return Boolean value
 */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return id == student.id
                && Objects.equals(name, student.name);
    }
/**
 * Overriding hashCode method
 * @return hashCode of objects
 */
    @Override
    public int hashCode() {

        return Objects.hash(name, id);
    }

}
