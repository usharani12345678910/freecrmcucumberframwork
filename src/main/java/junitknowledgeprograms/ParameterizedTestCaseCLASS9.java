package junitknowledgeprograms;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//Testing my Login functionality for 3 different Users with different data
//1st Step
@RunWith(Parameterized.class)
public class ParameterizedTestCaseCLASS9 {
//2nd Step
	//Declare Global Parameters
	public String username; 
	public String password;
	public int pincode;
//3rd Step	
	//Constructor of this Class with same no of Parameters present in Global level
	public ParameterizedTestCaseCLASS9 (String username, String password, int pincode){
		//Assigning my values to Global variables using "this" keyword
		System.out.println("Constructor"+" "+  username +" "+ password +" "+ pincode);
		this.username = username;
		this.password = password;
		this.pincode = pincode;
	}
//4th Step
	@Parameters
	//getData is a Static Method name which returns me an Object Array with reference to Collection Interface
	public static Collection<Object[]> getData(){
		System.out.println("Entering Collection Method");
		//rows-> No of times you want to repeat the test method
		//Cols-> No of Parameters you want to pass(username,password,pincode)
		Object[][] data = new Object[4][3];
		System.out.println("Object Array1");
		//1st Row
		data[0][0] = "testuser-1";
		data[0][1] = "password-1";
		data[0][2] =  560030;
		System.out.println("Object Array2");
		//2nd Row
		data[1][0] = "testuser-2";
		data[1][1] = "password-2";
		data[1][2] =  560095;
		System.out.println("Object Array3");
		//3rd Row
		data[2][0] = "testuser-3";
		data[2][1] = "password-3";
		data[2][2] =  560075;
		System.out.println("Object Array4");
		//4th Row
		data[3][0] = "testuser-4";
		data[3][1] = "password-4";
		data[3][2] =  560040;
		System.out.println("Exiting Collection Method");
		//Arrays.asList(data) will convert whole Object Array into Array List and return me the info
		return Arrays.asList(data);
	}
	@Test
	public void testRegister(){	
		System.out.println("Test Method");
		System.out.println("Testing registration--"+ username +" -- "+ password+" -- "+ pincode	);
	}

}
