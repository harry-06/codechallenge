/**
 * 
 */
package org.singtel.com.sg.objectmodelling.Question1;

/**
 * @author hiranhari
 *
 */
public class Bird extends Animal implements Flyable{

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying");
	}

	@Override
	public  void walk() {
		// TODO Auto-generated method stub
		System.out.println("I am walking");
	}

	public  void sing() {
		// TODO Auto-generated method stub
		System.out.println("I am Singing");
	}


}
