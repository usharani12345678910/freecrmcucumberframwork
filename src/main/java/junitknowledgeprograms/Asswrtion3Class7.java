package junitknowledgeprograms;

import org.junit.Test;

import junit.framework.Assert;

public class Asswrtion3Class7 {
	@Test
	public void testFriendlistFacebook(){
		int actual_total_friends = 1000;
		int expected_total_friends = 100;
		if(actual_total_friends==expected_total_friends){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		try {
			Assert.assertEquals(expected_total_friends,actual_total_friends);}
		catch(Throwable err) {
			System.out.println("Expected is not same");		}
		System.out.println("Hello World");
	}
}
/*output:
 Fail
Expected is not same
Hello World*/
