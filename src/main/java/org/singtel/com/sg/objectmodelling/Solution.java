package org.singtel.com.sg.objectmodelling;

import org.singtel.com.sg.objectmodelling.Question1.Bird;
import org.singtel.com.sg.objectmodelling.Question2.Chicken;
import org.singtel.com.sg.objectmodelling.Question2.Duck;

/**
 * Hello world!
 *
 */
public class Solution 
{
    public static void main( String[] args )
    {
    	System.out.println("Question1 output:");
   	 	 Bird bird = new Bird();
         bird.walk();
         bird.fly();
         bird.sing();
         
         
       //Question 2
         System.out.println("Question2 output:");
        Duck duck = new Duck();
        Chicken chicken =new Chicken();
        duck.swim();
        duck.makeSound();
        chicken.makeSound();
    }
}
