/**
 * 
 */
package org.singtel.com.sg.objectmodelling.Question7;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.singtel.com.sg.objectmodelling.Question1.Animal;
import org.singtel.com.sg.objectmodelling.Question1.Bird;
import org.singtel.com.sg.objectmodelling.Question2.Duck;
import org.singtel.com.sg.objectmodelling.Question4.Dog;

/**
 * @author hiranhari
 *
 */
public class CountTest {
	
	
	
	/*for (Animal animal : new Animal[]{ new Cat(), new Dog()}) {
	    animal.
	}
	Animal[] animals = new Animal[4];
	
    animals[0] = new Bird();
    animals[1] = new Duck();
    animals[2] = new Fish();
    animals[3] = new Shark();
    animals[4] = new Clownfish();
    animals[5] = new Dog();*/
	
	public static void main(String[] args) {
        Animal[] animals = new Animal[4];
      
        animals[0] = new Dog();
        animals[1] = new Bird();
        animals[2] = new Duck();
        animals[3] = new Dog();
       
       int count =0;
        for (int i = 0; i < animals.length; i++) {
           Method[] methods= animals[i].getClass().getDeclaredMethods();
         if(Arrays.asList(methods).toString().contains("walk")){
        	 ++count;
        	  System.out.println("count of walk implementation>>"+count);
          } 
        }

        
    }
 
}
