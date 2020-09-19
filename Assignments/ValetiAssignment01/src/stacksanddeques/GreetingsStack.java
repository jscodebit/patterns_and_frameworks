/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

/**
 *
 * @author Sindhuja Valeti
 */
public class GreetingsStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AStack<Character> greeting = new AStack<Character>();
        char Array[] = new char[100];
        greeting.push('H');greeting.push('a');greeting.push('p');
        greeting.push('p');greeting.push('y');greeting.push(' ');
        greeting.push('N');greeting.push('e');greeting.push('w');
        greeting.push(' ');greeting.push('Y');greeting.push('e');
        greeting.push('a');greeting.push('r');
        for(int i=greeting.size(); i>0;i--)
        {
            Array[i]=greeting.pop();
            
        }
        System.out.println(Array);
        
        
    }
    
}
