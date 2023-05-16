package junitknowledgeprograms;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class Aeertion1Class5 {

	@Rule
	public ErrorCollector errCollector = new ErrorCollector();		
	@Test
	public void testFriendlistFacebook(){
		////int actual_total_friends = 100;
		////int expected_total_friends = 1000;
		System.out.println("Printing Before Assert Equals");
		try {
			Assert.assertEquals("Hello", "Abc");	}
		catch(Throwable e) {
			errCollector.addError(e);
			System.out.println(e);
		}
		System.out.println("Executed successfully");
	}		
}
/*output:
 * Printing Before Assert Equals
junit.framework.ComparisonFailure: expected:<[Hello]> but was:<[Abc]>
Executed successfully*/
