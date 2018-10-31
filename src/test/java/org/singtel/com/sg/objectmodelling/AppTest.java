package org.singtel.com.sg.objectmodelling;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.singtel.com.sg.objectmodelling.Question1.Bird;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
	// assigning the values
	   protected void setUp(){
		   System.setOut(new PrintStream(outContent));
	   }
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	questionOne();
    	
    }
    
  
    public void questionOne()
    {
  //Question1 testing
	assertTrue( true );
    Bird bird = new Bird();
	bird.walk();
	bird.fly();
	bird.sing();
	assertEquals("Iamwalking\n" +
            	"Iamflying\n" +
            	"IamSinging",outContent.toString().trim().replace(" ", ""));
    }
}