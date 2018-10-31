/**
 * 
 */
package org.singtel.com.sg.objectmodelling.Question2;

import org.singtel.com.sg.objectmodelling.Question1.Bird;
import org.singtel.com.sg.objectmodelling.Question1.Soundable;

/**
 * @author hiranhari
 *
 */
public class Duck  extends Bird implements Soundable{
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void makeSound() {
		System.out.println("Quack,quack");
		
	}

}
