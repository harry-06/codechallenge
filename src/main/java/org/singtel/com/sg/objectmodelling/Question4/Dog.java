/**
 * 
 */
package org.singtel.com.sg.objectmodelling.Question4;

import org.singtel.com.sg.objectmodelling.Question1.Animal;
import org.singtel.com.sg.objectmodelling.Question1.Soundable;

/**
 * @author hiranhari
 *
 */

public class Dog extends Animal implements Soundable{
	
	
	public void makeSound() {
		System.out.println("Woof, woof");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}
