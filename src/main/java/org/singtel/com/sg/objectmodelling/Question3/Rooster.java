/**
 * 
 */
package org.singtel.com.sg.objectmodelling.Question3;

import org.singtel.com.sg.objectmodelling.Question1.Soundable;
import org.singtel.com.sg.objectmodelling.Question2.Chicken;

/**
 * @author hiranhari
 *
 */

//public class Rooster extends chicken implements  Soundable{
public class Rooster extends Chicken implements  Soundable{
	
	public void makeSound() {
		System.out.println("Cock-a-doodle-doo");
		
	}

}
