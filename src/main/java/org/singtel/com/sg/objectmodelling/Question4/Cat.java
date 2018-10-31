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
public class Cat extends Animal implements Soundable{

	public void makeSound() {
		System.out.println("Meow”");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}
