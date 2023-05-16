package junitknowledgeprograms;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class Assertion2Class6 {

	//ErrorCollector is an Inbuilt class in Java which has some methods to catch the Error
			@Rule 
			public ErrorCollector errCollector = new ErrorCollector();
			@Test
			public void testFriendlistFacebook(){
				int actual_total_friends = 100;
				int expected_total_friends = 1000;
				//Case-3
						// If you want to report the error in Junit and continue the execution surround it with a try Catch Block		
				System.out.println("A");
				try{
					System.out.println("Before Assert");
					Assert.assertEquals(actual_total_friends, expected_total_friends);
					System.out.println("After Assert");
				}
				catch(Throwable t){
					System.out.println(t);
					System.out.println("ERROR ENCOUNTERED in Total Friends List");
					//JavaCode Report the Error in Junit
					errCollector.addError(t);
				}
				System.out.println("B");
				try{
					System.out.println("Inside A=A try Block");
					Assert.assertEquals("A","A");
					System.out.println("A is equal to A");
					}
				catch(Throwable t){
					System.out.println("ERROR ENCOUNTERED as A is not Equal to B");
					//JavaCode Report the Error in Junit
					errCollector.addError(t);
					}
//				Assert.assertEquals("A","B");
				try{
					System.out.println("Inside A!=B try Block");
					Assert.assertEquals("A","B");
					System.out.println("A is equal to B");
					}
				catch(Throwable t){
					System.out.println(t);
					System.out.println("ERROR ENCOUNTERED as A is not Equal to A");
					//JavaCode Report the Error in Junit
					errCollector.addError(t);
					}
				System.out.println("Remaing Lines Executed");
						
		}}
/*output"
  A
Before Assert
junit.framework.AssertionFailedError: expected:<100> but was:<1000>
ERROR ENCOUNTERED in Total Friends List
B
Inside A=A try Block
A is equal to A
Inside A!=B try Block
junit.framework.ComparisonFailure: expected:<[A]> but was:<[B]>
ERROR ENCOUNTERED as A is not Equal to A
Remaing Lines Executed*/
